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

    public void afficherAttaque(Map<String, String> tabInfoCombat) {
        System.out.println(tabInfoCombat.get("nomAttaquant") + " attaque " + tabInfoCombat.get("nomDefenseur") + " avec " + tabInfoCombat.get("armeAttaquant"));

        String attaque = tabInfoCombat.get("nomDefenseur") + " ";
        if (tabInfoCombat.get("esquive") != null) {
            attaque = attaque + "réussit son esquive, il ne prend pas de dégat. ";
        } else {
            attaque = attaque + "rate son esquive\n";

            if (tabInfoCombat.get("critique") != null) {
                attaque = attaque + "Coup critique! ";
            }
            attaque = attaque + tabInfoCombat.get("nomAttaquant") + " inflige " + tabInfoCombat.get("degat") + "! " + tabInfoCombat.get("nomDefenseur") + " les réduit et ne subit que " + tabInfoCombat.get("degatSubis")+ ". ";

        }

        System.out.println(attaque);

    }

}
