#encoding:utf-8
#language:pt

Funcionalidade: Validar carrinho

  Cenario: Validar o carrinho utilizando a tela inicial
    Dado que estou na tela inicial "<URL>"
    E realizo a bunsca de um produto
    Entao Seleciono o produto
    E adiciono ao carrinho
    Entao o produto devera estar no carrinho na tela inicial "<URL>"
      | URL                                     |
      | http://automationpractice.com/index.php |