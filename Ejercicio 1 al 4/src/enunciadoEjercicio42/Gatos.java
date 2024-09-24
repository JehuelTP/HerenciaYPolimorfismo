package enunciadoEjercicio42;

public class Gatos extends Mascotas {
    private double alturaSalto;
    private double longitudSalto;

    public Gatos(String nombre, int edad, String color, double alturaSalto, double longitudSalto) {
        super(nombre, edad, color);
        this.alturaSalto = alturaSalto;
        this.longitudSalto = longitudSalto;
    }

    public double getAlturaSalto() {
        return alturaSalto;
    }

    public void setAlturaSalto(double alturaSalto) {
        this.alturaSalto = alturaSalto;
    }

    public double getLongitudSalto() {
        return longitudSalto;
    }

    public void setLongitudSalto(double longitudSalto) {
        this.longitudSalto = longitudSalto;
    }
    public static void sonido(){
        System.out.println("Los gatos maullan y ronronean. ");
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Altura de salto: " +alturaSalto+ " Longitud de salto: " +longitudSalto);
    }
}
