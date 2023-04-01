package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

// page_url = https://www.google.com/
public class GoogleHomePage {
    public GoogleHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//div[@class='QS5gu sy4vM'])[2]")
    public WebElement acceptCookiesButton;

    @FindBy(css = "[name=22q]")
    public WebElement searchBoxInput;

    @FindBy(id = "result-stats")
    public WebElement resultText;
}
