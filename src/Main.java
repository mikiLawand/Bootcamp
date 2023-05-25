import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
    
    Curso curso1 = new Curso();
    curso1.setTitulo("Curso Java");
    curso1.setDescricao("Teste de descrição");
    curso1.setCargaHoraria(8);
    System.out.println(curso1);

    Curso curso2 = new Curso();
    curso2.setTitulo("Programção Orientada a objetos");
    curso2.setDescricao("Mimimi");
    curso2.setCargaHoraria(6);
    System.out.println(curso2);


    Mentoria mentoria1 = new Mentoria();
    mentoria1.setTitulo("Mentoria de java");
    mentoria1.setDescricao("descrição");
    mentoria1.setData(LocalDate.now());
    System.out.println(mentoria1);

    //instanciando um novo bootcamp 
    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Criação de Inteligência Artificial");
    bootcamp.setDescricao("Desenvolva IAs usando Python");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria1);

    Dev devTony = new Dev();
    devTony.setNome("Tony Stark");
    devTony.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos inscritos de Tony: " + devTony.getConteudosInscritos());
    devTony.progredir();
    devTony.progredir();
    System.out.println("Conteudos inscritos de Tony: " + devTony.getConteudosInscritos());
    System.out.println("Conteudos Concluidos: " + devTony.getConteudosConcluidos());
    System.out.println("XP: " + devTony.calcularTotalXP());

    Dev devPeter = new Dev();
    devPeter.setNome("Peter Parker");
    devPeter.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos inscritos de Peter: " + devPeter.getConteudosInscritos());
    System.out.println("Conteudos Concluidos: " + devPeter.getConteudosConcluidos());
    devPeter.progredir();
    System.out.println("XP: " + devPeter.calcularTotalXP());

    }
      
}
