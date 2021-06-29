package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        //constante
        final int CONSTANTE = 0;

        //variables
        int x = 0;
        char caracter  = ' ';
        String cadena = "";
        boolean booleano = true;

        BufferedReader tc=new BufferedReader(new InputStreamReader(System.in));

        //cadena = tc.readLine();



        //ARRAY
        int [] array1 = new int[3];

       // int y = 5;
/*
        for(x = 0; x < 6; x++){
            array1[x] = y;
        }
*/
        for(x = 0; x < 3; x++){
            array1[x] = Integer.parseInt(tc.readLine());
        }

        for(x = 0; x < 3; x++){
            System.out.println(array1[x]);
        }




        /*


        System.out.println("Hola buenas");

        System.out.print(cadena);


        if(x >= 0){
            System.out.println("suuuu!");
        }else if(x >= 1){
                System.out.println("hola");
            }else{
                System.out.println("adios");
            }




        //while 0 - a infinito
        while(x == 0){
            System.out.println("Hola");
        }


        //do while 1 - infinito
        do{
            System.out.println("Hola");
        }while(x == 0);


        //for se el numero de veces
        for(int vi = 0; vi <= 10; vi++){//incremento de 1
            System.out.println("adsasd" + vi);

        }

*/

        /*
        operaciones:
            + suma
            - resta
            / division
             * multiplicacion
             % resto
             ++ incremento x = x + 1
             -- decremento x = x - 1

        de relacion (dentro de las condiciones)
            <
            <=
            >
            >=
            == comparar si son iguales
            != comparar si son distintos

        condicionales
            &&  y
            ||  o
            !   no

        asignación
            = asignación simple
        (ampliacion, todavía no)
            +=
            -=
            *=
            /=
            %=



        * */





//        int y = 0;

  //      y = 5;

        //escribir la variable y
        //escribir dos veces la variable y
        //escribir 20 veces la variable y




    }
}
