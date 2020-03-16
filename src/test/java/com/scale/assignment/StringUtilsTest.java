package com.scale.assignment;


import com.scale.assignment.utils.StringUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class StringUtilsTest {

    StringUtils utils;


    @Before
    public void init(){
        utils=new StringUtils();
    }

    @Test
    public void TestConcatenation(){

        String result = utils.concat(new String[]{"hello", "world"});

        /*TODO: this is a bug. in context of google search it is may not cause a problem but an elegant
            solution would be to remove the space in the beginning*/

        Assert.assertEquals(" hello world",result);
    }

}
