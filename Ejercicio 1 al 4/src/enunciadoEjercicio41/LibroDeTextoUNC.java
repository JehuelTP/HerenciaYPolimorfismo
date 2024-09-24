package enunciadoEjercicio41;

public class LibroDeTextoUNC extends  LibrosDeTexto{
    private String facultad;

    public LibroDeTextoUNC(String titulo, String autor, String curso, String facultad) {
        super(titulo, autor, curso);
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Facultad: " +facultad);
    }
}
