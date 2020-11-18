package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChild {

    public void runParentChild() throws InterruptedException {

        // set driver path using setProperty method
        System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");

        // Initialize browser
        WebDriver driver = new ChromeDriver();
        // Load website
        driver.get("http://spicejet.com");

        //Index concepts
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
        driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1']/option[14]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")).click();
        /*ParentChild:
        To select from a list using ParentChild you need to use a single slash '/' and not a double slash '//'
         */
        driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1'] /option[@value='KQH']")).click();
        driver.findElement(By.id("flightSearchContainer")).click();

    }
}
