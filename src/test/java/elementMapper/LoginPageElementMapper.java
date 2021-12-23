package elementMapper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Browser;

public class LoginPageElementMapper {

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "passwd")
    public WebElement senha;

    @FindBy(id = "SubmitLogin")
    public WebElement logarBtn;

}
