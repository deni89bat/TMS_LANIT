package tests;



import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.TaskMW;

public class MonthReportTest extends TestBase {

  @Test
  @DisplayName("Отправка отчёта за месяц")
  public void monthReportTest() {
        MainPage mainPage = MainPage.openMainPage("dpisyaev","7777777");
        TaskMW task257965 = mainPage.findTask();
        task257965.checkTitle();
  }
}
