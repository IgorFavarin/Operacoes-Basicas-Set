package set.OperacoesBasicas.PesquisaContado;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        //todo logica para não inserir o mesmo nome duas vezes
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisaPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumerContato(String nome, int novoNumero){
        Contato numeroAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                numeroAtualizado = c;
                break;
            }
        }
        return numeroAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("igor c 1", 12121313);
        agendaContatos.adicionarContato("igor fav 2", 23232424);
        agendaContatos.adicionarContato("contato 3", 34343535);
        agendaContatos.adicionarContato("igor willian 4", 45454646);
        agendaContatos.adicionarContato("igor 5", 56565757);

        //agendaContatos.exibirContatos();

        //agendaContatos.atualizarNumerContato("CONtato 2", 22223333);
        //agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisaPorNome("igor"));
        

    }


    
}
