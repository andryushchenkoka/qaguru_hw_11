package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    @BeforeAll
    public static void beforeAll() {
        Configuration.baseUrl = "https://github.com/";
        Configuration.headless = false;
        Configuration.browserSize = "1920x1080";
    }
}
