public class CalculadorRES extends Calculador {
    private Calculador c1, c2;

    public CalculadorRES(Calculador c1, Calculador c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double calcular(Capitulo cc) {
        return this.c1 - this.c2;
    }
}