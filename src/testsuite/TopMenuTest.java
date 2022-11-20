package testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    public String getTextFromElement(By by) {
        WebElement actualTextMessageElement = driver.findElement(by);
        return actualTextMessageElement.getText();
    }

    @Test

    public void navigateToComputerPageSuccessfully() {
        // Find Computers  link and click on Computers link
        WebElement ComputersLink = driver.findElement(By.linkText("Computers"));
        ComputersLink.click();
        clickOnElement(By.linkText("Computers"));

        // This is from requirement
        String expectedMessage = "Computers";

        // Find the welcome text element and get the text
       WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Computers')]"));

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Computers page", expectedMessage, actualMessage);

    }

    @Test

    public void navigateToElectronicsPageSuccessfully() {
        // Find ELectronics  link and click on Electronics link
        WebElement ElectronicsLink = driver.findElement(By.linkText("Electronics"));
        ElectronicsLink.click();
        clickOnElement(By.linkText("Electronics"));

        // This is from requirement
        String expectedMessage = "Electronics";

        // Find the welcome text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Electronics')]"));

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Electronics page", expectedMessage, actualMessage);

    }
    @Test
    public void navigateToApparelPageSuccessfully() {
        // Find Apparel  link and click on Apparel link
        WebElement ApparelLink = driver.findElement(By.linkText("Apparel"));
        ApparelLink.click();
        clickOnElement(By.linkText("Apparel"));

        // This is from requirement
        String expectedMessage = "Apparel";

        // Find the welcome text element and get the text
      WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Apparel')]"));

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Apparel page", expectedMessage, actualMessage);

    }
  @Test

    public void navigateToDigitalDownloadsPage(){
      // Find DigitalDownloads link and click link
      WebElement DigitalDownloadsLink=driver.findElement(By.linkText("Digital downloads"));
      DigitalDownloadsLink.click();
      clickOnElement(By.linkText("Digital downloads"));

      // This is from requirement
      String expectedMessage = "Digital downloads";

      // Find the welcome text element and get the text
       WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
      String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));

      // Validate actual and expected message
      Assert.assertEquals("Not navigate to Digital downloads page", expectedMessage, actualMessage);
  }

  @Test
    public void navigateToBooksPage() {
      WebElement Bookslink = driver.findElement(By.linkText("Books"));
      Bookslink.click();
      clickOnElement(By.linkText("Books"));

      String expectedMessage = "Books";

      // Find the welcome text element and get the text
      WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
      String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Books')]"));

      // Validate actual and expected message
      Assert.assertEquals("Not navigate to Books page", expectedMessage, actualMessage);
  }
      @Test
 public void navigateToJewelryPage(){
        WebElement Jewelrylink=driver.findElement(By.linkText("Jewelry"));
          Jewelrylink.click();
          clickOnElement(By.linkText("Jewelry"));

          String expectedMessage="Jewelry";

          // Find the welcome text element and get the text
       WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
          String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Jewelry')]"));

          // Validate actual and expected message
          Assert.assertEquals("Not navigate to Jewelry page",expectedMessage , actualMessage);

      }

      @Test
    public void navigateToGiftCards(){
          WebElement GiftCardslink=driver.findElement(By.linkText("Gift Cards"));
          GiftCardslink.click();
          clickOnElement(By.linkText("Gift Cards"));

          String expectedMessage="Gift Cards";

          // Find the welcome text element and get the text
   WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
          String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));

          // Validate actual and expected message
          Assert.assertEquals("Not navigate to Gift Cards page",expectedMessage , actualMessage);

      }


      }























