package enunciadoEjercicio42;

public class GatosPeloCorto extends Gatos{
    private enum raza {azulRuso, britanico, manx, devonRex}

    public GatosPeloCorto(String nombre, int edad, String color, double alturaSalto, double longitudSalto) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
    }
}
