package view;

import javax.swing.*;
import java.awt.*;
public class FenetrePrincipale extends JFrame {
    BoutonStyle nouvelleReservation = new BoutonStyle("Nouvelle réservation");
    BoutonStyle gestionVoitures = new BoutonStyle("Gestion des voitures");
    BoutonStyle gestionReservations = new BoutonStyle("Gestion réservation");
    BoutonStyle quitter = new BoutonStyle("Quitter");
    JPanel boutonPanel = new JPanel(new GridLayout(5, 1, 0, 12));
    JPanel wrapperPanel = new JPanel(new GridBagLayout());
    JLabel titre = new JLabel("Gestion de location de voitures");

    public FenetrePrincipale() {
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        titre.setHorizontalAlignment(SwingConstants.CENTER);
        titre.setFont(new Font("Segoe UI", Font.BOLD, 28));
        titre.setForeground(new Color(30, 136, 229));
        boutonPanel.add(titre);
        boutonPanel.add(nouvelleReservation);
        boutonPanel.add(gestionVoitures);
        boutonPanel.add(gestionReservations);
        boutonPanel.add(quitter);
        wrapperPanel.add(boutonPanel);
        contentPane.add(wrapperPanel, BorderLayout.CENTER);
        setTitle("Location des voitures");
        setSize(1000, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nouvelleReservation.addActionListener(e -> {
            new FenetreNouvelleReservation().setVisible(true);
        });

    }
}
