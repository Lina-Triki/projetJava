package model;

public class Voiture {
    private String immatriculation;
    private String marque;
    private String modele;
    private Categorie categorie;
    private double prixJournalier;

    public Voiture() {
    }

    public Voiture(String immatriculation, String marque, String modele, Categorie categorie, double prixJournalier) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.modele = modele;
        this.categorie = categorie;
        this.prixJournalier = prixJournalier;
    }

    public String getImmatriculation() { return immatriculation; }
    public void setImmatriculation(String immatriculation) { this.immatriculation = immatriculation; }
    public String getMarque() { return marque; }
    public void setMarque(String marque) { this.marque = marque; }
    public String getModele() { return modele; }
    public void setModele(String modele) { this.modele = modele; }
    public Categorie getCategorie() { return categorie; }
    public void setCategorie(Categorie categorie) { this.categorie = categorie; }
    public double getPrixJournalier() { return prixJournalier; }
    public void setPrixJournalier(double prixJournalier) { this.prixJournalier = prixJournalier; }
}
