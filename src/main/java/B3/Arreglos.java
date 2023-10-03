package B3;


import java.util.ArrayList;
import java.util.List;

public class Arreglos {

    public static void main(String[] arg) {
        String[] nombres=new String[3];

            nombres[0]="Mauricio";
            nombres[1]="Carlos";
            nombres[2]="Maria";
            System.out.println(nombres[0]);





            List<String> nombres2 = new ArrayList<>();

            nombres2.add("Juan");
            nombres2.add("camilo");
            nombres2.add("pedro");

            for (String nombre:nombres2) {
                System.out.println(nombre);
            }

            for (int i = 0; i < nombres.length  ; i++) {
                System.out.println(nombres[i]);
            }
        }

    }