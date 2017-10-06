package rpgdelamort;

import Singleton.SqliteConnection;
import java.sql.ResultSet;
import rpgdelamort.controller.JeuController;
import rpgdelamort.view.MaFenetre;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author p1711638
 */
public class RPGDeLaMort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SqliteConnection maBase = new SqliteConnection("rpg");
        System.out.println(maBase.getInstance());
        try {
            ResultSet rs = maBase.getInstance().createStatement().executeQuery("SELECT * FROM Personnage INNER JOIN Classe ON idClassePersonnage=idClasse INNER JOIN Arme ON idArmePersonnage=idArme INNER JOIN Armure ON idArmurePersonnage=idArmure");

            while (rs.next()) {
                //System.out.println((String)rs.getObject("Nom"));
                System.out.println();
                System.out.println("id: " + rs.getInt("idPersonnage") + " nom: " + rs.getString("nomPersonnage") + " pv: " + rs.getFloat("pvPersonnage")
                        + " niveau: " + rs.getString("niveauPersonnage") + " progression: " + rs.getDouble("progressionPersonnage")
                        + " vitesse: " + rs.getFloat("vitessePersonnage") + " defense: " + rs.getFloat("defensePersonnage")
                        + " force: " + rs.getFloat("forcePersonnage"));
                System.out.println("L'arme de " + rs.getString("nomPersonnage") + " est: ");
                System.out.println("ID Arme: " + rs.getString("idArme") + " nomArme: " + rs.getString("nomArme") + " Impacte vitesse: " + rs.getFloat("impactVitesseArme")
                        + " niveauMinArme: " + rs.getInt("niveauMinArme") + " Attaque Max: " + rs.getFloat("attaqueMaxArme") + " Attaque min: " + rs.getFloat("attaqueMinArme")
                        + " Chance crit Arme: " + rs.getFloat("chanceCritArme") + " degaCritArme: " + rs.getFloat("degaCritArme"));

                System.out.println("L'armure de " + rs.getString("nomPersonnage") + " est: ");
                System.out.println("ID Armure: " + rs.getInt("idArmure") + " nomArmure: " + rs.getString("nomArmure") + " Impacte vitesse: " + rs.getFloat("impactVitesseArmure")
                        + " niveauMinArmure: " + rs.getInt("niveauMinArmure") + " defenseArmure: " + rs.getFloat("defenseArmure"));
                System.out.println("La classe de " + rs.getString("nomPersonnage") + " est: ");
                System.out.println("ID Classe "+rs.getInt("idClasse")+ " nomClasse: "+ rs.getString("nomClasse")+ " multiplicateurPVClasse: "+rs.getFloat("multiplicateurPVClasse")
                        + " multiplicateurVitesseClasse: "+rs.getFloat("multiplicateurVitesseClasse")+ " multiplicateurAttaqueClasse: "+rs.getFloat("multiplicateurAttaqueClasse")+
                         " multiplicateurDefenseClasse: "+rs.getFloat("multiplicateurDefenseClasse"));
            }

        } catch (Exception ex) {
            System.out.println("Erreur2");

        }

        JeuController jeu = new JeuController();

        jeu.combat();
         MaFenetre F1=new MaFenetre();
        F1.setVisible(true);
    }

}
