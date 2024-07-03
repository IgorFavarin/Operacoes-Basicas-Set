package set.OperacoesBasicas.PesquisaContado;

public class Contato {
    // atributos
    private String nome;
    private int numero;

    public Contato(String no, int nu){
        this.nome = no;
        this.numero = nu;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "{Contato: " + nome + " numero: " + numero +"}\n";
    }
}
