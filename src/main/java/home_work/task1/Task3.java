package home_work.task1;

import driver_factory.DriverSetUp2;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task3 {/*Написать метод который выводит сообщение об айди элемента,
значении тэга элемента , значении класса элемента,
значении атрибута name элемента, текста данного элемента,
а также о координатах центра контейнера данного элемента.*/
public static void webElement (WebDriver driver, String locator){
WebElement greenButton= driver.findElement(By.cssSelector(locator));

String greenButtonID= greenButton.getAttribute("Id");
String greenButtonTagName=greenButton.getTagName();
String greenButtonClass=greenButton.getAttribute("Class");
String greenButtonName=greenButton.getAttribute("Name");
String greenButtonText=greenButton.getText();


    Point greenButtonLocation=greenButton.getLocation();
    int centerX = greenButtonLocation.getX()+greenButton.getSize().getWidth() / 2;
    int centerY =greenButtonLocation.getY() +greenButton.getSize().getHeight() / 2;

    System.out.println("Information of elements GreenButton:");
    System.out.println("ID: " + greenButtonID);
    System.out.println("Tag: " + greenButtonTagName);
    System.out.println("Class " + greenButtonClass);
    System.out.println("Name: " + greenButtonName);
    System.out.println("Text: " + greenButtonText);
    System.out.println("Location: (" + centerX + ", " + centerY + ")");
}
    public static void main(String[] args) {


    WebDriver driver= DriverSetUp2.setUpDriver();
        driver.get("https://rozetka.com.ua/");
      webElement(driver, ".button_color_green");
   driver.quit();


}}
