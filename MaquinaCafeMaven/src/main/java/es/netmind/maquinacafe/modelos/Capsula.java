package es.netmind.maquinacafe.modelos;

public class Capsula {
    private int identificador;
    private String marca;
    private String tipoCafe;
    private Empleado empleado;
    private double precio;
    private boolean estado = false;

    public Capsula() {
    }

    public Capsula(int identificador, String marca, String tipoCafe, Empleado empleado) {
        this.identificador = identificador;
        this.marca = marca;
        this.calcularPrecio();
        this.tipoCafe = tipoCafe;

        boolean ev = empleado.validar();
        if (ev) this.empleado = empleado;

    }

    void asociarMarca(String unaMarca) {
        this.marca = unaMarca;
        this.calcularPrecio();
    }

    double calcularPrecio() {
        if (this.marca == "Nescafé") {
            this.precio = 5;
        } else {
            this.precio = 4;
        }
        return this.precio;
    }

    boolean consumir() {
        this.estado = true;
        return this.estado;
    }

    @Override
    public String toString() {
        return "es.netmind.maquinacafe.es.netmind.maquinacafe.es.netmind.maquinacafe.modelos.Capsula{" +
                "identificador=" + identificador +
                ", marca='" + marca + '\'' +
                ", tipoCafe='" + tipoCafe + '\'' +
                ", empleado='" + empleado + '\'' +
                ", precio=" + precio +
                ", estado=" + estado +
                '}';
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipoCafe() {
        return tipoCafe;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setTipoCafe(String tipoCafe) {
        this.tipoCafe = tipoCafe;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
