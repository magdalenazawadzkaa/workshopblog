package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    // Click Method
    public void click(By elementLocation) {
        driver.findElement(elementLocation).click();
    }

    // Click method for WebElements
    public BasePage clickElement(WebElement element) {
        element.click();
        return this;
    }

    // Write Text
    public void writeText(By elementLocation, String text) {
        driver.findElement(elementLocation).sendKeys(text);
    }

    // Read Text
    public String readText(By elementLocation) {
        return driver.findElement(elementLocation).getText();
    }

    // Wait for element to be Selected
    public void waitForElementVisibility(WebElement element, int timeOut) {
        new WebDriverWait(driver, timeOut).until(ExpectedConditions.elementToBeClickable(element));
    }
}
