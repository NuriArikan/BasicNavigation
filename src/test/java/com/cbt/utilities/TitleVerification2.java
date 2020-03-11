package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    public static void main(String[] args) {

        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com/", "https://walmart.com" ,
                "https://westelm.com/");

        WebDriver driver= BrowserFactory.createDriver("chrome");

        for (String eachUrls: urls){

            driver.get(eachUrls);
            BrowserUtils.wait(2);
            if(eachUrls.contains(driver.getTitle().replace(" ","").toLowerCase())){
                System.out.println("TEST PASSED");
            }else{
                System.out.println("TEST FAILED");
                System.out.println("url = "+eachUrls );
                System.out.println("title = "+ driver.getTitle());
            }
        }
        BrowserUtils.wait(2);
        driver.quit();
    }
}
