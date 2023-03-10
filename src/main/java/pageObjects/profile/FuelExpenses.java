package pageObjects.profile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FuelExpenses {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(css = ".sidebar>.sidebar_btn:nth-child(2)")
    WebElement fuelExpensesTab;

    @FindBy(css = ".modal-footer>.btn-primary")
    WebElement addAnExpenseButton;

    @FindBy(css = "#addExpenseMileage")
    WebElement fieldMileage;

    @FindBy(css = "#addExpenseLiters")
    WebElement fieldNumberOfLiters;

    @FindBy(css = "#addExpenseTotalCost")
    WebElement fieldTotalCoast;

    @FindBy(css = ".item-group>.btn-primary")
    WebElement buttonAddExpense;

    public FuelExpenses(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickAdAnExpenseButton(){
        wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.
                elementToBeClickable(addAnExpenseButton)).click();
    }

    public void clickFuelExpensesTab(){
        fuelExpensesTab.click();
    }

    public void setFieldMileage(String mileage){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.
                visibilityOf(fieldMileage)).sendKeys(mileage);
    }

    public void setFieldNumberOfLiters(String liters){
        fieldNumberOfLiters.sendKeys(liters);
    }

    public void setFieldTotalCoast(String coast){
        fieldTotalCoast.sendKeys(coast);
    }

    public void clickButtonAdd(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(buttonAddExpense)).click();

    }



}
