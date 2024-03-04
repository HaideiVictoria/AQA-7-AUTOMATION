package home_work.task1;

import driver_factory.DriverSetUp2;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class task1 {/*Написать программу, которая будет открывать четыри различных страниц в новых окнах:
https://zoo.kiev.ua/
https://www.w3schools.com/
https://taxi838.ua/ru/dnepr/
https://klopotenko.com/

Прописать цикл, который будет переключаться поочередно через все страницы,
для каждой страницы выводить в консоль название и ссылку на эту страницу.
И будет закрывать ту страницу в названии которой есть слово зоопарк.*/


    public static void openLinkInNewTab(WebDriver driver, String url){
        Set<String> set1 = driver.getWindowHandles();
        ((JavascriptExecutor)driver).executeScript("window.open()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        Set<String> set2 = driver.getWindowHandles();
        set2.removeAll(set1);
        String windowDescriptor2 = set2.iterator().next();
        driver.switchTo().window(windowDescriptor2);
        driver.get(url);
    }

    public static void main(String[] args) {
        WebDriver driver = DriverSetUp2.setUpDriver();
        driver.get("https://zoo.kiev.ua/");
        openLinkInNewTab(driver, "https://www.w3schools.com/");
        openLinkInNewTab(driver, "https://taxi838.ua/ru/dnepr/");
        openLinkInNewTab(driver, "https://klopotenko.com/");
        Set<String>windowHandles=driver.getWindowHandles();

        for (String windowId :windowHandles){
            driver.switchTo().window(windowId);
            System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl());

        }

        driver.quit();
    }
    }

