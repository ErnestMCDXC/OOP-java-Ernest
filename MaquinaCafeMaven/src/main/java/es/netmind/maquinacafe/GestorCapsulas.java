package es.netmind.maquinacafe;

import es.netmind.maquinacafe.modelos.Capsula;
import es.netmind.maquinacafe.modelos.Empleado;
import es.netmind.maquinacafe.modelos.tazacafe.Corto;
import es.netmind.maquinacafe.modelos.tazacafe.Largo;
import es.netmind.maquinacafe.modelos.tazacafe.TazaCafe;

public class GestorCapsulas {

    public static void main(String[] args) {
        System.out.println("BIENVENIDO AL GESTOR DE CAPSULAS");

        Empleado emp1 = new Empleado("Juan Valdés", 1, "jvaldes@hotmail.com", "CEO");
//        System.out.println(emp1);

        System.out.println(emp1.getEmail());

        Empleado emp2 = new Empleado("Luisa Valdés", 2, "luisavaldes@hotmail.com", "Directora de Marketing");
//        System.out.println(emp2);


        Capsula c1 = new Capsula(1, "Bonka", "Arábigo", emp1);
//        System.out.println(c1);

        Capsula c2 = new Capsula(2, "Nescafé", "Torrefacto", emp2);
//        System.out.println(c2);


        TazaCafe t1 = new Largo(1, 100, "Tazas SL", 60);
//        t1.setPorcentaje_agua(40);
//        Perdemos la capacidad de usar propiedades que no sean de la superclase
        t1.prepararTaza();
        t1.servirTaza();

        TazaCafe t2 = new Corto(2, 100, "Tazas SL", 10);
        t2.prepararTaza();
        t2.servirTaza();


//        Arrays
        TazaCafe[] listaTazas = new TazaCafe[2];
        listaTazas[0] = t1;
        listaTazas[1] = t2;
//        Lo mismo seria: TazaCafe[] listaTazas = {t1,t2};

        for (int i = 0; i < listaTazas.length; i++) {
            listaTazas[i].prepararTaza();
            listaTazas[i].servirTaza();
            System.out.println(listaTazas[i]);
        }

    }

}
