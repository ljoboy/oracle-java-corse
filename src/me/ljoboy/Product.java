package me.ljoboy;

public class Product {
    private int numero;
    private String nom;
    private int quantite;
    private float prix;

    public Product() {
    }

    public Product(int numero, String nom, int quantite, float prix) {
        this.numero = numero;
        this.nom = nom;
        this.quantite = quantite;
        this.prix = prix;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Product{" +
                "numero=" + numero +
                ", nom='" + nom + '\'' +
                ", quantite=" + quantite +
                ", prix=" + prix +
                '}';
    }
}
