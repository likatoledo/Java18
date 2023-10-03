package B3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner leer= new Scanner(System.in);

        float notas ;
        float suma = 0;
        float promedio;
        int a;


        for(a=1;a<=5;a++)

        {
            System.out.println("ingresa la nota:"+a+"");
            notas=leer.nextFloat();
            suma=suma+notas;


        }


        promedio=suma/(a-1);
        System.out.println("el promedio de las notas es:"+promedio);


        if (promedio >= 5.0)
            System.out.println("El alumno esta aprobado:");

        else
            System.out.println("El alumno esta reprobado:");
    }
}

