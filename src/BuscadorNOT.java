public class BuscadorNOT extends Buscador {
    private Buscador bb;

    public BuscadorNOT(Buscador bb) {
        this.bb = bb;
    }

    @Override
    public boolean cumple(Capitulo cc) {
        return !this.bb.cumple(cc);
    }
}