package dao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import model.Reservation;

public class ReservationDAO {
    private static final Path FICHIER = Paths.get("data", "reservations.txt");

    public List<Reservation> lireToutes() {
        List<Reservation> reservations = new ArrayList<>();
        if (!Files.exists(FICHIER)) {
            return reservations;
        }

        try {
            List<String> lignes = Files.readAllLines(FICHIER);
            for (String ligne : lignes) {
                if (ligne == null || ligne.isBlank()) {
                    continue;
                }
                reservations.add(new Reservation());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return reservations;
    }

    public void enregistrer(List<Reservation> reservations) {
        try {
            Files.createDirectories(FICHIER.getParent());
            List<String> lignes = new ArrayList<>();
            for (Reservation reservation : reservations) {
                lignes.add(String.valueOf(reservation.getId()));
            }
            Files.write(FICHIER, lignes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
