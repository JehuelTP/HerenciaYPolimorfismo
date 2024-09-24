package enunciadoEjercicio42;

public class Prueba {
        public static void main(String[] args) {
            PerrosPequeños caniche = new PerrosPequeños("Fido", 2, "Blanco", 5.0, false);
            GatosPeloCorto azulRuso = new GatosPeloCorto("Misha", 3, "Gris", 1.5, 2.0);

            Perros.sonido();
            Gatos.sonido();

            System.out.println("Nombre del perro: " + caniche.getNombre()+ "/ Edad: " +caniche.getEdad()+ "/ Color: " +caniche.getColor()+ "/ Peso: " +caniche.getPeso());
            System.out.println("Nombre del gato: " + azulRuso.getNombre()+ "/ Edad: " +azulRuso.getEdad()+ "/ Color: " +azulRuso.getColor());
        }
    }
