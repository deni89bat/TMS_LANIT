package tfs0.LDProjects;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    public static void beforeAll() {
        Configuration.baseUrl = "https://ld3.landocs.ru:7443/tfs/LDProjects/ExternalTesting/";
        Configuration.browserSize = "1920x1080";
       Configuration.holdBrowserOpen = true;
    }
}
