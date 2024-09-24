package enunciadoEjercicio41;

public class LibrosDeTexto extends Libro{
    private String curso;

    public LibrosDeTexto(String titulo, String autor, String curso) {
        super(titulo, autor);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Curso: " +curso);
    }
}
