public class CalculadorDIV extends Calculador {
    private Calculador c1, c2;

    public CalculadorDIV(Calculador c1, Calculador c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double calcular(Capitulo cc) {
        if (this.c1 != 0) {
            return this.c1 / this.c2;
        }
        
        return 0;
    }
}