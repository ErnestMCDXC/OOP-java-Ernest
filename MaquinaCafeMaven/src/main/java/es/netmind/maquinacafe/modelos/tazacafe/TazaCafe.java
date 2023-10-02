package es.netmind.maquinacafe.modelos.tazacafe;

public class TazaCafe {

    private int id;
    private double volumen;
    private String fabricante;
    private boolean lista = false;

    public TazaCafe(int id, double volumen, String fabricante) {
        this.id = id;
        this.volumen = volumen;
        this.fabricante = fabricante;
    }

    public boolean prepararTaza() {
        System.out.println("Preparando taza...");
        return true;
    }

    public boolean servirTaza() {
        System.out.println("Taza lista...");
        this.lista = true;
        return true;
    }

    @Override
    public String toString() {
        return "TazaCafe{" +
                "id=" + id +
                ", volumen=" + volumen +
                ", fabricante='" + fabricante + '\'' +
                ", lista=" + lista +
                '}';
    }
}
