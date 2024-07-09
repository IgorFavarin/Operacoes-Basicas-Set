package set.OperacoesBasicas.OrdenacaoProdutos;
import java.util.Comparator;


public class Produtos implements Comparable<Produtos>{
    
    private String nome;
    private long codigoProduto;
    private double preco;
    private int quantidade;

    public Produtos(long CP, String no, double pco, int qtd){
        this.codigoProduto = CP;
        this.nome = no;
        this.preco = pco;
        this.quantidade = qtd;
    }

    public String getNome() {
        return nome;
    }

    public long getCodigoProduto() {
        return codigoProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "{Produto: " + nome +" código: " + codigoProduto +" preço: " + preco +" quantidade: " + quantidade + "}\n";
    }

    @Override
    public int compareTo(Produtos p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

}





