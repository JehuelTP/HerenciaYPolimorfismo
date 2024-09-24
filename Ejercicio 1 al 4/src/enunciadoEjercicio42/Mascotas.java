package enunciadoEjercicio42;

public class Mascotas {
    protected String nombre;
    protected int edad;
    protected String color;

    public Mascotas(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void imprimir(){
        System.out.println("Nombre: " +nombre+ ". Edad: " +edad+ ". Color: " +color);
    }
}
