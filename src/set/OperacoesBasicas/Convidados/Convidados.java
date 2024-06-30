package set.OperacoesBasicas.Convidados;

public class Convidados {
    private String nome;
    private int codigoConvite;

    public Convidados(String n, int cc){
        this.nome = n;
        this.codigoConvite = cc;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }
    public String getNome() {
        return nome;
    }
    
    @Override
    public String toString() {

        return "Convidado {" + nome + "}, Código do convite {" + codigoConvite + "}\n";
    }
    
}