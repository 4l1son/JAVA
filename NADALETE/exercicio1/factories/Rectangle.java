package factories;


import InterfaceCalculable.Calculable;

public class Rectangle implements Calculable {
    private double comprimento;
    private double largura;

    public Rectangle(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return comprimento * largura;
    }
}
