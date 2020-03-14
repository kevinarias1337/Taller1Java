package main;

import java.util.Scanner;

public class Main {

        public static void main(String args[]){

            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese el numero a multiplicar:");
            int valor = teclado.nextInt();
            int k;
            k=1;
            do{
                System.out.println(valor + "x" + k + "=" + (valor*k));
                k++;
            }while (k<=11);

        }
}
