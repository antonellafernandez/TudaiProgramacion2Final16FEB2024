public abstract class Elemento {
    private String nombre;
    private Persona editor;

    public Elemento(String nn, Persona ee) {
        this.nombre = nn;
        this.editor = ee;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nn) {
        this.nombre = nn;
    }

    public Persona getEditor() {
        return this.editor;
    }

    public ArrayList<String> getTemas();
    public ArrayList<Persona> getAutores();
    public ArrayList<Persona> getEditores();
    public void setEditor(Persona ee);
    public int getCantPaginas();
    public Elemento getCopiaRestringida(Buscador bb);
    public double getPrecio();
}