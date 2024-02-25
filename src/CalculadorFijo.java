public class CalculadorFijo extends Calculador {
    private double valorFijo;

    public CalculadorFijo(double vf) {
        this.valorFijo = vf;
    }

    @Override
    public double calcular(Capitulo cc) {
        return this.valorFijo;
    }
}