import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyOperation {
    public static void main(String[] args) {
        //initialize driver
        WebDriver driver = new ChromeDriver();

        //adding implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //launch url
        driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");

        //identify the first input box with xpath locator
        WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"fullname\"]"));

        //object of Actions class to perform key operations
        Actions actions = new Actions(driver);

        //moving to an input box and click on it
        actions.moveToElement(inputElement).click().build().perform();

        //holding shift key (bolder text)
        actions.keyDown(Keys.SHIFT);

        //typing text (unholding shift key)
        actions.sendKeys("Selenium").keyUp(Keys.SHIFT).build().perform();

        //print text enter
        System.out.println("Text enter: " + inputElement.getAttribute("value"));


        //quit driver
        driver.quit();
    }
}
