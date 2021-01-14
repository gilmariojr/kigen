package pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

public class PageSearch {

    public PageSearch selecionarProduto() {
        $(".product_img_link").click();
        return this;
    }

    public PageSearch addProduto(){
        $("#add_to_cart").click();
        $(".icon-ok").exists();
        return this;
    }
}