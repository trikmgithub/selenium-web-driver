import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ClickRightDoubleClicks {
    public static void main(String[] args) {
        //initialize driver
        WebDriver driver = new ChromeDriver();

        //adding implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //launch url
        driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");

        //identify an element with xpath for click
        WebElement elementCLick = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[1]"));

        //object of Actions class to perform click, double click and right click
        Actions actions = new Actions(driver);

        //one click
        actions.moveToElement(elementCLick).click().build().perform();

        //identify an element with xpath for get text
        WebElement textAfterClick = driver.findElement(By.xpath("//*[@id=\"welcomeDiv\"]"));

        //print text after click
        System.out.println("Text after click: >>> " + textAfterClick.getText() + " <<<");

        //identify an element with xpath for double click
        WebElement elementDoubleClick = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[3]"));

        //double click
        actions.moveToElement(elementDoubleClick).doubleClick().build().perform();

        //identify an element with xpath for get text
        WebElement textAfterDoubleClick = driver.findElement(By.xpath("//*[@id=\"doublec\"]"));

        //print text after double click
        System.out.println("Text after double click: >>> " + textAfterDoubleClick.getText() + " <<<");

        //identify an element with xpath for right click
        WebElement elementRightClick = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[2]"));

        //right-click
        actions.moveToElement(elementRightClick).contextClick().build().perform();

        //quit driver
        driver.quit();
    }
}
