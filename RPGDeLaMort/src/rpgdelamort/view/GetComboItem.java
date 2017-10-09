/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpgdelamort.view;

import Singleton.SqliteConnection;
import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author Stefano
 */
public interface GetComboItem {

    static public Vector getListPersonnage() {
        Vector mesPersonnage;

        SqliteConnection maBase = new SqliteConnection("rpg");
        maBase.getInstance();
        try {
            ResultSet rs = maBase.getInstance().createStatement().executeQuery("SELECT idPersonnage, nomPersonnage, niveauPersonnage FROM Personnage");
            mesPersonnage = new Vector();
            System.out.println("lol");
            while (rs.next()) {
                //System.out.println((String)rs.getObject("Nom"));
                mesPersonnage.add(rs.getInt("idPersonnage") + "-" + rs.getString("nomPersonnage"));

            }
            for (int i = 0; i < mesPersonnage.size(); i++) {
                System.out.println(mesPersonnage.get(i));
            }
            return mesPersonnage;
        } catch (Exception ex) {
            System.out.println("Erreur2");
            return null;
        }

    }

    static public Vector getListArme() {
        Vector mesArmes;

        SqliteConnection maBase = new SqliteConnection("rpg");
        maBase.getInstance();
        try {
            ResultSet rs = maBase.getInstance().createStatement().executeQuery("SELECT idArme, nomArme FROM Arme");
            mesArmes = new Vector();
            while (rs.next()) {
                //System.out.println((String)rs.getObject("Nom"));
                mesArmes.add(rs.getInt("idArme") + "-" + rs.getString("nomArme"));

            }
            for (int i = 0; i < mesArmes.size(); i++) {
                System.out.println(mesArmes.get(i));
            }
            return mesArmes;
        } catch (Exception ex) {
            System.out.println("Erreur2");
            return null;
        }

    }

    static public Vector getListArmure() {
        Vector mesArmures;

        SqliteConnection maBase = new SqliteConnection("rpg");
        maBase.getInstance();
        try {
            ResultSet rs = maBase.getInstance().createStatement().executeQuery("SELECT idArmure, nomArmure FROM Armure");
            mesArmures = new Vector();
            while (rs.next()) {
                //System.out.println((String)rs.getObject("Nom"));
                mesArmures.add(rs.getInt("idArmure") + "-" + rs.getString("nomArmure"));

            }
            for (int i = 0; i < mesArmures.size(); i++) {
                System.out.println(mesArmures.get(i));
            }
            return mesArmures;
        } catch (Exception ex) {
            System.out.println("Erreur2");
            return null;
        }

    }
    
     static public Vector getListClasse() {
        Vector mesClasse;

        SqliteConnection maBase = new SqliteConnection("rpg");
        maBase.getInstance();
        try {
            ResultSet rs = maBase.getInstance().createStatement().executeQuery("SELECT idClasse, nomClasse FROM Classe");
            mesClasse = new Vector();
            while (rs.next()) {
                //System.out.println((String)rs.getObject("Nom"));
                mesClasse.add(rs.getInt("idClasse") + "-" + rs.getString("nomClasse"));

            }
            for (int i = 0; i < mesClasse.size(); i++) {
                System.out.println(mesClasse.get(i));
            }
            return mesClasse;
        } catch (Exception ex) {
            System.out.println("Erreur2");
            return null;
        }

    }

}
