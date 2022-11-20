package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends Utility {
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
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        // Find log in link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        clickOnElement(By.linkText("Log in"));

        // This is from requirement
        String expectedMessage = "Welcome, Please Sign In!";

        // Find the welcome text element and get the text
//       WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to login page",expectedMessage, actualMessage);

    }


    @Test
    public void verifyErrorMessageWithInvalidCredentials(){
        clickOnElement(By.linkText("Log in"));
        // Find the email field element and send the email
        WebElement emailField = driver.findElement(By.id("Email"));
        // Type email to email field
        emailField.sendKeys("test123@gmail.com");
        //sendTextToElement(By.id("Email"),"test123@gmail.com");

        // Find the password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("test123");
        sendTextToElement(By.name("Password"),"tes123");

        // Find the login button and click on it
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

    }

@Test
   public void lgoinSuccessfully(){
        clickOnElement(By.linkText("Log in"));
        WebElement emailField=driver.findElement(By.id("Email"));
        emailField.sendKeys("tvibhaker@gmail.com");

    WebElement passwordField = driver.findElement(By.name("Password"));
    passwordField.sendKeys("Tushar112");
    sendTextToElement(By.name("Password"),"Tushar112");

    WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
    loginButton.click();
    clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

    // by entering externally above Email and password , i can sucessfully login but showing error with above commands.



}



    @After
    public void testDown(){
    //    closeBrowser();
    }
}
