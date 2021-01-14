package pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class PageIndex {

    public PageIndex abrir() {
        Selenide.open("/");
        return this;
    }

    public void limparSessao(){
        executeJavaScript("localStorage.clear();");
    }

    public PageIndex procurar(String produto) {
        $("#search_query_top").setValue(produto);
        $("#searchbox button").click();
        return this;
    }

    public void limparCarrinho(){
        executeJavaScript("document.querySelector('.cart_block.block.exclusive')" +
                ".setAttribute('style', 'display: block');");
        $(".ajax_cart_block_remove_link").click();
    }

    public boolean encontrarNoCarrinhoIndex(String produto) {
        $("#header_logo").click();
        executeJavaScript("document.querySelector('.cart_block.block.exclusive')" +
                ".setAttribute('style', 'display: block');");
        if ($(".cart_block_product_name[title="+produto+"]").exists()==true){
            return  true;
        }else{
            return  false;
        }
    }
}