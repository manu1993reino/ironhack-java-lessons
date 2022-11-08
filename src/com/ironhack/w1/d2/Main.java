package com.ironhack.w1.d2;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        System.out.println(strings[0]);

        String[] subjectsArray = createSubjectsArray();
        System.out.println(subjectsArray[3]);

        System.out.println("\nArray de Asignaturas");
        for (int i = 0; i < subjectsArray.length; i++){
            System.out.println(subjectsArray[i]);
        }

        System.out.println("\nArray de dias de la semana");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        System.out.println("\nNumeros pares");
        for (int i = 0; i<=100; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

        System.out.println("\nIntroducir numeros impares e un array y mostrarlos por pantalla con un ForEach");
        int[] oddNumbers = new int[50];

        int j=0;
        for(int i=0; i<=100; i++){
            if (i%2==1){
                oddNumbers[j] = i;
                j++;
            }
        }

        for(int i : oddNumbers){
            System.out.println(i);
        }

        System.out.println("\nMostrar Impares con un bucle while");
        int counter = 0;

        while(counter<oddNumbers.length){
            System.out.println(oddNumbers[counter]);
            counter++;
        }

        System.out.println("\nMostrar Impares con un bucle Do While");
        counter = 0;

        do {
            System.out.println(oddNumbers[counter]);
            counter++;
        } while (counter < oddNumbers.length);

    }

    public static String[] createSubjectsArray(){
        String[] subjects = new String[5];
        subjects[0] = "Matematicas";
        subjects[1] = "Lengua";
        subjects[2] = "Historia";
        subjects[3] = "Biologia";
        subjects[4] = "Quimica";

        return subjects;
    }
}

