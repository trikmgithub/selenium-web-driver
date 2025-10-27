import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseHover {
    public static void main(String[] args) {
        //initialize driver
        WebDriver driver = new ChromeDriver();

        //adding implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //launch url
        driver.get("https://www.tutorialspoint.com/selenium/practice/menu.php#");

        //identify element with xpath for hover
        WebElement elementHover = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/nav/div/a"));

        //get color before hover
        String colorBeforeHover = elementHover.getCssValue("color");

        //print color before hover
        System.out.println("Color before hover: >>> " + colorBeforeHover + " <<<");


        //object of Actions class to perform hover
        Actions actions = new Actions(driver);

        //perform hover
        actions.clickAndHold(elementHover).build().perform();

        //get color after hover
        String colorAfterClickAndHold = elementHover.getCssValue("color");

        //print color after click and hold
        System.out.println("Color after hover: >>> " + colorAfterClickAndHold + " <<<");

        //quit driver
        driver.quit();

    }
}
