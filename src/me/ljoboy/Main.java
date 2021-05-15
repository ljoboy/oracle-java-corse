package me.ljoboy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int maxSize = -1;
        Scanner in = new Scanner(System.in);

        do {
            try {
                System.out.println("Saisissez le nombre de produits à ajouter");
                System.out.println("Saisissez 0 (zéro) si vous ne souhaiter pas ajouter de produits : ");
                maxSize = in.nextInt();

                if (maxSize < 0) {
                    System.out.println("Valeur incorrecte saisie.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Type de données incorrect saisi");
            } catch (Exception e) {
                System.out.println(e);
            }
            in.nextLine();
        } while (maxSize < 0);

        int tempQty, tempNumber;
        String tempName;
        float tempPrice;

        System.out.println("Nom ==> ");
        tempName = in.nextLine();
        System.out.println("Numero ==> ");
        tempNumber = in.nextInt();
        System.out.println("Prix ==> ");
        tempPrice = in.nextFloat();
        System.out.println("Quantité en stock ==> ");
        tempQty = in.nextInt();

        Product p1 = new Product(tempNumber, tempName, tempQty, tempPrice);

        in.nextLine();

        System.out.println("Nom ==> ");
        tempName = in.nextLine();
        System.out.println("Numero ==> ");
        tempNumber = in.nextInt();
        System.out.println("Prix ==> ");
        tempPrice = in.nextFloat();
        System.out.println("Quantité en stock ==> ");
        tempQty = in.nextInt();

        Product p2 = new Product(tempNumber, tempName, tempQty, tempPrice);

        Product p3 = new Product(3, "Disque dur", 500, 80f);
        Product p4 = new Product(4, "Stylo", 270, 1f);
        Product p5 = new Product(5, "Bracelet", 200, 2.5f);
        Product p6 = new Product(6, "Bague", 250, 1.5f);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
    }
}
