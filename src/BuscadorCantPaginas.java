public class BuscadorCantPaginas extends Buscador {
    private int cantPaginasBuscada;

    public BuscadorCantPaginas(int cpb) {
        this.cantPaginasBuscada = cpb;
    }

    @Override
    public boolean cumple(Capitulo cc) {
        return cc.getCantPaginas() < this.cantPaginasBuscada;
    }
}