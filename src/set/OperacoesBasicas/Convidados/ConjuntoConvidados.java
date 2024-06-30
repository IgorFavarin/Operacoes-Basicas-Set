package set.OperacoesBasicas.Convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidados> convidadosSet;
    
    public ConjuntoConvidados(){
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidados(nome, codigoConvite));
    }

    public void removerConvidado(int condigoConvite){
        Convidados convidadoParaRemover = null;
        for(Convidados c : convidadosSet){
            if(c.getCodigoConvite() == condigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoDeConvidados = new ConjuntoConvidados();
        
        conjuntoDeConvidados.adicionarConvidado("conv 1", 001);
        conjuntoDeConvidados.adicionarConvidado("conv 2", 002);
        conjuntoDeConvidados.adicionarConvidado("conv 3", 003);
        conjuntoDeConvidados.adicionarConvidado("conv 4", 004);
        conjuntoDeConvidados.adicionarConvidado("conv 5", 005);
        conjuntoDeConvidados.adicionarConvidado("conv 5", 006);

        //conjuntoDeConvidados.exibirConvidados();
        //conjuntoDeConvidados.removerConvidado(5);
        //conjuntoDeConvidados.exibirConvidados();
        System.out.println(conjuntoDeConvidados.contarConvidados());

    }


}
