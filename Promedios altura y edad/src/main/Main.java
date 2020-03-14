package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Ingrese el número de estudiantes: ");
        Scanner teclado = new Scanner(System.in);
        int resedad;
        int resestatura;
        int edad;
        int estatura;
        int est;


        int contedad =0;
        int contestatura=0;
        int estmayoredad=0;
        int estestatura =0;
        est = teclado.nextInt();
        int i;
        for(i = 1; i<=est; i++){
            System.out.println("Ingrese la edad del Estudiante #"+i);
            edad = teclado.nextInt();
            System.out.println("Ingrese la estatura(cm) del Estudiante #"+i);
            estatura = teclado.nextInt();
            if(edad>18){
                estmayoredad++;
            }
            if(estatura>175){
                estestatura++;
            }
            contedad=contedad+edad;
            contestatura=contestatura+estatura;
        }
        resedad=contedad/est;
        resestatura=contestatura/est;
        System.out.println("La edad promedio es de: "+resedad);
        System.out.println("La estatura promedio es de: "+resestatura);
        System.out.println("Estudiantes mayores de 18 años: "+estmayoredad);
        System.out.println("Estudiantes con una estatura mayor de 175cm: "+estestatura);
    }
}
