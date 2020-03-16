package com.scale.assignment;

import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlScript;
import com.scale.assignment.utils.StringUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App
{
    private static final String base_url="https://www.google.com/search?q=";
    public static void main( String[] args )
    {
        StringUtils stringUtils = new StringUtils();
        String searchString=stringUtils.concat(args);

        WebClientHelper webClientHelper = new WebClientHelper();
        Map<String,Integer> LibraryNameOccurrenceCountMap = new LinkedHashMap<>();


        String page_url = base_url+searchString;
        HtmlPage page1 = webClientHelper.getHtmlPage(page_url,false,true);
        if(page1==null){
        //may be add a message here
            return;
        }
        //Using XPath to get the first result in Google query
        //*[@id="search"] will give me all search results
        //

        HtmlElement element = (HtmlElement)page1.getByXPath("//*[@id=\"search\"]").get(0);
        List<HtmlAnchor> links =  element.getByXPath("//a[descendant::h3]");
        System.out.println("Number of links extracted "+links.size());


        for(HtmlAnchor pageUrl:links){

            HtmlPage htmlPage = webClientHelper.getHtmlPage( pageUrl.getHrefAttribute(),true,true);
            List<HtmlScript> scriptTags = htmlPage.getByXPath("/html/head/script");


            for(HtmlScript htmlScript:scriptTags){
                if(htmlScript.getSrcAttribute()==null||htmlScript.getSrcAttribute().isEmpty()){
                    continue;
                }
                String href = htmlScript.getSrcAttribute();
                String[] hrefStrings = href.split("/");
                String javascriptLibraryName = hrefStrings[hrefStrings.length-1];
                if(LibraryNameOccurrenceCountMap.containsKey(javascriptLibraryName)){
                    //increment value
                    Integer previousOccurrence = LibraryNameOccurrenceCountMap.get(javascriptLibraryName);
                    LibraryNameOccurrenceCountMap.put(javascriptLibraryName,previousOccurrence+1);
                }
                else {
                    //this is first time it is seen
                    LibraryNameOccurrenceCountMap.put(javascriptLibraryName,1);
                }
            }
        }

        LibraryNameOccurrenceCountMap.forEach(
            (key,value)->{
                System.out.println("library: "+key+"   occurrence: "+value);
            });


    }




}
