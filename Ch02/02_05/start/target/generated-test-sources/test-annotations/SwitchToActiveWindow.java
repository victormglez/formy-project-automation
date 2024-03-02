import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        //Obtener el handle de la página princial
        String originalHandle = driver.getWindowHandle();

        //Iterar para cambiar a otra ventana
        for(String handle1 : driver.getWindowHandles()){
            driver.switchTo().window(handle1);
        }

        //Para regresar a la página principal
        driver.switchTo().window(originalHandle);

        driver.quit();
    }
}
