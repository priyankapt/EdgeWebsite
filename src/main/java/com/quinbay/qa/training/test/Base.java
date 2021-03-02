package com.quinbay.qa.training.test;

import com.quinbay.qa.training.Actions.DemoPageActions;
import com.quinbay.qa.training.Actions.HomePageActions;
import com.quinbay.qa.training.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
public class Base {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.edgewordstraining.co.uk/demo-site/");
        Thread.sleep(3000);
        DemoPageActions aaa = new DemoPageActions(driver);
        aaa.searchForAnItem("tshirt");

    }}


