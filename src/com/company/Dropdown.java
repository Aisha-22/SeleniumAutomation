package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Dropdown {

    private WebElement List;

    public void runSelect() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

//        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("https://www.spicejet.com/");
        Thread.sleep(2000L);

        System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        //Regular expressions - use '*' Identify any 'id' matching with the friendsandfamily
        driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
        //A method in Selenium to find if the checkbox is selected or not 'isSelected'
        System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

        //Count number of checkboxes
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

        /*
        In Selenium, the Select class provides the implementation of the HTML SELECT tag. A Select tag provides the helper methods with select and deselect options.
        As Select is an ordinary class, its object is created by the keyword New and also specifies the location of the web element.
         */
        driver.findElement(By.id("divpaxinfo")).click();

        Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        s.selectByValue("2");
        s.selectByIndex(6);
        s.selectByVisibleText("7");

    }

}
