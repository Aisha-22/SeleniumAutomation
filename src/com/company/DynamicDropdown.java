package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.Selector;

public class DynamicDropdown {

    public void runDymanicDropdown() throws InterruptedException {

        // set driver path using setProperty method
        System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");

        // Initialize browser
        WebDriver driver = new ChromeDriver();
        // Load website
        driver.get("https://www.spicejet.com/");

        //Index concepts
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
        driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1']/option[14]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")).click();
        driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1 > option:nth-child(20)")).click();
        driver.findElement(By.id("flightSearchContainer")).click();


    }
}
