package set.OperacoesBasicas.OrdenacaoProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produtos> produtosSet;

    public CadastroProdutos(){
        this.produtosSet = new HashSet<>();
    }

    public void  adicionarProdutos (long codigoProduto, String nome, double preco, int quantidade){
        produtosSet.add(new Produtos(codigoProduto, nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(produtosSet);
    }

    public Set<Produtos> exibirProdutoPorNome(){
        // instanciando um TreeSet para mannter a ordem de adição, que por conta do comparable, será alfabética
        Set<Produtos> produtosPorNome = new TreeSet<>(produtosSet);
        return produtosPorNome;  
    }

    public Set<Produtos> exibirProdutoPorPreco(){
        Set<Produtos> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtosSet);
        return produtosPorPreco;

    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProdutos(0001, "produto 1", 12.0, 15); 
        cadastroProdutos.adicionarProdutos(0002, "produto 2", 9.0, 15); 
        cadastroProdutos.adicionarProdutos(0003, "produto 3", 25.0, 15); 
        cadastroProdutos.adicionarProdutos(0004, "produto 4", 12.50, 15); 
        cadastroProdutos.adicionarProdutos(0005, "produto 5", 1.25, 15); 
        cadastroProdutos.adicionarProdutos(0006, "produto 6", 0.50, 15); 
        cadastroProdutos.adicionarProdutos(0007, "produto 7", 80.0, 15); 
        System.out.println("--------------- ");
        cadastroProdutos.exibirProdutos();
        System.out.println("------- por nome -------- ");
        System.out.println(cadastroProdutos.exibirProdutoPorNome());
        System.out.println("------por preço --------- ");
        System.out.println(cadastroProdutos.exibirProdutoPorPreco());
    }
    
}
