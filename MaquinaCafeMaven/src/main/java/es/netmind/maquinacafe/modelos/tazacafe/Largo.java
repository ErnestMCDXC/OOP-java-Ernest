package es.netmind.maquinacafe.modelos.tazacafe;

public class Largo extends TazaCafe {
    private int porcentaje_agua;

    public Largo(int id, double volumen, String fabricante, int porcentaje_agua) {
        super(id, volumen, fabricante);
        this.porcentaje_agua = porcentaje_agua;
    }

    @Override
    public boolean prepararTaza() {
        System.out.println("Preparando taza con porcentaje: " + this.porcentaje_agua);
        return true;
    }

    @Override
    public String toString() {
        return "Largo{" +
                "porcentaje_agua=" + porcentaje_agua +
                "} " + super.toString();
    }

    public int getPorcentaje_agua() {
        return porcentaje_agua;
    }

    public void setPorcentaje_agua(int porcentaje_agua) {
        this.porcentaje_agua = porcentaje_agua;
    }
}
