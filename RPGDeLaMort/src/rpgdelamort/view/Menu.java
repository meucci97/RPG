/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpgdelamort.view;

import Singleton.SqliteConnection;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import rpgdelamort.model.Arme;
import rpgdelamort.model.Armure;
import rpgdelamort.model.Classe;
import rpgdelamort.model.Personnage;

/**
 *
 * @author p1511075
 */
public class Menu extends JPanel implements ActionListener {

    private JFrame fenetre;
    private JLabel titre;
    private JButton start;
    private JButton tournoi;
    private JButton edition;

    public Menu(JFrame fenetre) {
        this.setPreferredSize(new Dimension(600, 400));
        this.setBackground(new Color(237, 255, 12));
        this.fenetre = fenetre;
        titre = new JLabel("RPG DE LA MORT", JLabel.CENTER);
        start = new JButton("Lancer une partie");
        tournoi = new JButton("Lancer un tournoi");
        edition = new JButton("Mode Edition");
        start.addActionListener(this);
        tournoi.addActionListener(this);
        edition.addActionListener(this);

        initialisation();
    }

    public void initialisation() {
        Font font = new Font("SF Slapstick Comic Shaded", Font.BOLD, 35);
        this.setLayout(new GridBagLayout());
        GridBagConstraints cont = new GridBagConstraints();

        cont.fill = GridBagConstraints.BOTH;

        cont.gridx = 0;
        titre.setFont(new Font("SF Slapstick Comic Shaded", Font.BOLD, 55));
        titre.setForeground(new Color(205, 133, 63));
        titre.setBorder(BorderFactory.createEmptyBorder(0, 20, 20, 20));
        this.add(titre, cont);
        cont.gridy = 1;
        start.setFocusable(false);
        start.setPreferredSize(new Dimension(400, 50));
        start.setFont(font);
        start.setForeground(new Color(255, 140, 0));
        start.setContentAreaFilled(false);
        start.setBorder(null);
        start.setBackground(new Color(0, 0, 0, 0));
        this.add(start, cont);
        cont.gridy = 2;
        tournoi.setFocusable(false);
        tournoi.setPreferredSize(new Dimension(400, 50));
        tournoi.setFont(font);
        tournoi.setForeground(new Color(255, 140, 0));
        tournoi.setContentAreaFilled(false);
        tournoi.setBorder(null);
        tournoi.setBackground(new Color(255, 0, 255, 0));
        this.add(tournoi, cont);
        cont.gridy = 3;
        edition.setFocusable(false);
        edition.setPreferredSize(new Dimension(400, 50));
        edition.setFont(font);
        edition.setForeground(new Color(255, 140, 0));
        edition.setContentAreaFilled(false);
        edition.setBorder(null);
        edition.setBackground(new Color(255, 0, 255, 0));
        this.add(edition, cont);
        fenetre.setContentPane(this);
        fenetre.pack();

    }

    public void lancerTournoi() {
        int i=0;
         ArrayList<Personnage> tabPersonnage;
         tabPersonnage = new ArrayList();
        try{
        SqliteConnection maBase = new SqliteConnection("rpg");
        
        Arme a1;
        Armure ar1;
        Classe cl1;
        
        ArrayList<Arme> tabArme = new ArrayList<>();
        ResultSet rs = maBase.getInstance().createStatement().executeQuery("SELECT * FROM Personnage INNER JOIN Arme ON idArmePersonnage=idArme "
                + "INNER JOIN Armure ON idArmurePersonnage=idArmure INNER JOIN Classe ON idClassePersonnage=idClasse");
            while (rs.next()) {
                a1 = new Arme(rs.getInt("idArme"), rs.getString("nomArme"), rs.getFloat("impactVitesseArme"), rs.getFloat("attaqueMinArme"), rs.getFloat("attaqueMaxArme"), rs.getFloat("chanceCritArme"), rs.getFloat("degaCritArme"));
                tabArme.add(a1);
                ar1 = new Armure(rs.getInt("idArmure"), rs.getString("nomArme"), rs.getFloat("impactVitesseArme"), rs.getFloat("defenseArmure"));
                cl1 = new Classe(rs.getInt("idClasse"), rs.getString("nomClasse"), rs.getFloat("multiplicateurPVClasse"), rs.getFloat("multiplicateurVitesseClasse"), rs.getFloat("multiplicateurAttaqueClasse"), rs.getFloat("multiplicateurDefenseClasse"));
                tabPersonnage.add(new Personnage(rs.getInt("idPersonnage"), rs.getString("nomPersonnage"), rs.getFloat("pvPersonnage"), rs.getInt("niveauPersonnage"), rs.getDouble("progressionPersonnage"), rs.getFloat("vitessePersonnage"), rs.getFloat("defensePersonnage"), rs.getFloat("forcePersonnage"), tabArme, ar1, cl1) );
                tabArme.clear();
                i++;
            }
            rs.close();
        }catch(Exception e){
            
        }
       if(i==0){
            JOptionPane.showMessageDialog(fenetre,
                            "Veuillez ajouter des personnages dans la base de données",
                            "Erreur nombre de personnage",
                            JOptionPane.ERROR_MESSAGE);
       }else{
           JOptionPane.showMessageDialog(fenetre, "Veuillez regarder la console pour le deroulement du combat");
       }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) {
            SelectionnerPersonnageView selectionnerPerso = new SelectionnerPersonnageView(fenetre);
            fenetre.setContentPane(selectionnerPerso);
            fenetre.pack();
        } else if (e.getSource() == tournoi) {
            lancerTournoi();
        } else if (e.getSource() == edition) {
            ModeEditionView modeEdition = new ModeEditionView(fenetre);
            fenetre.setContentPane(modeEdition);
            fenetre.pack();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // paint the background image and scale it to fill the entire space
        try {
            Image img = ImageIO.read(new File("background2.jpg"));
            g.drawImage(img, 0, 0, null);
        } catch (IOException ex) {
            System.out.println("ERROR");
        }

    }
}
