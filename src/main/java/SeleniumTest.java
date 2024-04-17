import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumTest {

    private WebDriver driver;

    public SeleniumTest() {
        // Initialize WebDriver
        System.setProperty("webdriver.chrome.driver", "/Users/mac/Downloads/chromedriver-mac-x64/chromedriver");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void performOfficeworksRegistration(String url) {
        // Load the Officeworks registration page
        driver.get(url);

        // Fill in registration details
        fillInputFieldByTestId("create-account-firstname-input", "Bidhan");
        fillInputFieldByTestId("create-account-lastname-input", "Gupta");
        fillInputFieldByTestId("create-account-phone-number-input", "0424876567");
        fillInputFieldByTestId("create-account-email-input", "bidhan@example.com");
        fillInputFieldByTestId("create-account-password-input", "password123");
        fillInputFieldByTestId("create-account-password-confirm-input", "password123");

        // Select account type (e.g., Personal)
        selectAccountType("personal");

        // Click 'Create account' button
        clickCreateAccountButton();

        // Take screenshot
        takeScreenshot("officeworks_registration.png");
    }

    private void fillInputFieldByTestId(String testId, String value) {
        WebElement inputElement = driver.findElement(By.cssSelector("[data-testid='" + testId + "'] input"));
        inputElement.sendKeys(value);
    }

    private void selectAccountType(String accountType) {
        WebElement accountTypeButton = driver.findElement(By.cssSelector("[value='" + accountType + "']"));
        accountTypeButton.click();
    }

    private void clickCreateAccountButton() {
        WebElement createAccountButton = driver.findElement(By.cssSelector("[data-testid='account-action-btn']"));
        createAccountButton.click();
    }

    private void takeScreenshot(String filename) {
        // Capture screenshot and save to file
        // Ensure you have the appropriate logic to handle screenshots
    }

    public void closeBrowser() {
        // Close the browser
        driver.quit();
    }
}
