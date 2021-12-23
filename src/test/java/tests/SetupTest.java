package tests;

import org.junit.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.assertTrue;

public class SetupTest extends BaseTests{

    //@Test
    public void testOpeningBrowserAndLoadPage(){
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("O navegador foi executato e carregado a URL com sucesso!");
    }

    @Test
    public void testLogin(){

        HomePage home = new HomePage();
        LoginPage login = new LoginPage();
        MyAccountPage myAccount = new MyAccountPage();

        home.clickBtnLogin();
        System.out.println("ClickLogin");

        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
                .contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));

        login.doLogin();
        System.out.println("FazerLogin");

        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
                .contains(Utils.getBaseUrl().concat("index.php?controller=my-account")));

    }
}
