package me.ljoboy;

public class DVD extends Product {
    private int duree;
    private int age;
    private String studio;

    public DVD(int numero, String nom, int quantite, float prix, int duree, int age, String studio) {
        super(numero, nom, quantite, prix);
        this.duree = duree;
        this.age = age;
        this.studio = studio;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    @Override
    public float getInventoryValue() {
        return (super.getInventoryValue() * 5) / 100;
    }

    @Override
    public String toString() {
        return "Numéro de l'article  : " + getNumero() + '\n' +
                "Nom                 : " + getNom() + '\n' +
                "Quantité en stock   : " + getQuantite() + '\n' +
                "Durée du film       : " + getDuree() + '\n' +
                "Classification d'âge: " + getAge() + '\n' +
                "Studio              : " + getStudio() + '\n' +
                "Prix                : " + getPrix() + '\n' +
                "Valeur du stock     : " + getInventoryValue() + '\n' +
                "Statut du produit   : " + (isActive() ? "Réapprovisionné" : "Non réaprovisionné");
    }
}
