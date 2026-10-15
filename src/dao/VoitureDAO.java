package dao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import model.Categorie;
import model.Voiture;

public class VoitureDAO {
    private static final Path FICHIER = Paths.get("data", "voitures.txt");

    public List<Voiture> lireToutes() {
        List<Voiture> voitures = new ArrayList<>();
        if (!Files.exists(FICHIER)) {
            return voitures;
        }

        try {
            List<String> lignes = Files.readAllLines(FICHIER);
            for (String ligne : lignes) {
                if (ligne == null || ligne.isBlank()) {
                    continue;
                }
                String[] parts = ligne.split(";");
                if (parts.length >= 5) {
                    voitures.add(new Voiture(
                            parts[0],
                            parts[1],
                            parts[2],
                            Categorie.valueOf(parts[3]),
                            Double.parseDouble(parts[4])
                    ));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return voitures;
    }

    public void enregistrer(List<Voiture> voitures) {
        try {
            List<String> lignes = new ArrayList<>();
            for (Voiture voiture : voitures) {
                lignes.add(String.join(";",
                        voiture.getImmatriculation(),
                        voiture.getMarque(),
                        voiture.getModele(),
                        voiture.getCategorie().name(),
                        String.valueOf(voiture.getPrixJournalier())));
            }
            Files.createDirectories(FICHIER.getParent());
            Files.write(FICHIER, lignes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
