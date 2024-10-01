package enunciadoEjercicio4_7;

public class Fraccion extends Numerica{
    protected int numerador;
    protected int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return numerador+"/"+denominador;
    }

    @Override
    public boolean equals(Object ob) {
        return false;
    }

    @Override
    public Numerica sumar(Numerica numero) {
        return null;
    }

    @Override
    public Numerica restar(Numerica numero) {
        return null;
    }

    @Override
    public Numerica multiplicar(Numerica numero) {
        return null;
    }

    @Override
    public Numerica dividir(Numerica numero) {
        return null;
    }
}
