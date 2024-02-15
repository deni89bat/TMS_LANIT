package pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class TaskMW {

  private final SelenideElement taskTitle = $(
      By.xpath("//span[@class=\"info-text\"][normalize-space()=\"Работа на проектах ДЗМ\"]"));

  @Step("Проверить заголовок задания 257965")
  public TaskMW checkTitle() {
    taskTitle.shouldBe(visible);
    return this;
  }

  ;


}
