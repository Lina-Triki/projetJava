package view;

import javax.swing.*;
import java.awt.*;


public class FenetreNouvelleReservation extends JFrame {
    JPanel infoClient = new JPanel(new GridLayout(3,0,1,10));
    JPanel infoVoiture = new JPanel(new GridLayout(3,1,1,10));
    JPanel panelServices = new JPanel(new GridLayout(3,2,0,10));
    JPanel panelBtnCalcul = new JPanel(new FlowLayout());
    JPanel panelResultat = new JPanel(new GridLayout(4, 2, 10, 5));
    JPanel panelBoutonsBas = new JPanel(new FlowLayout());
    JPanel NouvRes = new JPanel(new GridLayout(6,0,1,10));

    public FenetreNouvelleReservation() {
        setTitle("Nouvelle réservation");
        setSize(1000, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container contentPane1 = getContentPane();
        contentPane1.setLayout(new FlowLayout());
        contentPane1.add(infoClient);
        JLabel nomLabel = new JLabel("Nom :");
        JTextField nom = new JTextField();
        JLabel prenomLabel = new JLabel("Prénom :");
        JTextField prenom = new JTextField();
        JLabel telLabel = new JLabel("Teléphone :");
        JTextField tel = new JTextField();
        infoClient.add(nomLabel);
        infoClient.add(nom);
        infoClient.add(prenomLabel);
        infoClient.add(prenom);
        infoClient.add(telLabel);
        infoClient.add(tel);
        contentPane1.add(infoVoiture);
        JLabel categorie1 = new JLabel("Categorie :");
        JComboBox <String> categorie = new JComboBox<>();
        categorie.addItem("Économique");
        categorie.addItem("Classique");
        categorie.addItem("Luxe");
        infoVoiture.add(categorie1);
        infoVoiture.add(categorie);
        JLabel Voiture1 = new JLabel("Voiture :");
        JComboBox Voiture = new JComboBox();
        infoVoiture.add(Voiture1);
        infoVoiture.add(Voiture);
        JLabel duree = new JLabel("Duree(jours) :");
        JTextField dureeText = new JTextField();
        infoVoiture.add(duree);
        infoVoiture.add(dureeText);
        contentPane1.add(NouvRes);
        NouvRes.add(infoClient);
        NouvRes.add(infoVoiture);
        contentPane1.add(panelServices);
        JCheckBox assurance = new JCheckBox("Assurance 20dt/j");
        JCheckBox gps = new JCheckBox("GPS 10dt/j");
        JCheckBox conduc = new JCheckBox("Conducteur suppl. (15 DT/j)");
        JCheckBox siegeb = new JCheckBox("Siège bébé (8 DT/j)");
        panelServices.add(assurance);
        panelServices.add(gps);
        panelServices.add(conduc);
        panelServices.add(siegeb);
        NouvRes.add(panelServices);
        BoutonStyle calculer = new BoutonStyle("Calculer");
        panelBtnCalcul.add(calculer);
        NouvRes.add(panelBtnCalcul);
        JLabel totalLabel = new JLabel("Total :");
        JTextField totalField = new JTextField();
        JLabel reductionLabel = new JLabel("Réduction (%) :");
        JTextField reductionField = new JTextField();
        JLabel montantReductionLabel = new JLabel("Montant de la réduction :");
        JTextField montantReductionField = new JTextField();
        JLabel totalAPayerLabel = new JLabel("TOTAL À PAYER :");
        JTextField totalAPayerField = new JTextField();
        panelResultat.add(totalLabel);
        panelResultat.add(totalField);
        panelResultat.add(reductionLabel);
        panelResultat.add(reductionField);
        panelResultat.add(montantReductionLabel);
        panelResultat.add(montantReductionField);
        panelResultat.add(totalAPayerLabel);
        panelResultat.add(totalAPayerField);
        NouvRes.add(panelResultat);
        BoutonStyle confirmer = new BoutonStyle("Confirmer");
        BoutonStyle annuler = new BoutonStyle("Annuler");
        panelBoutonsBas.add(confirmer);
        panelBoutonsBas.add(annuler);
        NouvRes.add(panelBoutonsBas);



    }
}
