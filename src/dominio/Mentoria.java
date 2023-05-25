package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    
    
    LocalDate data;
    
    @Override
    public double calcularXP() {
        return XP_Padrão + 20d;
    }
    
    public Mentoria() {

    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

    
}
