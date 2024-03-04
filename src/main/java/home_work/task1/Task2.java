package home_work.task1;

import driver_factory.DriverSetUp2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2 {/*Написать метод в параметры которого принимаются два ВебЭлемента.
метод выводит в консоль информацию какой из двух элементов располагается выше на странице,
какой из элементов располагается левее на странице,
а также какой из элементов занимает большую площадь.
Параметры метода могут также включать в себя другие аргументы, если это необходимо.*/

    public static void main(String[] args) {
        WebDriver driver= DriverSetUp2.setUpDriver();
        driver.get("https://rozetka.com.ua/");
        WebElement greenButton =driver.findElement(By.cssSelector(".button_color_green"));
        WebElement search =driver.findElement(By.cssSelector(".search-form__input.ng-untouched.ng-pristine.ng-valid"));


        int greenButtonX = greenButton.getLocation().getX();
        int greenButtonY = greenButton.getLocation().getY();

        int searchX = search.getLocation().getX();
        int searchY = search.getLocation().getY();
        int greenButtonWidth = greenButton.getSize().getWidth();
        int greenButtonHeight = greenButton.getSize().getHeight();

        int searchWidth =search.getSize().getWidth();
        int searchHeight =search.getSize().getHeight();

        if (greenButtonY < searchY) {
            System.out.println("GreenButton знаходиться вище");
        } else if (greenButtonY > searchY) {
            System.out.println("Поле Search знаходиться вище.");
        } else {
            System.out.println("GreenButton та Search знаходяться на одній висоті ");
        }

        if (greenButtonX < searchX) {
            System.out.println("GreenButton знаходиться лівіше");
        } else if (greenButtonX > searchX) {
            System.out.println("Поле Search знаходиться лівіше.");
        } else {
            System.out.println("GreenButton та Search знаходяться на одній висоті ");
        }

        int areaGreenButton =greenButtonHeight*greenButtonWidth;
        int areaSearch=searchHeight*searchWidth;

        if (areaGreenButton>areaSearch){
            System.out.println("GreenButton більший ніж  Search");
        } else if (areaGreenButton<areaSearch) {
            System.out.println("GreenButton менший ніж  Search");
        }else { System.out.println("GreenButton одинакові за розміром Search");



        }
    }
}
