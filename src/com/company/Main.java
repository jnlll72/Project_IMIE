package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int nb;
        Random rd = new Random();
        nb = rd.nextInt(10 - 1);


        int nbSaisi = -1;
        boolean trouve = false;
        Scanner sc = new Scanner(System.in);

        do {

            try {
                System.out.println("Veuillez saisir un nombre entre 0 et 10: ");

                nbSaisi = sc.nextInt();
                if (nbSaisi == nb) {
                    trouve = true;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            sc.nextLine();

        } while (nbSaisi >= 10 || !trouve);

        System.out.println("Nombre trouvé : " + nbSaisi);


    }

}
