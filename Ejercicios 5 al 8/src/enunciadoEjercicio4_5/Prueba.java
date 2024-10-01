package enunciadoEjercicio4_5;

public class Prueba {
    public static void main(String[] args) {
        Profesor profesor1 = new ProfesorTitular();
        ProfesorTitular profesor2 = (ProfesorTitular) profesor1;
        profesor2.imprimir();
    }
}
