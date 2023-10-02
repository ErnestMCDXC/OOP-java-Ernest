package es.netmind.maquinacafe.modelos.tazacafe;

public class Corto extends TazaCafe{
    private int cantidadLeche;

    public Corto(int id, double volumen, String fabricante, int cantidadLeche) {
        super(id, volumen, fabricante);
        this.cantidadLeche = cantidadLeche;
    }

    @Override
    public boolean prepararTaza() {
        System.out.println("Preparando taza con cantidad: " + this.cantidadLeche);
        return true;
    }

    @Override
    public String toString() {
        return "Corto{" +
                "cantidadLeche=" + cantidadLeche +
                "} " + super.toString();
    }
}
