package me.ljoboy;

public class Product {
    private int numero;
    private String nom;
    private int quantite;
    private float prix;
    private boolean active;

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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public float getInventoryValue() {
        return quantite * prix;
    }

    @Override
    public String toString() {
        return "Numéro de l'article : " + numero + '\n' +
                "Nom                : " + nom + '\n' +
                "Quantité en stock  : " + quantite + '\n' +
                "Prix               : " + prix + '\n' +
                "Valeur du stock    : " + getInventoryValue() + '\n' +
                "Statut du produit  : " + (isActive() ? "Réapprovisionné" : "Non réaprovisionné");
    }
}
