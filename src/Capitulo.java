public class Capitulo extends Elemento {
    private String tema;
    private int cantPaginas;
    private ArrayList<Persona> autores;
    private Calculador calculador;

    public Capitulo(String nn, Persona ee, String tt, int cp, Calculador cc) {
        super(nn, ee);
        this.tema = tt;
        this.cantPaginas = cp;
        this.calculador = cc;
        this.autores = new ArrayList<Persona>();
    }

    public String getTema() {
        return this.tema;
    }

    @Override
    public ArrayList<String> getTemas() {
        ArrayList<String> salida = new ArrayList<String>();
        salida.add(this.tema);
        return salida;
    }

    public void setTema(String tt) {
        this.tema = tt;
    }

    @Override
    public ArrayList<Persona> getAutores() {
        return new ArrayList<Persona>(this.autores);
    }

    public void addAutor(Persona aa) {
        if (!this.autores.contains(aa)) {
            this.autores.add(aa);
        }
    }

    @Override
    public ArrayList<Persona> getEditores() {
        ArrayList<Persona> salida = new ArrayList<Persona>();
        salida.add(this.editor);
        return salida;
    }
    
    @Override
    public void setEditor(Persona ee) {
        if (!this.autores.contains(ee)) {
            this.editor = ee;
        }
    }

    @Override
    public int getCantPaginas() {
        return this.cantPaginas;
    }

    public void setCantPaginas(int cp) {
        this.cantPaginas = cp;
    }

    public Calculador getCalculador() {
        return this.calculador;
    }

    public void setCalculador(Calculador cc) {
        this.calculador = cc;
    }

    @Override
    public Elemento getCopiaRestringida(Buscador bb) {
        if (bb.cumple(this)) {
            Elemento copia = new Capitulo(this.getNombre(), this.getEditor(), this.getTema(), this.getCantPaginas(), this.getCalculador());
        
            for (Persona aa : this.autores) {
                coia.addAutor(aa);
            }
        
            return copia;
        }

        return null;
    }

    @Override
    public double getPrecio() {
        return this.calculador.calcular(this);
    }
}