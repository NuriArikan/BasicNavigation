package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.BrowserUtils;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) {

        chromeTest();
        safariTest();
        fireFoxTest();
    }

    private static void chromeTest() {

        WebDriver driver = BrowserFactory.createDriver("chrome");
        driver.get("https://google.com");
        String titleGoogle = driver.getTitle();
        BrowserUtils.wait(2);

        driver.navigate().to("https://etsy.com");
        String titleEtsy = driver.getTitle();
        BrowserUtils.wait(2);

        driver.navigate().back();
        String firstAndSecond = driver.getTitle();
        StringUtility.verifyEquals(titleGoogle,firstAndSecond);
        BrowserUtils.wait(2);

        driver.navigate().forward();
        String secondAndSecond = driver.getTitle();
        StringUtility.verifyEquals(titleEtsy,secondAndSecond);

        BrowserUtils.wait(2);
        driver.quit();
    }
    private static void safariTest() {

        WebDriver driver = BrowserFactory.createDriver("safari");
        driver.get("https://google.com");
        String titleGoogle = driver.getTitle();
        BrowserUtils.wait(2);

        driver.navigate().to("https://etsy.com");
        String titleEtsy = driver.getTitle();
        BrowserUtils.wait(2);

        driver.navigate().back();
        String firstAndSecond = driver.getTitle();
        StringUtility.verifyEquals(titleGoogle,firstAndSecond);
        BrowserUtils.wait(2);

        driver.navigate().forward();
        String secondAndSecond = driver.getTitle();
        StringUtility.verifyEquals(titleEtsy,secondAndSecond);

        BrowserUtils.wait(2);
        driver.quit();
    }

    private static void fireFoxTest() {

        WebDriver driver = BrowserFactory.createDriver("firefox");
        driver.get("https://google.com");
        String titleGoogle = driver.getTitle();
        BrowserUtils.wait(2);

        driver.navigate().to("https://etsy.com");
        String titleEtsy = driver.getTitle();
        BrowserUtils.wait(2);

        driver.navigate().back();
        String firstAndSecond = driver.getTitle();
        StringUtility.verifyEquals(titleGoogle,firstAndSecond);
        BrowserUtils.wait(2);

        driver.navigate().forward();
        String secondAndSecond = driver.getTitle();
        StringUtility.verifyEquals(titleEtsy,secondAndSecond);

        BrowserUtils.wait(2);
        driver.quit();
    }
}
