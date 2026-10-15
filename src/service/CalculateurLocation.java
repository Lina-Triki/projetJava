package service;

import model.Reservation;
import model.Voiture;

public class CalculateurLocation {
    public double calculerMontantTotal(Reservation reservation) {
        if (reservation == null || reservation.getVoiture() == null) {
            return 0;
        }

        Voiture voiture = reservation.getVoiture();
        long jours = java.time.temporal.ChronoUnit.DAYS.between(
                reservation.getDateDebut(), reservation.getDateFin());

        return voiture.getPrixJournalier() * Math.max(1, jours);
    }
}
