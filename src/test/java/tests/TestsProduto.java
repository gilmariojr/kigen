package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PageHeader;
import pages.PageSearch;

import static com.codeborne.selenide.Selenide.$;

public class TestsProduto {
    PageHeader header = new PageHeader();
    PageSearch search = new PageSearch();

    @BeforeMethod
    public void beforeTest() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "http://automationpractice.com";
    }

    @Test
    public void validarBusca() {
        header
                .open()
                .search("Blouse");
        $("#center_column  a.button.ajax_add_to_cart_button.btn.btn-default span").exists();
    }

    @Test
    public void ValidarCarrinho() {
        header
                .open()
                .search("Blouse");
        search
                .selecionarProduto()
                .addProduto();
    }
}
