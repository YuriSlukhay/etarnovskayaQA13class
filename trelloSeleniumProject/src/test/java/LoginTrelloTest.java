import org.testng.annotations.*;

public class LoginTrelloTest extends TestBase {



    @Test
    public void LoginTrelloTest() {

        clickLogInButton();
        enterUserName("elena.telran@yahoo.com");
        enterPassword("12345.com");
        confirmLogInButton();
        logout();
         }

    @Test
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
