package enunciadoEjercicio41;

public class Prueba {
    public static void main(String[] args) {
        Libro libro = new Libro("Don Quijote de la Mancha", "Miguel Servantes");
        libro.setPrecio(69.99);
        libro.imprimir();
        LibrosDeTexto libroTexto = new LibrosDeTexto("Calculo 1", "James Stewart", "Secundaria");
        libroTexto.setPrecio(40);
        libroTexto.imprimir();
        LibroDeTextoUNC libroUNC = new LibroDeTextoUNC("Fisica", "Jane Doe", "Universidad", "Ingenieria");
        libroUNC.setPrecio(45);
        libroUNC.imprimir();
        Novelas novelas = new Novelas("El Puño del Emperador", "Alberto Caliani","Historica");
        novelas.setPrecio(25);
        novelas.imprimir();
    }
}
