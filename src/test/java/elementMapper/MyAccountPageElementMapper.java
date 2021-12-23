package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPageElementMapper {

    @FindBy(className = "login")
    public WebElement login;
}
