/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpgdelamort.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;

/**
 *
 * @author Stefano
 */
public class ModeEditionView extends JPanel implements ActionListener {

    /**
     * Creates new form ModeEdition
     */
    private JFrame fenetre;
    private JButton btnAjouter;
    private JButton btnModifier;
    private JButton btnRetour;
    private JButton btnSupprimer;

    public ModeEditionView(JFrame fenetre) {
        Font font = new Font("SF Slapstick Comic Shaded", Font.BOLD, 20);
        this.setPreferredSize(new Dimension(600, 400));
        this.setBackground(new Color(237, 255, 12));
        this.fenetre = fenetre;
        btnModifier = new JButton();
        btnSupprimer = new JButton();
        btnAjouter = new JButton();
        btnRetour = new JButton();
        btnModifier.setText("Modifier");
        btnSupprimer.setText("Suppirmer");
        btnAjouter.setText("Ajouter");
        btnRetour.setText("Retour");
        btnAjouter.setFocusable(false);
        btnAjouter.setPreferredSize(new Dimension(400, 50));
        btnAjouter.setFont(font);
        btnAjouter.setForeground(new Color(255, 140, 0));
        btnAjouter.setContentAreaFilled(false);
        btnAjouter.setBorder(null);
        btnAjouter.setBackground(new Color(255, 0, 255, 0));
        btnAjouter.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 0));

        btnSupprimer.setFocusable(false);
        btnSupprimer.setPreferredSize(new Dimension(400, 50));
        btnSupprimer.setFont(font);
        btnSupprimer.setForeground(new Color(255, 140, 0));
        btnSupprimer.setContentAreaFilled(false);
        btnSupprimer.setBorder(null);
        btnSupprimer.setBackground(new Color(255, 0, 255, 0));
        btnSupprimer.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 0));

        btnModifier.setFocusable(false);
        btnModifier.setPreferredSize(new Dimension(400, 50));
        btnModifier.setFont(font);
        btnModifier.setForeground(new Color(255, 140, 0));
        btnModifier.setContentAreaFilled(false);
        btnModifier.setBorder(null);
        btnModifier.setBackground(new Color(255, 0, 255, 0));
        btnModifier.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 0));
        
         btnRetour.setFocusable(false);
        btnRetour.setPreferredSize(new Dimension(400, 50));
        btnRetour.setFont(font);
        btnRetour.setForeground(new Color(255, 140, 0));
        btnRetour.setContentAreaFilled(false);
        btnRetour.setBorder(null);
        btnRetour.setBackground(new Color(255, 0, 255, 0));
        btnRetour.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 0));

        btnAjouter.addActionListener(this);
        btnModifier.addActionListener(this);
        btnSupprimer.addActionListener(this);
        btnRetour.addActionListener(this);
        initComponents();
    }

    private void initComponents() {

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnRetour))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(btnAjouter, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                                                .addGap(77, 77, 77)
                                                .addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                                .addComponent(btnSupprimer, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)))
                                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSupprimer, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAjouter, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                                .addComponent(btnRetour))
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
       if(e.getSource()== btnRetour){
           Menu menu= new Menu(fenetre);
           fenetre.setContentPane(menu);
            fenetre.pack();
       }else if(e.getSource()==btnAjouter){
           AjoutView ajoutView= new AjoutView(fenetre);
            fenetre.setContentPane(ajoutView);
            fenetre.pack();
       }else if(e.getSource()==btnModifier){
           ModifierView modifView=new ModifierView(fenetre);
            fenetre.setContentPane(modifView);
            fenetre.pack();
       }
    }
}
