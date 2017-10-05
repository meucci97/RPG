/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpgdelamort.controller;

import java.util.HashMap;
import java.util.Map;
import rpgdelamort.model.Personnage;
import rpgdelamort.view.CombatView;

/**
 *
 * @author p1711638
 */
public class CombatController {

    public CombatController(Personnage p1, Personnage p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.vueCombat = new CombatView();
    }

    public Personnage getP1() {
        return p1;
    }

    public Personnage getP2() {
        return p2;
    }

    public void setP1(Personnage p1) {
        this.p1 = p1;
    }

    public void setP2(Personnage p2) {
        this.p2 = p2;
    }

    public Personnage combat() { //mettre un parametre numero de combat?

        Map<String, String> tabInfoCombat = new HashMap<>();

        tabInfoCombat.put("nomAttaquant", this.p1.getNom());
        tabInfoCombat.put("nomDefenseur", this.p2.getNom());
        tabInfoCombat.put("armeAttaquant", this.p2.getArmeEquiper().getNom());
        tabInfoCombat.put("pvAttaquant", Float.toString(this.p1.getPv()));
        tabInfoCombat.put("pvDefenseur", Float.toString(this.p2.getPv()));

        float[] tabInfoDegat = this.getP1().attaque(this.getP2()); //attaque

        if (tabInfoDegat[0] == 0f) { //esquive
            tabInfoCombat.put("esquive", "true");
        } else {
            tabInfoCombat.put("esquive", null);
        }

        if (tabInfoDegat[1] == 1f) { //critique
            tabInfoCombat.put("critique", "true");
        } else {
            tabInfoCombat.put("critique", null);
        }

        tabInfoCombat.put("degat", Float.toString(tabInfoDegat[0]));
        tabInfoCombat.put("degatSubis", Float.toString(tabInfoDegat[2]));

        this.vueCombat.afficherAttaque(tabInfoCombat);
        return p1;
    }

    private Personnage p1;
    private Personnage p2;
    private CombatView vueCombat;

}
