package com.scale.assignment;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import java.io.IOException;

public class WebClientHelper {

    WebClient webClient = new WebClient();

    public HtmlPage getHtmlPage(String search_string, boolean disableJavaScript, boolean disableCSS) {

        if(disableCSS){
            webClient.getOptions().setCssEnabled(false);
        }
        if(disableJavaScript){
            webClient.getOptions().setJavaScriptEnabled(false);
        }

        HtmlPage page1 = null;
        try {
            page1=webClient.getPage(search_string);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return page1;
    }
}
