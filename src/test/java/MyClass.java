import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;

public class MyClass {


    @Test

    public void  fileUploadTest() throws AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");


        driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\User\\Desktop\\test.txt");



    }

}
