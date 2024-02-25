public class Persona {
    private String nombre, apellido, mail;

    public Persona(String nn, String aa, String mm) {
        this.nombre = nn;
        this.apellido = aa;
        this.mail = mm;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nn) {
        this.nombre = nn;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String a) {
        this.apellido = aa;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mm) {
        this.mail = mm;
    }
}