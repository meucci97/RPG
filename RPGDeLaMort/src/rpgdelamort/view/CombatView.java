/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpgdelamort.view;

import java.util.Map;

public class CombatView {

    public CombatView() {

    }

    public void afficherDebutCombat(Map<String, String> tabInfoCombat) {

        System.out.println("************************************************ " + tabInfoCombat.get("p1").toUpperCase() + " VS " + tabInfoCombat.get("p2").toUpperCase() + " *****************************************************");

    }

    public void afficherAttaque(Map<String, String> tabInfoCombat) {
        System.out.println(tabInfoCombat.get("nomAttaquant") + "(" + tabInfoCombat.get("pvAttaquant") + ") attaque " + tabInfoCombat.get("nomDefenseur") + "(" + tabInfoCombat.get("pvDefenseur") + ") avec " + tabInfoCombat.get("armeAttaquant"));

        String attaque = tabInfoCombat.get("nomDefenseur") + " ";
        if (tabInfoCombat.get("esquive") != null) {
            attaque = attaque + "réussit son esquive, il ne prend pas de dégat. ";
        } else {
            attaque = attaque + "rate son esquive\n";

            if (tabInfoCombat.get("critique") != null) {
                attaque = attaque + "Coup critique! ";
            }
            attaque = attaque + tabInfoCombat.get("nomAttaquant") + " inflige " + tabInfoCombat.get("degat") + "! " + tabInfoCombat.get("nomDefenseur") + " les réduit et ne subit que " + tabInfoCombat.get("degatSubis") + ". ";

        }

        System.out.println(attaque);

    }

    public void afficherFinCombat(Map<String, String> tabInfoCombat) {
        System.out.println("");
        System.out.println(tabInfoCombat.get("nomPerdant")+ " meurt!" );
        System.out.println("Le combat est remporté par " + tabInfoCombat.get("nomGagnant")+ "!" );
        System.out.println("______________________________________________________________________________________________________________________");

    }

}
