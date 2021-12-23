package pageObjects;

import elementMapper.LoginPageElementMapper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class LoginPage extends LoginPageElementMapper {

    public LoginPage(){ PageFactory.initElements(Browser.getCurrentDriver(), this); }

    public void doLogin(){
        email.sendKeys("rcosta.ba260@gmail.com");
        senha.sendKeys("teste12345");
        logarBtn.click();

    }
}
