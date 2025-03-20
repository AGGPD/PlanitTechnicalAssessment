package com.jupiter.cloud.planittesting.base;

import base.BasePage;
import com.jupiter.cloud.planittesting.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import static base.BasePage.delay;
import static utilites.Utility.setUtilityDriver;

public class BaseTest {
    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String JupiterToys_URL = "https://jupiter.cloud.planittesting.com/#/";

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication(){
        driver.get(JupiterToys_URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage ();
    }

    @AfterClass
    public void tearDown(){
        delay(3000);
        driver.quit();
    }
}
