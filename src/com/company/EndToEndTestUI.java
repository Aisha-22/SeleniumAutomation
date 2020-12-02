package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEndTestUI {

    public void runTestUI() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/"); // Open URL

//        End to end Automation using all UI Elements with Selenium
        //Handle Dynamic Dropdowns
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
        //ParentChild Xpath
        driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1']/option[11]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")).click();
        driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1'] /option[@value='HKG']")).click();

//        Handling CheckBox
        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();

//        Handling Calendar
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

//       Making sure the other Calendar is Disabled
        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

        {
            System.out.println("Its enabled");
            //Fail the Scrip
            Assert.assertTrue(false);
        }
        else
        {
            Assert.assertTrue(true);
        }
        Thread.sleep(2000L);

        //        Adding the passengers
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);

        Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        s.selectByValue("2");

        driver.findElement(By.id("divpaxinfo")).click();

//        Selecting the currency
        driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency'] /option[@value='USD']")).click();

//        Click the search button using cssSelector
//        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
        driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click(); //If you know the 'id' use #
        //Customized css
//        driver.findElement(By.cssSelector("input[value='Search']")).click();
        //Xpath
//        driver.findElement(By.xpath("//input[@value='Search']")).click();
    }
}
