package me.ljoboy;

public class CD extends Product {
    private String Artiste;
    private int nb_titres;
    private String mson_Disque;

    public CD(int numero, String nom, int quantite, float prix, String artiste, int nb_titres, String mson_Disque) {
        super(numero, nom, quantite, prix);
        Artiste = artiste;
        this.nb_titres = nb_titres;
        this.mson_Disque = mson_Disque;
    }

    public String getArtiste() {
        return Artiste;
    }

    public void setArtiste(String artiste) {
        Artiste = artiste;
    }

    public int getNb_titres() {
        return nb_titres;
    }

    public void setNb_titres(int nb_titres) {
        this.nb_titres = nb_titres;
    }

    public String getMson_Disque() {
        return mson_Disque;
    }

    public void setMson_Disque(String mson_Disque) {
        this.mson_Disque = mson_Disque;
    }
}
