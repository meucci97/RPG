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
            while (rs.next()) {
                //System.out.println((String)rs.getObject("Nom"));
                mesPersonnage.add(rs.getInt("idPersonnage") + "-" + rs.getString("nomPersonnage") + "-Niv " + rs.getString("niveauPersonnage"));

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

            return mesClasse;
        } catch (Exception ex) {
            System.out.println("Erreur2");
            return null;
        }

    }

}
