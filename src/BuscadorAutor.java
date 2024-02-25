public class BuscadorAutor extends Buscador {
    private Persona autorBuscado;

    public BuscadorAutor(Persona ab) {
        this.autorBuscado = ab;
    }

    @Override
    public boolean cumple(Capitulo cc) {
        return cc.getAutores().contains(this.autorBuscado);
    }
}