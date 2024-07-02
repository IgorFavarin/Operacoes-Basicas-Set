package set.OperacoesBasicas.ConjuntoPalavras;

public class Palavra {
    private String palavra;
   // private int codigoPalavra;

    public String getPalavra() {
        return palavra;
    }
    
   /*/ public int getCodigoPalavra() {
        return codigoPalavra;
    }*/

    public Palavra(String p){
        this.palavra = p;
    
    }

    @Override
    public String toString() {

        return "Convidado {" + palavra + "}\n";
    }
}
