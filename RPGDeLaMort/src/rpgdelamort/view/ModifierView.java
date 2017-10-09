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
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import static rpgdelamort.view.GetComboItem.getListArme;
import static rpgdelamort.view.GetComboItem.getListArmure;

/**
 *
 * @author Stefano
 */
public class ModifierView extends javax.swing.JPanel implements ActionListener{

    private JFrame fenetre;
    private javax.swing.JButton btnValiderArme;
    private javax.swing.JButton btnValiderArmure;
    private javax.swing.JButton btnValiderPersonnage;
    private javax.swing.JComboBox<String> cbArmePersonnage;
    private javax.swing.JComboBox<String> cbArmurePersonnage;
    private javax.swing.JComboBox<String> cbClasse;
    private javax.swing.JComboBox<String> cbIDArme;
    private javax.swing.JComboBox<String> cbIDArmure;
    private javax.swing.JComboBox<String> cbIDPersonnage;
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtAttaqueMaxArme;
    private javax.swing.JTextField txtAttaqueMinArme;
    private javax.swing.JTextField txtChanceCritArme;
    private javax.swing.JTextField txtDefense;
    private javax.swing.JTextField txtDefensePersonnage;
    private javax.swing.JTextField txtDegatCritArme;
    private javax.swing.JTextField txtForcePersonnage;
    private javax.swing.JTextField txtImpactVitesseArme;
    private javax.swing.JTextField txtImpactVitesseArmure;
    private javax.swing.JTextField txtNiveauPersonnage;
    private javax.swing.JTextField txtNomArme;
    private javax.swing.JTextField txtNomArmure;
    private javax.swing.JTextField txtNomPersonnage;
    private javax.swing.JTextField txtPVPersonnage;
    private javax.swing.JTextField txtVitessePersonnage;

    public ModifierView(JFrame fenetre) {
        this.fenetre = fenetre;
        Font font = new Font("SF Slapstick Comic Shaded", Font.BOLD, 20);

        this.setPreferredSize(new Dimension(600, 400));
        this.setBackground(new Color(237, 255, 12));

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); // paint the background image and scale it to fill the entire space
                try {
                    Image img = ImageIO.read(new File("background2.jpg"));
                    g.drawImage(img, 0, 0, null);
                } catch (IOException ex) {
                    // Logger.getLogger(vuePartie.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        };
        jLabel1 = new javax.swing.JLabel();
        txtNomPersonnage = new javax.swing.JTextField();
        txtPVPersonnage = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtForcePersonnage = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtVitessePersonnage = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDefensePersonnage = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNiveauPersonnage = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbArmePersonnage = new javax.swing.JComboBox(getListArme());
        cbArmePersonnage.setSelectedIndex(0);

        jLabel9 = new javax.swing.JLabel();
        cbArmurePersonnage = new javax.swing.JComboBox(getListArmure());
        cbArmurePersonnage.setSelectedIndex(0);
        jLabel10 = new javax.swing.JLabel();
        cbClasse = new javax.swing.JComboBox(GetComboItem.getListClasse());
        btnValiderPersonnage = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); // paint the background image and scale it to fill the entire space
                try {
                    Image img = ImageIO.read(new File("background2.jpg"));
                    g.drawImage(img, 0, 0, null);
                } catch (IOException ex) {
                    // Logger.getLogger(vuePartie.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        };
        jLabel11 = new javax.swing.JLabel();
        txtNomArme = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtImpactVitesseArme = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtAttaqueMinArme = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtChanceCritArme = new javax.swing.JTextField();
        txtAttaqueMaxArme = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtDegatCritArme = new javax.swing.JTextField();
        btnValiderArme = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); // paint the background image and scale it to fill the entire space
                try {
                    Image img = ImageIO.read(new File("background2.jpg"));
                    g.drawImage(img, 0, 0, null);
                } catch (IOException ex) {
                    // Logger.getLogger(vuePartie.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        };
        jLabel18 = new javax.swing.JLabel();
        txtNomArmure = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtDefense = new javax.swing.JTextField();
        txtImpactVitesseArmure = new javax.swing.JTextField();

        btnValiderArmure = new javax.swing.JButton();
        btnAnnuler = new javax.swing.JButton();

        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cbIDPersonnage = new javax.swing.JComboBox(GetComboItem.getListPersonnage());
        cbIDArme = new javax.swing.JComboBox(GetComboItem.getListArme());
        cbIDArmure = new javax.swing.JComboBox(GetComboItem.getListArmure());

        jLabel13.setFont(font);
        jLabel13.setForeground(new Color(255, 140, 0));
        jLabel13.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        jLabel7.setFont(font);
        jLabel7.setForeground(new Color(255, 140, 0));
        jLabel7.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        jLabel19.setFont(font);
        jLabel19.setForeground(new Color(255, 140, 0));
        jLabel19.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        jPanel1.setBackground(new Color(255, 0, 255, 0));
        jLabel1.setText("Nom: ");
        jLabel1.setFont(font);
        jLabel1.setForeground(new Color(255, 140, 0));
        jLabel1.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        jLabel2.setText("PV:");
        jLabel2.setFont(font);
        jLabel2.setForeground(new Color(255, 140, 0));
        jLabel2.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        jLabel3.setText("Force: ");
        jLabel3.setFont(font);
        jLabel3.setForeground(new Color(255, 140, 0));
        jLabel3.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        jLabel4.setText("Vitesse: ");
        jLabel4.setFont(font);
        jLabel4.setForeground(new Color(255, 140, 0));
        jLabel4.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        jLabel5.setText("Defense:");
        jLabel5.setFont(font);
        jLabel5.setForeground(new Color(255, 140, 0));
        jLabel5.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        jLabel6.setText("Niveau:");
        jLabel6.setFont(font);
        jLabel6.setForeground(new Color(255, 140, 0));
        jLabel6.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        jLabel8.setText("Arme: ");
        jLabel8.setFont(font);
        jLabel8.setForeground(new Color(255, 140, 0));
        jLabel8.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        jLabel9.setText("Armure:");
        jLabel9.setFont(font);
        jLabel9.setForeground(new Color(255, 140, 0));
        jLabel9.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        jLabel10.setText("Classe:");
        jLabel10.setFont(font);
        jLabel10.setForeground(new Color(255, 140, 0));
        jLabel10.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        btnValiderPersonnage.setText("Valider");

        jTabbedPane1.addTab("Personnage", jPanel1);

        jLabel11.setText("Nom:");
        jLabel11.setForeground(new Color(255, 140, 0));
        jLabel11.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        jLabel12.setText("Impact Vitesse:");
        jLabel12.setForeground(new Color(255, 140, 0));
        jLabel12.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        jLabel14.setText("Attaque Min:");
        jLabel14.setForeground(new Color(255, 140, 0));
        jLabel14.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        jLabel15.setText("Attaque Max: ");
        jLabel15.setForeground(new Color(255, 140, 0));
        jLabel15.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        jLabel16.setText("Chance Critique:");
        jLabel16.setForeground(new Color(255, 140, 0));
        jLabel16.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        jLabel17.setText("Degat Critique:");
        jLabel17.setForeground(new Color(255, 140, 0));
        jLabel17.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        btnValiderArme.setText("Valider");

        jTabbedPane1.addTab("Arme", jPanel2);

        jLabel18.setText("Nom:");
        jLabel18.setForeground(new Color(255, 140, 0));
        jLabel18.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        jLabel20.setText("Impact Vitesse:");
        jLabel20.setForeground(new Color(255, 140, 0));
        jLabel20.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        jLabel21.setText("Defense:");
        jLabel21.setForeground(new Color(255, 140, 0));
        jLabel21.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        btnValiderArmure.setText("Valider");

        jTabbedPane1.addTab("Armure", jPanel3);
        jLabel7.setText("Perso:");
        jLabel13.setText("Arme: ");
        jLabel19.setText("Armure:");
        btnAnnuler.setText("Annuler");

        btnValiderArme.addActionListener(this);
        btnValiderPersonnage.addActionListener(this);
        btnValiderArmure.addActionListener(this);
        btnAnnuler.addActionListener(this);
        cbIDPersonnage.addItemListener(new ItemListener() {
     @Override
     public void itemStateChanged(ItemEvent e) {
         if(e.getStateChange()==e.DESELECTED){
             
         }else{
               System.out.println(e.getItem());
         
         }
       
     }
 });
        cbIDArme.addItemListener(new ItemListener() {
     @Override
     public void itemStateChanged(ItemEvent e) {
         if(e.getStateChange()==e.DESELECTED){
             
         }else{
               System.out.println(e.getItem());
         System.out.println("Change");
         }
       
     }
 });
        cbIDArmure.addItemListener(new ItemListener() {
     @Override
     public void itemStateChanged(ItemEvent e) {
         if(e.getStateChange()==e.DESELECTED){
             
         }else{
               System.out.println(e.getItem());
         System.out.println("Change");
         }
       
     }
 });
        initComponents();
    }

    private void initComponents() {

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)
                                                .addComponent(txtVitessePersonnage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)
                                                .addComponent(txtForcePersonnage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(34, 34, 34)
                                                                .addComponent(txtDefensePersonnage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(34, 34, 34)
                                                                .addComponent(cbClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(34, 34, 34)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtNiveauPersonnage, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                        .addComponent(cbArmePersonnage, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)
                                                .addComponent(cbArmurePersonnage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cbIDPersonnage, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(txtNomPersonnage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(34, 34, 34)
                                                                .addComponent(txtPVPersonnage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(26, 26, 26))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(235, 235, 235)
                                                .addComponent(btnValiderPersonnage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbIDPersonnage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtPVPersonnage)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtNomPersonnage)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtForcePersonnage)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtVitessePersonnage)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtNiveauPersonnage)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtDefensePersonnage)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(cbArmePersonnage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbArmurePersonnage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnValiderPersonnage)
                                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(btnValiderArme, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)
                                                .addComponent(txtAttaqueMinArme, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(349, 349, 349))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(34, 34, 34)
                                                                .addComponent(cbIDArme, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(34, 34, 34)
                                                                .addComponent(txtNomArme, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(34, 34, 34)
                                                                .addComponent(txtImpactVitesseArme, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(34, 34, 34)
                                                                .addComponent(txtChanceCritArme, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(34, 34, 34)
                                                                                .addComponent(txtAttaqueMaxArme, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(34, 34, 34)
                                                                                .addComponent(txtDegatCritArme, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(cbIDArme, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtImpactVitesseArme)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtNomArme)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtAttaqueMinArme)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtAttaqueMaxArme)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtChanceCritArme)
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtDegatCritArme)
                                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32)
                                .addComponent(btnValiderArme)
                                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(229, 229, 229)
                                                .addComponent(btnValiderArmure))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)
                                                .addComponent(txtDefense, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)
                                                .addComponent(txtNomArmure, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)
                                                .addComponent(txtImpactVitesseArmure, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(47, 47, 47))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(134, 134, 134)
                                                                .addComponent(cbIDArmure, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbIDArmure, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtImpactVitesseArmure)
                                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtNomArmure)
                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDefense)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addComponent(btnValiderArmure)
                                .addContainerGap(86, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Armure", jPanel3);

        btnAnnuler.setText("Annuler");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAnnuler, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
        );
    }

    private boolean insertPersonnage(String nomPersonnage, float pvPersonnage, float vitessePersonnage, float forcePerso, float defensePerso, int niveau, String classePerso, String armePerso, String armurePerso) {
        SqliteConnection maBase = new SqliteConnection("rpg");
        maBase.getInstance();
        try {
            Statement stmt = maBase.getInstance().createStatement();
            String sql = "INSERT INTO Personnage(nomPersonnage,pvPersonnage,vitessePersonnage,forcePersonnage,defensePersonnage,niveauPersonnage, "
                    + "idClassePersonnage,idArmePersonnage,idArmurePersonnage) VALUES('" + nomPersonnage + "'," + pvPersonnage + "," + vitessePersonnage + "," + forcePerso + "," + defensePerso + "," + niveau + "," + classePerso
                    + "," + armePerso + "," + armurePerso + ");";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            stmt.close();

            System.out.println("ok");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());

            return false;
        }
    }

    private boolean insertArme(String nomArme, float impactVitesseArme, float attaqueMinArme, float attaqueMaxArme, float chanceCrtiArme, float degatCrit) {
        SqliteConnection maBase = new SqliteConnection("rpg");
        maBase.getInstance();
        try {
            Statement stmt = maBase.getInstance().createStatement();
            String sql = "INSERT INTO Arme(nomArme, impactVitesseArme, attaqueMinArme, attaqueMaxArme, chanceCritArme,degaCritArme"
                    + ") VALUES('" + nomArme + "'," + impactVitesseArme + "," + attaqueMinArme + "," + attaqueMaxArme + "," + chanceCrtiArme + "," + degatCrit
                    + ");";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            stmt.close();

            System.out.println("ok");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());

            return false;
        }
    }

    private boolean insertArumre(String nomArmure, float impactVitesseArmure, float defenseArmure) {
        SqliteConnection maBase = new SqliteConnection("rpg");
        maBase.getInstance();
        try {
            Statement stmt = maBase.getInstance().createStatement();
            String sql = "INSERT INTO Armure(nomArmure, impactVitesseArmure, defenseArmure"
                    + ") VALUES('" + nomArmure + "'," + impactVitesseArmure + "," + defenseArmure
                    + ");";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            stmt.close();

            System.out.println("ok");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());

            return false;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // paint the background image and scale it to fill the entire space
        try {
            Image img = ImageIO.read(new File("background2.jpg"));
            g.drawImage(img, 0, 0, null);
        } catch (IOException ex) {
            // Logger.getLogger(vuePartie.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAnnuler) {
            Menu menu = new Menu(fenetre);
            fenetre.setContentPane(menu);
            fenetre.pack();
        } else if (e.getSource() == btnValiderPersonnage) {
            if (txtNomPersonnage.getText().isEmpty() || txtPVPersonnage.getText().isEmpty() || txtVitessePersonnage.getText().isEmpty()
                    || txtForcePersonnage.getText().isEmpty() || txtDefensePersonnage.getText().isEmpty() || txtNiveauPersonnage.getText().isEmpty()) {
                System.out.println("False");
            } else {
                try {
                    float pvPerso, vitessePerso, forcePerso, defensePerso;
                    int niveau;
                    String idClasse, idArmure, idArme;
                    String[] traitement;
                    pvPerso = Float.valueOf(txtPVPersonnage.getText());
                    vitessePerso = Float.valueOf(txtVitessePersonnage.getText());
                    forcePerso = Float.valueOf(txtForcePersonnage.getText());
                    defensePerso = Float.valueOf(txtDefensePersonnage.getText());
                    niveau = Integer.parseInt(txtNiveauPersonnage.getText());
                    idClasse = (String) cbClasse.getSelectedItem();
                    idArmure = (String) cbArmurePersonnage.getSelectedItem();
                    idArme = (String) cbArmePersonnage.getSelectedItem();
                    traitement = idClasse.split("-");
                    idClasse = traitement[0];
                    traitement = idArme.split("-");
                    idArme = traitement[0];
                    traitement = idArmure.split("-");
                    idArmure = traitement[0];
                    System.out.println(niveau);
                    System.out.println("true");
                    insertPersonnage(txtNomPersonnage.getText(), pvPerso, vitessePerso, forcePerso, defensePerso, niveau, idClasse, idArme, idArmure);
                    Menu menu = new Menu(fenetre);
                    fenetre.setContentPane(menu);
                    fenetre.pack();
                } catch (NumberFormatException ne) {
                    System.out.println("false");

                }

            }

        } else if (e.getSource() == btnValiderArme) {
            if (txtNomArme.getText().isEmpty() || txtImpactVitesseArme.getText().isEmpty() || txtAttaqueMinArme.getText().isEmpty()
                    || txtAttaqueMaxArme.getText().isEmpty() || txtChanceCritArme.getText().isEmpty() || txtDegatCritArme.getText().isEmpty()) {
                System.out.println("False");

            } else {
                try {
                    String nomArme = txtNomArme.getText();
                    float impactVitesseArme = Float.valueOf(txtImpactVitesseArme.getText());
                    float attaqueMinArme = Float.valueOf(txtAttaqueMinArme.getText());
                    float attaqueMaxArme = Float.valueOf(txtAttaqueMaxArme.getText());
                    float chanceCrtiArme = Float.valueOf(txtChanceCritArme.getText());
                    float degatCrit = Float.valueOf(txtDegatCritArme.getText());

                    insertArme(nomArme, impactVitesseArme, attaqueMinArme, attaqueMaxArme, chanceCrtiArme, degatCrit);
                    Menu menu = new Menu(fenetre);
                    fenetre.setContentPane(menu);
                    fenetre.pack();
                } catch (NumberFormatException ne) {

                }

                System.out.println("true");
            }
        } else if (e.getSource() == btnValiderArmure) {
            if (txtNomArmure.getText().isEmpty() || txtImpactVitesseArmure.getText().isEmpty() || txtDefense.getText().isEmpty()) {
                System.out.println("False");

            } else {
                try {
                    String nomArmure = txtNomArmure.getText();
                    float impactVitesseArmure = Float.valueOf(txtImpactVitesseArmure.getText());
                    float defenseArmure = Float.valueOf(txtDefense.getText());
                    insertArumre(nomArmure, impactVitesseArmure, defenseArmure);
                    Menu menu = new Menu(fenetre);
                    fenetre.setContentPane(menu);
                    fenetre.pack();
                } catch (NumberFormatException ne) {

                }
                System.out.println("true");

            }
        }
    }
}
