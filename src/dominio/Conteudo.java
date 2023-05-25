package dominio;

public abstract class Conteudo {
//classe mãe do curso e da mentoria

   protected static final double XP_Padrão = 10d;
   //final representa um dado constante
   //static porque o xp só pode ser acessado pelas classes filhas 

   private String titulo;
   private String descricao;

   public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public String getDescricao() {
    return descricao;
}

public void setDescricao(String descricao) {
    this.descricao = descricao;
}

//metodo abstrato 
   public abstract double calcularXP();

   
}  
