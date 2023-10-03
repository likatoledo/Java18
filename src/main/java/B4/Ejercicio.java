import java.util.Scanner;

public class TablaConWhile {

    public static void main (String [] args){
        int Multiplicando ;

        System.out.println("¿Que tabla desea Realizar?");
        Scanner valor1 = new Scanner(System.in);
        Multiplicando = valor1.nextInt();

        int multiplicador = 1;
        while(multiplicador <=10){
            System.out.println(Multiplicando + " X " + multiplicador + " = " + Multiplicando * multiplicador );
            multiplicador++;

            int numero1, numero2, resultado;

            do {
                System.out.print("Ingresa el primer número: ");
                numero1 = Scanner.nextInt();
                System.out.print("Ingresa el segundo número: ");
                numero2 = Scanner.nextInt();

        }
    }
}