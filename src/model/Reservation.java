package model;

import java.time.LocalDate;

public class Reservation {
    private int id;
    private Voiture voiture;
    private Client client;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private double montant;

    public Reservation() {
    }

    public Reservation(int id, Voiture voiture, Client client, LocalDate dateDebut, LocalDate dateFin, double montant) {
        this.id = id;
        this.voiture = voiture;
        this.client = client;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.montant = montant;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public Voiture getVoiture() { return voiture; }
    public void setVoiture(Voiture voiture) { this.voiture = voiture; }
    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }
    public LocalDate getDateDebut() { return dateDebut; }
    public void setDateDebut(LocalDate dateDebut) { this.dateDebut = dateDebut; }
    public LocalDate getDateFin() { return dateFin; }
    public void setDateFin(LocalDate dateFin) { this.dateFin = dateFin; }
    public double getMontant() { return montant; }
    public void setMontant(double montant) { this.montant = montant; }
}
