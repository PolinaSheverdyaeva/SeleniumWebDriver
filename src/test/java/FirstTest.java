import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import static org.junit.Assert.assertEquals;


public class FirstTest {

        @Test
        public void testFirst(){

                //System.setProperty("webdriver.chrome.driver","C:\\Users\\polina\\IdeaProjects\\java-webdriver-cucumber-current\\src\\test\\resources\\drivers\\chromedriver.exe");

                WebDriverManager.chromedriver().setup();

                WebDriver driver = new ChromeDriver();
                driver.get("https://www.selenium.dev/selenium/web/web-form.html");

                String title = driver.getTitle();
                assertEquals("Web form", title);

                driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

                WebElement textBox = driver.findElement(By.name("my-text"));
                WebElement submitButton = driver.findElement(By.cssSelector("button"));

                textBox.sendKeys("Selenium");
                submitButton.click();

                WebElement message = driver.findElement(By.id("message"));
                String value = message.getText();
                assertEquals("Received!", value);

                driver.quit();

        }
}
