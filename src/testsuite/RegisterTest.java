package testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegisterTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }


    public String getTextFromElement(By by){
        WebElement actualTextMessageElement = driver.findElement(by);
        return actualTextMessageElement.getText();
    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        // Find Register link and click on Register link
        WebElement RegisterLink = driver.findElement(By.linkText("Register"));
        RegisterLink.click();
        clickOnElement(By.linkText("Register"));

        // This is from requirement
        String expectedMessage = "Register";

        // Find the welcome text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Register')]"));

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Register page", expectedMessage, actualMessage);

    }
    @Test
public void navigateToRegisterPage(){
        WebElement RegisterLink = driver.findElement(By.linkText("Register"));
        RegisterLink.click();
        clickOnElement(By.linkText("Register"));

        List radio = driver.findElements(By.name("Gender"));
        clickOnElement(By.name("Gender"));

      WebElement FirstnameField = driver.findElement(By.name("FirstName"));
     FirstnameField.sendKeys("TUSHAR");

        WebElement LastnameField = driver.findElement(By.name("LastName"));
        LastnameField.sendKeys("VIBHAKAR");

        WebElement DobField = driver.findElement(By.name("DateOfBirthDay"));
        DobField.sendKeys("3");

        WebElement DomField = driver.findElement(By.name("DateOfBirthMonth"));
        DomField.sendKeys("7");

        WebElement DoyField = driver.findElement(By.name("DateOfBirthYear"));
        DoyField.sendKeys("1978");

        WebElement EmailField = driver.findElement(By.id("Email"));
        EmailField.sendKeys("tvibhaker@gmail.com");

        WebElement pwField = driver.findElement(By.id("Password"));
        pwField.sendKeys("Unit123");

        WebElement cpField = driver.findElement(By.id("ConfirmPassword"));
        cpField.sendKeys("Unit123");

        WebElement Registerbutton = driver.findElement(By.id("register-button"));
        Registerbutton.click();





    }
}




