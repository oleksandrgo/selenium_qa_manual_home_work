package pageObjects.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {
    WebDriver driver;
    WebDriverWait wait;


    @FindBy(css = ".hero-descriptor_btn")
    WebElement buttonSignUp;

    @FindBy(css = "#signupName")
    WebElement fieldName;

    @FindBy(css = "#signupLastName")
    WebElement fieldLastName;

    @FindBy(css = "#signupEmail")
    WebElement fieldEmail;

    @FindBy(css = "#signupPassword")
    WebElement fieldPassword;

    @FindBy(css = "#signupRepeatPassword")
    WebElement fieldReenterPassword;

    @FindBy(css = ".modal-footer .btn")
    WebElement buttonRegister;

    public Main(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void clickOnButtonSignUp() {
        buttonSignUp.click();
    }

    public void setFieldName(String name) {
        fieldName.sendKeys(name);
    }

    public void setFieldLastName(String lastName) {
        fieldLastName.sendKeys(lastName);
    }

    public void setFieldEmail(String email) {
        fieldEmail.sendKeys(email);
    }

    public void setFieldPassword(String password) {
        fieldPassword.sendKeys(password);
    }

    public void setFieldReenterPassword(String reenterPassword) {
        fieldReenterPassword.sendKeys(reenterPassword);
    }

    public void clickRegisterButton() {
        wait = new WebDriverWait(driver, 3000);
        wait.until(ExpectedConditions.elementToBeClickable(buttonRegister)).click();
    }

    public void openUrl(String url) {
        driver.get(url);
    }


}
