package set.OperacoesBasicas.OrdenacaoProdutos;
import java.util.Comparator;

public class ComparatorPorPreco implements Comparator<Produtos> {

    @Override
    public int compare(Produtos p1, Produtos p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }


    
}