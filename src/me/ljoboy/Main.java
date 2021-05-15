package me.ljoboy;

public class Main {

    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();

        Product p3 = new Product(3, "Disque dur", 500, 80f);
        Product p4 = new Product(4, "Stylo", 270, 1f);
        Product p5 = new Product(5, "Bracelet", 200, 2.5f);
        Product p6 = new Product(6, "Bague", 250, 1.5f);
    }
}
