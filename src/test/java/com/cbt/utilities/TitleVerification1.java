package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification1 {
    public static void main(String[] args) {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        WebDriver driver=BrowserFactory.createDriver("chrome");

        List<String> titleList= new ArrayList<>();
        List<Boolean> isUrlStartsWith= new ArrayList<>();

        for (String url:urls){
            driver.get(url);
            titleList.add(driver.getTitle());
        }
        BrowserUtils.wait(2);

        for (int i = 0; i <titleList.size()-1 ; i++) {

            StringUtility.verifyEquals(titleList.get(i),titleList.get(i+1));
        }
        StringUtility.verifyEquals(titleList.get(0),titleList.get(2));
        BrowserUtils.wait(2);

        for (String eachUrl: urls) {

            isUrlStartsWith.add(eachUrl.startsWith("http://practice.cybertekschool.com"));
        }
        System.out.println("isUrlStartsWith = " + isUrlStartsWith);

        BrowserUtils.wait(2);
        driver.quit();
    }
}
