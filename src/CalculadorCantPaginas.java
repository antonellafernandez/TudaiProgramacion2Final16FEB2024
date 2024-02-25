public class CalculadorCantPaginas extends Calculador {
    @Override
    public double calcular(Capitulo cc) {
        return cc.getCantPaginas();
    }
}