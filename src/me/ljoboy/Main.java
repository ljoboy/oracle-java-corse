package me.ljoboy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int maxSize = -1;
        Scanner in = new Scanner(System.in);

        Product[] products;

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
                in.nextLine();
            } catch (Exception e) {
                System.out.println(e);
                in.nextLine();
            }
        } while (maxSize < 0);

        products = new Product[maxSize];

        if (maxSize == 0) {
            System.out.println("Aucun produit n'est requis");
        } else {

            Main.addToInventory(products, in);

            in.close();

            Main.displayInventory(products);
        }


//        System.out.println("Nom ==> ");
//        tempName = in.nextLine();
//        System.out.println("Numero ==> ");
//        tempNumber = in.nextInt();
//        System.out.println("Prix ==> ");
//        tempPrice = in.nextFloat();
//        System.out.println("Quantité en stock ==> ");
//        tempQty = in.nextInt();
//
//        Product p2 = new Product(tempNumber, tempName, tempQty, tempPrice);
//
//        Product p3 = new Product(3, "Disque dur", 500, 80f);
//        Product p4 = new Product(4, "Stylo", 270, 1f);
//        Product p5 = new Product(5, "Bracelet", 200, 2.5f);
//        Product p6 = new Product(6, "Bague", 250, 1.5f);
//
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//        System.out.println(p4);
//        System.out.println(p5);
//        System.out.println(p6);
    }

    public static void displayInventory(Product[] products) {
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public static void addToInventory(Product[] products, Scanner in) {
        int tempQty, tempNumber;
        String tempName;
        float tempPrice;


        for (int i = 0; i < products.length; i++) {
            in.nextLine();

            System.out.println("Nom ==> ");
            tempName = in.nextLine();
            System.out.println("Numero ==> ");
            tempNumber = in.nextInt();
            System.out.println("Prix ==> ");
            tempPrice = in.nextFloat();
            System.out.println("Quantité en stock ==> ");
            tempQty = in.nextInt();

            products[i] = new Product(tempNumber, tempName, tempQty, tempPrice);
        }
    }
}
