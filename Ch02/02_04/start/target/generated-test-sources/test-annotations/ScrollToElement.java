import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/Victor Gonzalez/Desktop/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        //Creamos el WebElement del elemento al que queremos ir
        WebElement name = driver.findElement(By.id("name"));

        //Constructor para hacer que la página se diriga a cierto elemento
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Hello World");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/01/2020");

        driver.quit();
    }
}
