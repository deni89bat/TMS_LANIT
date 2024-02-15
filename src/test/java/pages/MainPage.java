package pages;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;


public class MainPage {

  private static final SelenideElement searchInput = $(
      By.xpath("//input[@class=\"search-text\"][@placeholder=\"Поиск рабочих элементов\"]"));

  public MainPage() {
  }


  //
  @Step("Открыть основную страницу")
  public static MainPage openMainPage(String login, String password) {
    Selenide.open("", "", login, password);
    Selenide.open("");
    return new MainPage();
  }

  @Step("Найти Задание 257965:Работа на проектах ДЗМ")
  public TaskMW findTask() {
    searchInput.setValue("257965").pressEnter();
    return new TaskMW();
  }


}
