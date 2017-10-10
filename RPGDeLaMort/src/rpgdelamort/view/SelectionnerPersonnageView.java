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
import java.lang.reflect.Array;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import rpgdelamort.model.Arme;
import rpgdelamort.model.Armure;
import rpgdelamort.model.Classe;
import rpgdelamort.model.Personnage;
import static rpgdelamort.view.GetComboItem.getListPersonnage;

/**
 *
 * @author Stefano
 */
public class SelectionnerPersonnageView extends JPanel implements ActionListener {

    private JFrame fenetre;
    private JLabel nomPartie;
    private JLabel J1;
    private JLabel J2;
    private JButton valider;
    private JButton annuler;
    private JComboBox joueur1;
    private JComboBox joueur2;
    private JRadioButton uneManche;
    private JRadioButton troisManche;
    private ButtonGroup manche;
    private JLabel titreManche;
    private String joueur1Select;
    private String joueur2Select;
    private String[] idJoueur;

    public SelectionnerPersonnageView(JFrame fenetre) {
        Font font = new Font("SF Slapstick Comic Shaded", Font.BOLD, 20);
        this.setPreferredSize(new Dimension(600, 400));
        this.fenetre = fenetre;

        nomPartie = new JLabel("RPG DE LA MORT", JLabel.CENTER);
        nomPartie.setFont(font);
        nomPartie.setForeground(new Color(205, 133, 63));
        nomPartie.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
        J1 = new JLabel("Joueur 1");
        J1.setFont(font);
        J1.setForeground(new Color(255, 140, 0));
        J1.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        J2 = new JLabel("Joueur 2");
        J2.setFont(font);
        J2.setForeground(new Color(255, 140, 0));
        J2.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        titreManche = new JLabel("Nombre de Manche");
        titreManche.setFont(font);
        titreManche.setForeground(new Color(255, 140, 0));
        titreManche.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        valider = new JButton("Valider");
        valider.setFocusable(false);
        valider.setPreferredSize(new Dimension(400, 50));
        valider.setFont(font);
        valider.setForeground(new Color(255, 140, 0));
        valider.setContentAreaFilled(false);
        valider.setBorder(null);
        valider.setBackground(new Color(255, 0, 255, 0));
        valider.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 0));

        annuler = new JButton("Annuler");
        annuler.setFocusable(false);
        annuler.setPreferredSize(new Dimension(400, 50));
        annuler.setFont(font);
        annuler.setForeground(new Color(255, 140, 0));
        annuler.setContentAreaFilled(false);
        annuler.setBorder(null);
        annuler.setBackground(new Color(255, 0, 255, 0));
        annuler.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 0));
        // String couleur[] = {"orange", "rouge", "jaune", "vert", "noir", "bleu ciel", "bleu", "jade", "amarante", "blanc"};
        Vector perso = getListPersonnage();
        joueur1 = new JComboBox(perso);
        joueur1.setOpaque(false);
        joueur1.setFont(font);
        joueur1.setForeground(new Color(50, 50, 50));
        joueur1.setFocusable(false);
        joueur1.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 20));

        joueur2 = new JComboBox(perso);

        joueur2.setOpaque(false);
        joueur2.setFont(font);
        joueur2.setForeground(new Color(50, 50, 50));
        joueur2.setFocusable(false);
        joueur2.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 20));

        uneManche = new JRadioButton("1 Manche");
        uneManche.setOpaque(false);
        uneManche.setFont(font);
        uneManche.setForeground(new Color(255, 140, 0));
        uneManche.setFocusable(false);

        troisManche = new JRadioButton("3 Manche");
        troisManche.setOpaque(false);
        troisManche.setFont(font);
        troisManche.setForeground(new Color(255, 140, 0));
        troisManche.setFocusable(false);
        manche = new ButtonGroup();

        manche.add(uneManche);
        manche.add(troisManche);
        uneManche.setSelected(true);
        valider.addActionListener(this);
        annuler.addActionListener(this);
        initialisation();
    }

    public void initialisation() {
        Font font = new Font("SF Slapstick Comic Shaded", Font.BOLD, 35);

        this.setLayout(new GridBagLayout());

        GridBagConstraints cont = new GridBagConstraints();

        cont.fill = GridBagConstraints.BOTH;
        cont.gridx = 0;
        cont.gridy = 0;
        cont.gridwidth = 4;
        this.add(nomPartie, cont);
        cont.gridx = 0;
        cont.gridy = 2;
        cont.gridwidth = 2;
        this.add(J1, cont);
        cont.gridx = 3;
        cont.gridy = 2;
        this.add(J2, cont);

        cont.gridx = 0;
        cont.gridy = 3;
        this.add(joueur1, cont);
        cont.gridx = 2;
        cont.gridy = 3;
        this.add(joueur2, cont);

        cont.gridx = 0;
        cont.gridy = 4;
        cont.gridheight = 2;
        cont.fill = GridBagConstraints.CENTER;
        this.add(titreManche, cont);

        cont.gridx = 2;
        cont.gridy = 4;
        cont.gridheight = 1;
        cont.fill = GridBagConstraints.CENTER;
        this.add(uneManche, cont);

        cont.gridx = 2;
        cont.gridy = 5;
        cont.fill = GridBagConstraints.CENTER;
        this.add(troisManche, cont);

        cont.gridx = 0;
        cont.gridy = 6;
        cont.fill = GridBagConstraints.CENTER;

        this.add(valider, cont);
        cont.gridx = 2;
        cont.gridy = 6;
        cont.fill = GridBagConstraints.CENTER;
        this.add(annuler, cont);

        fenetre.setContentPane(this);
        fenetre.pack();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == annuler) {
            Menu menu = new Menu(fenetre);
            fenetre.setContentPane(menu);
            fenetre.pack();
        } else if (e.getSource() == valider) {
            Personnage p1, p2;
            Arme a1, a2;
            Armure ar1, ar2;
            Classe cl1, cl2;
            int nbManche;
            if(uneManche.isSelected()){
                nbManche=1;
            }else{
                nbManche=3;
            }
            try {
                SqliteConnection maBase = new SqliteConnection("rpg");
                joueur1Select = (String) joueur1.getSelectedItem();
                joueur2Select = (String) joueur2.getSelectedItem();
                idJoueur = joueur1Select.split("-");
                System.out.println(idJoueur[0]);

                ResultSet rs = maBase.getInstance().createStatement().executeQuery("SELECT * FROM Personnage INNER JOIN Arme ON idArmePersonnage=idArme "
                        + "INNER JOIN Armure ON idArmurePersonnage=idArmure INNER JOIN Classe ON idClassePersonnage=idClasse Where idPersonnage=" + idJoueur[0]);
                rs.next();
                a1 = new Arme(rs.getInt("idArme"), rs.getString("nomArme"), rs.getFloat("impactVitesseArme"), rs.getFloat("attaqueMinArme"), rs.getFloat("attaqueMaxArme"), rs.getFloat("chanceCritArme"), rs.getFloat("degaCritArme"));
                ArrayList<Arme> tabArme = new ArrayList<>();
                tabArme.add(a1);
                ar1 = new Armure(rs.getInt("idArmure"), rs.getString("nomArme"), rs.getFloat("impactVitesseArme"), rs.getFloat("defenseArmure"));
                cl1 = new Classe(rs.getInt("idClasse"), rs.getString("nomClasse"), rs.getFloat("multiplicateurPVClasse"), rs.getFloat("multiplicateurVitesseClasse"), rs.getFloat("multiplicateurAttaqueClasse"), rs.getFloat("multiplicateurDefenseClasse"));
                p1 = new Personnage(rs.getInt("idPersonnage"), rs.getString("nomPersonnage"), rs.getFloat("pvPersonnage"), rs.getInt("niveauPersonnage"), rs.getDouble("progressionPersonnage"), rs.getFloat("vitessePersonnage"), rs.getFloat("defensePersonnage"), rs.getFloat("forcePersonnage"), tabArme, ar1, cl1);
                idJoueur = joueur2Select.split("-");
                System.out.println(idJoueur[0]);
                rs = maBase.getInstance().createStatement().executeQuery("SELECT * FROM Personnage INNER JOIN Arme ON idArmePersonnage=idArme "
                        + "INNER JOIN Armure ON idArmurePersonnage=idArmure INNER JOIN Classe ON idClassePersonnage=idClasse Where idPersonnage=" + idJoueur[0]);

                rs.next();
                a2 = new Arme(rs.getInt("idArme"), rs.getString("nomArme"), rs.getFloat("impactVitesseArme"), rs.getFloat("attaqueMinArme"), rs.getFloat("attaqueMaxArme"), rs.getFloat("chanceCritArme"), rs.getFloat("degaCritArme"));
                tabArme = new ArrayList<>();
                tabArme.add(a2);
                ar2 = new Armure(rs.getInt("idArmure"), rs.getString("nomArme"), rs.getFloat("impactVitesseArme"), rs.getFloat("defenseArmure"));
                cl2 = new Classe(rs.getInt("idClasse"), rs.getString("nomClasse"), rs.getFloat("multiplicateurPVClasse"), rs.getFloat("multiplicateurVitesseClasse"), rs.getFloat("multiplicateurAttaqueClasse"), rs.getFloat("multiplicateurDefenseClasse"));
                p2 = new Personnage(rs.getInt("idPersonnage"), rs.getString("nomPersonnage"), rs.getFloat("pvPersonnage"), rs.getInt("niveauPersonnage"), rs.getDouble("progressionPersonnage"), rs.getFloat("vitessePersonnage"), rs.getFloat("defensePersonnage"), rs.getFloat("forcePersonnage"), tabArme, ar2, cl2);
                rs.close();
                System.out.println(nbManche);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // paint the background image and scale it to fill the entire space
        try {
            Image img = ImageIO.read(new File("background2.jpg"));
            g.drawImage(img, 0, 0, null);
        } catch (IOException ex) {
        }

    }

}
