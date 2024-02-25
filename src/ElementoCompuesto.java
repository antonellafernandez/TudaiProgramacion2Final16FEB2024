public class ElementoCompuesto extends Elemento {
    private int anioPublicacion;
    private ArrayList<Elemento> elems;

    public ElementoCompuesto(String nn, Persona ee, int ap) {
        super(nn, ee);
        this.anioPublicacion = ap;
        this.elems = new ArrayList<Elemento>();
    }

    public int getAnioPublicacion() {
        return this.anioPublicacion;
    }

    public void setAnioPublicacion(int ap) {
        this.anioPublicacion = ap;
    }

    public ArrayList<Elemento> getElems() {
        return new ArrayList<Elemento>(this.elems);
    }

    public void addElem(Elemento ee) {
        if (!this.elems.contains(ee)) {
            this.elems.add(ee);
        }
    }

    @Override
    public ArrayList<String> getTemas() {
        ArrayList<String> salida = new ArrayList<String>();

        for (Elemento ee : this.elems) {
            ArrayList<String> temasAux = ee.getTemas();

            for (String tt : temasAux) {
                if (!salida.contains(tt)) {
                    salida.add(tt);
                }
            }
        }

        return salida;
    }

    @Override
    public ArrayList<Persona> getAutores() {
        ArrayList<Persona> salida = new ArrayList<Persona>();

        for (Elemento ee : this.elems) {
            ArrayList<Persona> autoresAux = ee.getAutores();

            for (Persona aa : autoresAux) {
                if (!salida.contains(aa)) {
                    salida.add(aa);
                }
            }
        }

        return salida;
    }

    @Override
    public ArrayList<Persona> getEditores() {
        ArrayList<Persona> salida = new ArrayList<Persona>();

        for (Elemento ee : this.elems) {
            ArrayList<Persona> editoresAux = ee.getEditores();

            for (Persona rr : editoresAux) {
                if (!salida.contains(rr)) {
                    salida.add(rr);
                }
            }
        }

        return salida;
    }

    @Override
    public void setEditor(Persona ee) {
        this.editor = ee;
    }

    @Override
    public int getCantPaginas() {
        int salida = 0;

        for (Elemento ee : this.elems) {
            salida += ee.getCantPaginas();
        }

        return salida;
    }

    @Override
    public Elemento getCopiaRestringida(Buscador bb) {
        ArrayList<Elemento> copiaElementos = new ArrayList<Elemento>();

        for (Elemento ee : this.elems) {
            Elemento eCopia = ee.getCopiaRestringida(bb);

            if (eCopia != null) {
                copiaElementos.add(eCopia);
            }
        }

        if (!copiaElementos.isEmpty()) {
            ElementoCompuesto copia = new ElementoCompuesto(this.getNombre(), this.getEditor(), this.getAnioPublicacion());

            for (Elemento ee : copiaElementos) {
                copia.addElem(ee);
            }

            return copia;
        }

        return null;
    }

    @Override
    public double getPrecio() {
        double salida = 0;

        for (Elemento ee : this.elems) {
            salida += ee.getPrecio();
        }

        return salida;
    }
}