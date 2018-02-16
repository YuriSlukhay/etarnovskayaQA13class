import org.testng.annotations.*;

public class LoginTrelloTest extends TestBase {

@BeforeMethod
        public void createPreconditions(){
    openSite("https://trello.com");
}


    @Test(priority = 1)
    public void LoginTrelloTest() {

        clickLogInButton();
        enterUserName("elena.telran@yahoo.com");
        enterPassword("12345.com");
        confirmLogInButton();
        logout();
         }

    @Test(priority = 2)
    public void ALoginTrelloTestNotValidmail() {

        clickLogInButton();
        enterUserName("1");
        enterPassword("12345.com");
        confirmLogInButton();

    }

    @Test
    public void BLoginTrelloemptiFieldTest() {
        openSite("https://trello.com");
        clickLogInButton();
        enterUserName("");
        enterPassword("");
        confirmLogInButton();

    }


}
