package factories;

import InterfaceCalculable.Calculable;

public class Circle implements Calculable {
    private double raio;

    public Circle(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
