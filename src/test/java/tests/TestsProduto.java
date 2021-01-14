package tests;

import org.junit.Assert;
import org.testng.annotations.Test;
import pages.PageSearch;
import utils.BaseTest;

public class TestsProduto extends BaseTest {

    PageSearch search = new PageSearch();

    @Test
    public void produtoNaoEncontrado() {
        index
                .abrir()
                .limparCarrinho();
        if (index.encontrarNoCarrinhoIndex("Blouse") == false) {
            Assert.assertTrue("Produto não encontrado", true);
        }else{
            Assert.assertTrue("Produto encontrado incorretamente", false);
        }
    }

    @Test
    public void ValidarCarrinho() {
        String produto = "Blouse";
        index
                .abrir()
                .procurar(produto);
        search
                .selecionarProduto()
                .addProduto();

        if (index.encontrarNoCarrinhoIndex(produto) == true) {
            Assert.assertTrue("Produto Encontrado Correta", true);
        }else  {
            Assert.assertTrue("Produto não adicionado ao Carrinho", false);
        }
    }
}
