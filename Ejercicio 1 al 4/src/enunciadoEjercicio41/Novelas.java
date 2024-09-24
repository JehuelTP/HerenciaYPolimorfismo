package enunciadoEjercicio41;

public class Novelas extends Libro{
    private String tipo;

    public Novelas(String titulo, String autor, String tipo) {
        super(titulo, autor);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Tipo de novela: " +tipo);
    }
}
