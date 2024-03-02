import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExecuteJavascript {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/Victor Gonzalez/Desktop/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        //Da click al modal
        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();

        //Se obtiene el elemento del button close
        WebElement closeButton = driver.findElement(By.id("close-button"));

        //Se genera un script de javascript para que de click al boton de close
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", closeButton);


        driver.quit();
    }
}
