package tests;
import pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class AuthorizationTest extends TestBase {
  @Test
  @DisplayName("Авторизация в ТФС")
  public void authorizationTest() {
    MainPage mainPage = MainPage.openMainPage("dpisyaev","7777777");
    }
}
