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
import java.io.File;
import java.io.IOException;
import java.sql.Statement;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JFrame;

/**
 *
 * @author Stefano
 */
public class SuppressionView extends javax.swing.JPanel implements ActionListener {

    private JFrame fenetre;
    private javax.swing.JButton btnSuppArme;
    private javax.swing.JButton btnSuppArmure;
    private javax.swing.JButton btnSuppPerso;
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JComboBox cbArme;
    private javax.swing.JComboBox cbArmure;
    private javax.swing.JComboBox cbPersonnage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;

    public SuppressionView(JFrame fenetre) {
        this.fenetre = fenetre;
        Font font = new Font("SF Slapstick Comic Shaded", Font.BOLD, 20);
        this.setPreferredSize(new Dimension(600, 400));
        this.setBackground(new Color(237, 255, 12));

        jLabel1 = new javax.swing.JLabel();
        cbPersonnage = new javax.swing.JComboBox(GetComboItem.getListPersonnage());
        btnSuppPerso = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Vector v1 = GetComboItem.getListArme();
        v1.removeElementAt(0);
        cbArme = new javax.swing.JComboBox(v1);
        btnSuppArme = new javax.swing.JButton();
        v1 = GetComboItem.getListArmure();
        v1.removeElementAt(0);
        cbArmure = new javax.swing.JComboBox(v1);
        jLabel3 = new javax.swing.JLabel();
        btnAnnuler = new javax.swing.JButton();
        btnSuppArmure = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("Personnage:");
        jLabel1.setFont(font);
        jLabel1.setForeground(new Color(255, 140, 0));
        jLabel1.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        btnSuppPerso.setText("Supprimer");

        jLabel2.setText("Arme:");
        jLabel2.setFont(font);
        jLabel2.setForeground(new Color(255, 140, 0));
        jLabel2.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        btnSuppArme.setText("Supprimer");

        jLabel3.setText("Armure:");
        jLabel3.setFont(font);
        jLabel3.setForeground(new Color(255, 140, 0));
        jLabel3.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        btnAnnuler.setText("Annuler");

        btnSuppArmure.setText("Supprimer");

        jLabel4.setText("Suppression");
        jLabel4.setFont(font);
        jLabel4.setForeground(new Color(255, 140, 0));
        jLabel4.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        btnSuppPerso.addActionListener(this);
        btnSuppArme.addActionListener(this);
        btnSuppArmure.addActionListener(this);
        btnAnnuler.addActionListener(this);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel4.setToolTipText("");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(66, 66, 66)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                                                .addComponent(cbArme, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(80, 80, 80)
                                                                .addComponent(btnSuppArme, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                                                .addComponent(cbArmure, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(80, 80, 80)
                                                                .addComponent(btnSuppArmure, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(cbPersonnage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(80, 80, 80)
                                                                                .addComponent(btnSuppPerso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbPersonnage, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSuppPerso, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbArme, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSuppArme, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbArmure, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSuppArmure, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addComponent(btnAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(35, Short.MAX_VALUE))
        );
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
        if (e.getSource() == btnSuppPerso) {

            try {
                SqliteConnection maBase = new SqliteConnection("rpg");
                String idPerso = (String) cbPersonnage.getSelectedItem();
                String id[] = idPerso.split("-");
                System.out.println();
                Statement stmt = maBase.getInstance().createStatement();
                String sql = "DELETE from Personnage where idPersonnage=" + id[0] + ";";
                System.out.println(sql);
                stmt.executeUpdate(sql);
                stmt.close();
                System.out.println("ok");
                Menu menu = new Menu(fenetre);
                fenetre.setContentPane(menu);
                fenetre.pack();

            } catch (Exception ex) {
                System.out.println(ex.getMessage());

            }
        } else if (e.getSource() == btnSuppArme) {
            try {
                SqliteConnection maBase = new SqliteConnection("rpg");
                String idArme = (String) cbArme.getSelectedItem();
                String id[] = idArme.split("-");
                System.out.println();
                Statement stmt = maBase.getInstance().createStatement();
                String sql = "UPDATE  Personnage set idArmePersonnage= 1 where idArmePersonnage=" + id[0] + ";";
                System.out.println(sql);
                stmt.executeUpdate(sql);
                System.out.println("ok");
                sql = "DELETE from Arme where idArme=" + id[0] + ";";
                System.out.println(sql);
                stmt.executeUpdate(sql);
                stmt.close();
                System.out.println("ok");
                Menu menu = new Menu(fenetre);
                fenetre.setContentPane(menu);
                fenetre.pack();

            } catch (Exception ex) {
                System.out.println(ex.getMessage());

            }

        } else if (e.getSource() == btnSuppArmure) {

            try {
                SqliteConnection maBase = new SqliteConnection("rpg");
                String idArmure = (String) cbArmure.getSelectedItem();
                String id[] = idArmure.split("-");
                System.out.println();
                Statement stmt = maBase.getInstance().createStatement();
                String sql = "UPDATE  Personnage set idArmurePersonnage= 1 where idArmurePersonnage=" + id[0] + ";";
                System.out.println(sql);
                stmt.executeUpdate(sql);
                System.out.println("ok");
                sql = "DELETE from Armure where idArmure=" + id[0] + ";";
                System.out.println(sql);
                stmt.executeUpdate(sql);
                stmt.close();
                System.out.println("ok");
                Menu menu = new Menu(fenetre);
                fenetre.setContentPane(menu);
                fenetre.pack();

            } catch (Exception ex) {
                System.out.println(ex.getMessage());

            }

        } else if (e.getSource() == btnAnnuler) {
            Menu menu = new Menu(fenetre);
            fenetre.setContentPane(menu);
            fenetre.pack();
        }
    }

}
