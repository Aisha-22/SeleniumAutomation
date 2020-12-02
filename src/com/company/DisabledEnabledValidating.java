package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DisabledEnabledValidating {

    public void runValidation() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);

        Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
//        s.selectByValue("2");
//        s.selectByIndex(6);
        s.selectByVisibleText("7");

        driver.findElement(By.id("divpaxinfo")).click();

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        //Validating if UI Elements are disabled or enabled with Attributes
        //Disabled - Return false
//        System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style").contains(""));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        //Enabled - Return true
//        System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        //getAttribute()
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style").contains(""));
        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

        {
            System.out.println("Its enabled");
            Assert.assertTrue(true);
        }
        else
        {
            //Fail the Scrip
            Assert.assertTrue(false);
        }
    }
}
