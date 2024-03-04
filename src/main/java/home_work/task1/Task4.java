package home_work.task1;

import driver_factory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task4 {/*Написать программу, которая повторит действия на видео “HW_AUTOMATION_LESSON_3_UPDATE.mp4”.
http://www.automationpractice.pl/index.php*/

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("http://www.automationpractice.pl/index.php");
        driver.findElement(By.id("search_query_top")).sendKeys("Printed Chiffon Dress");
        driver.findElement(By.cssSelector(".btn.btn-default.button-search")).click();
        driver.findElement(By.linkText("Printed Chiffon Dress")).click();
        new Select(driver.findElement(By.id("group_1"))).selectByVisibleText("M");
        driver.navigate().refresh();
        driver.findElement(By.id("add_to_cart")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span")).click();
        driver.findElement(By.xpath("(//a[@title='Women'])[1]")).click();
        driver.navigate().refresh();
        driver.findElement(By.id("search_query_top")).sendKeys("Faded Short");
        driver.findElement(By.cssSelector(".btn.btn-default.button-search")).click();
        driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
        new Select(driver.findElement(By.id("group_1"))).selectByVisibleText("L");
        driver.navigate().refresh();
        driver.findElement(By.id("add_to_cart")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span")).click();
        Actions actions = new Actions(driver);
        driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a")).click();
        Thread.sleep(1500);

        driver.quit();


    }
}
