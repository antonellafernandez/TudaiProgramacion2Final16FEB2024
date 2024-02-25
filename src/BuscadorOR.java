public class BuscadorOR extends Buscador {
    private Buscador b1, b2;

    public BuscadorOR(Buscador b1, Buscador b2) {
        this.b1 = b1;
        this.b2 = b2;
    }

    @Override
    public boolean cumple(Capitulo cc) {
        return this.b1.cumple(cc) || this.b2.cumple(cc);
    }
}