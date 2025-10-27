import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDrop {
    public static void main(String[] args) {
        //initialize driver
        WebDriver driver = new ChromeDriver();

        //adding implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //launch url
        driver.get("https://www.tutorialspoint.com/selenium/practice/droppable.php");

        //identify source element for drag and drop
        WebElement sourceElement = driver.findElement(By.id("draggable"));

        //identify destination element for drag and drop
        WebElement targetElement = driver.findElement(By.id("droppable"));

        //object of Actions class to perform drag and drop
        Actions actions = new Actions(driver);

        //drag and drop
        actions.dragAndDrop(sourceElement, targetElement).build().perform();

        //identify element text after drag and drop
        WebElement text = driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));

        //print text after drag and drop
        System.out.println("Text after drag and drop: >>> " + text.getText() + " <<<");

        //quit driver
        driver.quit();
    }
}
