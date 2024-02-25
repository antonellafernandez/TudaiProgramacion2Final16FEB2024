public class BuscadorEditor extends Buscador {
    private Persona editorBuscado;

    public BuscadorEditor(Persona eb) {
        this.editorBuscado = eb;
    }

    @Override
    public boolean cumple(Capitulo cc) {
        return cc.getEditor() == this.editorBuscado;
    }
}