package dominio;

public class Curso extends Conteudo{
    
    
    int cargaHoraria;

    @Override
    public double calcularXP() {
        return XP_Padrão * cargaHoraria;
    }

    public Curso(){
        
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
