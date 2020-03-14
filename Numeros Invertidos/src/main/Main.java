package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int num, inv = 0 , rest;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un número:");
        num = teclado.nextInt();

        while(num>0){
            rest = num % 10;
            inv = inv * 10 + rest;
            num /= 10;
        }
        System.out.println("Número invertido: "+inv);
    }

}
