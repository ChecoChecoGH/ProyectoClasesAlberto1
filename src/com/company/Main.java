package com.company;

public class Main {

    public static void main(String[] args) {

        //constante
        final int CONSTANTE = 0;

        //variables
        int x = 0;
        char caracter  = ' ';
        String cadena = "";
        boolean booleano = true;

        System.out.println("Hola buenas");

        if(x == 0){
            System.out.println("!");
        }else if(x == 1){
            System.out.println("ADS");
        }

        while(x == 0){
            System.out.println("Hola");
        }

        do{
            System.out.println("Hola");
        }while(x == 0);

        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }

    }
}
