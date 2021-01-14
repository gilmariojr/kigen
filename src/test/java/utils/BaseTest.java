package utils;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.PageIndex;

public class BaseTest {
    protected PageIndex index;

    @BeforeMethod
    public void beforeTest() {
        index = new PageIndex();
        Configuration.browser = "chrome";
        Configuration.baseUrl = "http://automationpractice.com";
    }

    @AfterMethod
    public void limparSessao() {
        index.limparSessao();
    }
}