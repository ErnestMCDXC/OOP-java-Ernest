package es.netmind.maquinacafe.modelos;

public class Empleado {
    private String nombre;
    private int ident;
    private String email;
    private String puesto;

    public Empleado(String nombre, int ident, String email, String puesto) {
        this.nombre = nombre;
        this.ident = ident;
        this.email = email;
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "es.netmind.maquinacafe.es.netmind.maquinacafe.es.netmind.maquinacafe.modelos.Empleado{" +
                "nombre='" + nombre + '\'' +
                ", ident=" + ident +
                ", email='" + email + '\'' +
                ", puesto='" + puesto + '\'' +
                '}';
    }

    boolean validar() {
        boolean esValido = false;

        if (nombre == null) return esValido;
        else if (nombre.length() < 3) return esValido;
        else if (email == null) return esValido;
        else if (email.indexOf("@") < 0) return esValido;
        else esValido = true;

        return esValido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdent() {
        return ident;
    }

    public String getEmail() {
        return email;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdent(int ident) {
        this.ident = ident;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
