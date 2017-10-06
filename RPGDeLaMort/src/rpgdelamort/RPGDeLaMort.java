package rpgdelamort;

<<<<<<< HEAD
import Singleton.SqliteConnection;
import java.sql.ResultSet;
>>>>>>> 52dcdaef3fde4340fec4cb2ecfacbb6b48db491b

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
<<<<<<< HEAD
        SqliteConnection maBase = new SqliteConnection("rpg");
        System.out.println(maBase.getInstance());
        try {
            ResultSet rs = maBase.getInstance().createStatement().executeQuery("SELECT * FROM Personnage INNER JOIN Classe ON Personnage.idClasse=Classe.id INNER JOIN Arme ON Personnage.idArme=Arme.id INNER JOIN Armure ON Personnage.idArmure=Armure.id");
           
            while (rs.next()) {
                //System.out.println((String)rs.getObject("Nom"));
                System.out.println("test");
                System.out.println("id: "+rs.getInt("Personnage.id")+" nom: "+rs.getString("Personnage.nom")+" pv: "+rs.getFloat("Personnage.pv")+
                        " niveau: "+rs.getString("Personnage.niveau")+" progression: "+rs.getDouble("Personnage.progression")+
                        " vitesse: "+rs.getFloat("Personnage.vitesse")+" defense: "+rs.getFloat("Personnage.defense")+
                        " force: "+rs.getFloat("Personnage.force")+" Classe: "+ rs.getString("Classe.nom"));
            }
            
        } catch (Exception ex) {
            System.out.println("Erreur2");

        }
>>>>>>> 52dcdaef3fde4340fec4cb2ecfacbb6b48db491b
    }

}
