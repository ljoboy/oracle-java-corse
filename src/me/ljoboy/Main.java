package me.ljoboy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maxSize, menuChoice;

        maxSize = Main.getNumProducts(in);
        if (maxSize == 0) {
            System.out.println("Aucun produit n'est requis");
        } else {

            Product[] products = new Product[maxSize];
            Main.addToInventory(products, in);
            do {
                menuChoice = Main.getMenuOption(in);
                Main.executeMenuChoice(menuChoice, products, in);
            } while (menuChoice != 0);

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

    public static int getProductNumber(Product[] products, Scanner in) {
        int productChoice = -1;

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].getNumero() + ". " + products[i].getNom());
        }
        try {
            do {
                System.out.println("Entrer votre choix : ");
                productChoice = in.nextInt();

                if (productChoice < 0 || productChoice > 1) {
                    System.out.println("Valeur incorrecte saisie");
                }
            } while (productChoice < 0 || productChoice > 1);
        } catch (InputMismatchException e) {
            System.out.println("Type de données incorrect saisi");
            in.nextLine();
        } catch (Exception e) {
            System.out.println(e);
            in.nextLine();
        }

        return productChoice;
    }

    public static int getMenuOption(Scanner in) {
        int choix = -1;
        do {
            try {
                System.out.println("1. Afficher l'inventaire");
                System.out.println("2. Ajouter une quantité de stock");
                System.out.println("3. Déduire une quantité de stock");
                System.out.println("4. Ne pas réapprovisionner le produit");
                System.out.println("0. Quitter");
                System.out.println("Veuillez saisir une option de menu : ");

                choix = in.nextInt();
                if (choix < 0 || choix > 4) {
                    System.out.println("Valeur incorrecte saisie.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Type de données incorrect saisi");
                in.nextLine();
            } catch (Exception e) {
                System.out.println(e);
                in.nextLine();
            }

        } while (choix < 0 || choix > 4);

        return choix;
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

    public static void addCDToInventory(Product[] products, Scanner in, int i) {
        int tempQty, tempNumber, tempNbTitres;
        String tempName, tempArtist, tempMson;
        float tempPrice;

        in.nextLine();

        System.out.println("Nom du CD==> ");
        tempName = in.nextLine();
        System.out.println("Nom de l'artiste ==> ");
        tempArtist = in.nextLine();
        System.out.println("Nom de la maison de disque ==> ");
        tempMson = in.nextLine();
        System.out.println("Numero ==> ");
        tempNumber = in.nextInt();
        System.out.println("Nombre de titre ==> ");
        tempNbTitres = in.nextInt();
        System.out.println("Prix ==> ");
        tempPrice = in.nextFloat();
        System.out.println("Quantité en stock ==> ");
        tempQty = in.nextInt();

        products[i] = new CD(tempNumber, tempName, tempQty, tempPrice, tempArtist, tempNbTitres, tempMson);

    }

    public static void addDVDToInventory(Product[] products, Scanner in, int i) {
        int tempQty, tempNumber, tempAge, tempMinutes;
        String tempName, tempStudio;
        float tempPrice;

        in.nextLine();

        System.out.println("Nom du DVD ==> ");
        tempName = in.nextLine();
        System.out.println("Nom du studio ==> ");
        tempStudio = in.nextLine();
        System.out.println("Âge ==> ");
        tempAge = in.nextInt();
        System.out.println("Numero ==> ");
        tempNumber = in.nextInt();
        System.out.println("Durée en minute ==> ");
        tempMinutes = in.nextInt();
        System.out.println("Prix ==> ");
        tempPrice = in.nextFloat();
        System.out.println("Quantité en stock ==> ");
        tempQty = in.nextInt();

        products[i] = new DVD(tempNumber, tempName, tempQty, tempPrice, tempMinutes, tempAge, tempStudio);

    }

    public static int getNumProducts(Scanner in) {
        int maxSize = -1;

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

        return maxSize;
    }

    public static void addInventory(Product[] products, Scanner in, int i) {
//        int productChoice, updateValue = -1;
//        productChoice = Main.getProductNumber(products, in);

//        try {
//            do {
//                System.out.println("Combien des produits voulez-vous ajouter ?");
//                updateValue = in.nextInt();
//                if (updateValue < 0) {
//                    System.out.println("Valeur incorrecte saisie");
//                }
//            } while (updateValue < 0);
//        } catch (InputMismatchException e) {
//            System.out.println("Type de données incorrect saisi");
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//        products[productChoice].addToInventory(updateValue);
        int stockChoice = -1;

        try {
            do {
                System.out.println("1. CD ");
                System.out.println("2. DVD ");
                System.out.println("Veuillez saisir le type de produit : ");
                stockChoice = in.nextInt();

                if (stockChoice < 1 || stockChoice > 2) {
                    System.out.println("Valeur incorrecte saisie");
                }
            } while (stockChoice < 1 || stockChoice > 2);
        }  catch (InputMismatchException e) {
            System.out.println("Type de données incorrect saisi");
        } catch (Exception e) {
            System.out.println(e);
        }

        if (stockChoice == 1) {
            Main.addCDToInventory(products, in, i);
        } else {
            Main.addDVDToInventory(products, in, i);
        }
    }

    public static void deductInventory(Product[] products, Scanner in) {
        int productChoice, updateValue = -1;

        productChoice = Main.getProductNumber(products, in);

        try {
            do {
                System.out.println("Combien des produits voulez-vous déduire ?");
                updateValue = in.nextInt();
                if (updateValue < 0 || updateValue > products[productChoice].getQuantite()) {
                    System.out.println("Valeur incorrecte saisie");
                }
            } while (updateValue < 0 || updateValue > products[productChoice].getQuantite());
        } catch (InputMismatchException e) {
            System.out.println("Type de données incorrect saisi");
        } catch (Exception e) {
            System.out.println(e);
        }

        products[productChoice].deductFromInventory(updateValue);
    }

    public static void discontinueInventory(Product[] products, Scanner in) {
        int productChoice;

        productChoice = Main.getProductNumber(products, in);
        products[productChoice].setActive(false);
    }

    public static void executeMenuChoice(int menuChoice, Product[] products, Scanner in) {
        switch (menuChoice) {
            case 1:
                System.out.println("Afficher la liste des produits");
                Main.displayInventory(products);
                break;
            case 2:
                System.out.println("Ajouter une quantité de stock");
                // To do le "i" doit normalement provenir de quelque part dans l'exercice suivante
                Main.addInventory(products, in, 0);
                break;
            case 3:
                System.out.println("Déduire une quantité de stock");
                Main.deductInventory(products, in);
                break;
            case 4:
                System.out.println("Ne pas réapprovisionner le stock");
                Main.discontinueInventory(products, in);
                break;
        }
    }

}
