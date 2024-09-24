package enunciadoEjercicio42;

public class Perros extends Mascotas {
    private double peso;
    private Boolean muerde;

    public Perros(String nombre, int edad, String color, double peso, Boolean muerde) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Boolean getMuerde() {
        return muerde;
    }

    public void setMuerde(Boolean muerde) {
        this.muerde = muerde;
    }
    public static void sonido(){
        System.out.println("Los perros ladran.");
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Peso: " +peso+ ". Muerde: " +muerde);
    }
}
