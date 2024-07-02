package set.OperacoesBasicas.ConjuntoPalavras;
import java.util.HashSet;
import java.util.Set;



public class ConjuntoPalavra {
    
    private  Set<Palavra> palavraSet;

    public ConjuntoPalavra(){
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavraSet.add(new Palavra(palavra));
    }

    public void removerPalavara(String palavra){
        Palavra palavaParaRemover = null;
        if(!palavraSet.isEmpty()){
            for(Palavra p : palavraSet){
                if(p.getPalavra().equalsIgnoreCase(palavra)){
                    palavaParaRemover = p;
                    break;
                }
            }
            palavraSet.remove(palavaParaRemover);
        } else {
            System.out.println("Conjunto vazio");
        } 
    }

    public String verificarPalavra(String palavra) {
        Palavra palavraVerificada = null;
        if (!palavraSet.isEmpty()) {
            for (Palavra p : palavraSet) {
                if (p.getPalavra().equalsIgnoreCase(palavra)) {
                    palavraVerificada = p;
                    break;
                }
            }
            if (palavraVerificada != null) {
                return "Palavra encontrada: " + palavraVerificada.getPalavra();
            } else {
                return "Palavra não encontrada.";
            }
        } else {
            return "O conjunto está vazio.";
        }
    }

    public void exibirPalavras(){
        System.out.println(palavraSet);
    }

   public static void main(String[] args) {
    ConjuntoPalavra conjuntoPalavra = new ConjuntoPalavra();

    conjuntoPalavra.adicionarPalavra("palavra 1");
    conjuntoPalavra.adicionarPalavra("palavra 2");
    conjuntoPalavra.adicionarPalavra("palavra 3");
    conjuntoPalavra.adicionarPalavra("palavra 4");
    conjuntoPalavra.adicionarPalavra("palavra 5");
    conjuntoPalavra.adicionarPalavra("palavra 6");
    conjuntoPalavra.adicionarPalavra("palavra 7");

    conjuntoPalavra.exibirPalavras();
    System.out.println(conjuntoPalavra.verificarPalavra("PAlavra 2"));
    conjuntoPalavra.removerPalavara("Palavra 1");
    conjuntoPalavra.exibirPalavras();

   }




}
