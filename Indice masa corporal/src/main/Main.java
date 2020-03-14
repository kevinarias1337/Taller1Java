package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int peso;
        double estatura;
        double resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la peso de la persona: ");
        peso = teclado.nextInt();
        System.out.println("Ingrese la estatura de la persona: ");
        estatura = teclado.nextDouble();

        double potencia = Math.pow(estatura,2);
        resultado = peso/potencia;
        System.out.println("El indice de masa corporal de la persona es de: "+resultado);

    }
}
