import java.time.LocalDate;
import java.util.Set;
import dominio.Curso;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
    
    Curso curso1 = new Curso();
    curso1.setTitulo("Curso Java");
    curso1.setDescricao("Teste de descrição");
    curso1.setCargaHoraria(8);
    System.out.println(curso1);

    Mentoria mentoria1 = new Mentoria();
    mentoria1.setTitulo("Mentoria de java");
    mentoria1.setDescricao("descrição");
    mentoria1.setData(LocalDate.now());
    System.out.println(mentoria1);
    

    }
      
}
