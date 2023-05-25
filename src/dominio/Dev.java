package dominio;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    
     private String nome;
     private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
     //os cursos são salvos na ordem 
     private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        //adiciona todos os conteudos do bootcamp nos conteudos inscritos
        bootcamp.getDevsIncritos().add(this);
        //adiciona o dev na lista de inscritos

     }

     public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        //pega o primeiro conteudo presente no set de Conteudosincritos 
        if(conteudo.isPresent()) { //e se ele existir,estiver presente
            this.conteudosConcluidos.add(conteudo.get());
            //adiciona esse conteudo para o set de concluidos
            this.conteudosInscritos.remove(conteudo.get()); 
            //e o remove do set de conteudos incritos
        } else { //caso esteja vazia,
            System.out.println("Você não está matriculado em nenhum conteudo.");
        }

     }

     public double calcularTotalXP() {
        Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator();
        double soma = 0;
        while(iterator.hasNext()){
            double next = iterator.next().calcularXP();
            soma += next;
        }
        return soma;

     }

     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }
     
     @Override
     public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
     }

}
