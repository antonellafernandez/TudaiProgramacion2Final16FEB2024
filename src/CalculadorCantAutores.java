public class CalculadorCantAutores extends Calculador {
    @Override
    public double calcular(Capitulo cc) {
        return cc.getAutores().size();
    }
}