package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UpdatedDropdown {

    public void getDropDown() throws InterruptedException {

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

    }
}
