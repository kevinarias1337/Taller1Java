package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int num1;
        int num2;
        int num3;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primero numero: ");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = teclado.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        num3 = teclado.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("El numero mayor es: "+num1);
        }else if(num2>num1 && num2>num3){
            System.out.println("El numero mayor es: "+num2);
        }else if(num3>num2 && num3>num1){
            System.out.println("El numero mayor es: "+num3);
        }

    }
}
