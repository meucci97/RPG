/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpgdelamort.controller;

import java.util.ArrayList;
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
        //System.out.println(this.p2.getPv());
        Map<String, String> tabInfoCombat = new HashMap<>();
        tabInfoCombat.put("p1", p1.getNom());
        tabInfoCombat.put("p2", p2.getNom());

        this.vueCombat.afficherDebutCombat(tabInfoCombat);
        tabInfoCombat.clear();

        double ordre = Math.random();
        ArrayList<Personnage> tabPersos = new ArrayList<>();

        if (ordre < 0.5) {
            tabPersos.add(p1);
            tabPersos.add(p2);
        } else {
            tabPersos.add(p2);
            tabPersos.add(p1);
        }
        Personnage pTemp = tabPersos.get(0);

        while (p1.isAlive() && p2.isAlive()) {
            this.echange(tabPersos.get(0), tabPersos.get(1));

            //echange attaquant/defenseur
            pTemp = tabPersos.get(0);
            tabPersos.set(0, tabPersos.get(1));
            tabPersos.set(1, pTemp);
        }
        tabInfoCombat.put("nomGagnant", tabPersos.get(1).getNom());//le gagnant est celui qui a mis le dernier coup et est passé defenseur
        tabInfoCombat.put("nomPerdant", tabPersos.get(0).getNom());
        this.vueCombat.afficherFinCombat(tabInfoCombat);

        this.finCombat();

        return (tabPersos.get(1));
    }

    private void echange(Personnage p1, Personnage p2) {  //p1 attaquant, p2 defenseur
        Map<String, String> tabInfoCombat = new HashMap<>();

        tabInfoCombat.put("nomAttaquant", p1.getNom());
        tabInfoCombat.put("nomDefenseur", p2.getNom());
        tabInfoCombat.put("armeAttaquant", p2.getArmeEquiper().getNom());
        tabInfoCombat.put("pvAttaquant", Integer.toString(Math.round(p1.getPv())));
        tabInfoCombat.put("pvDefenseur", Integer.toString(Math.round(p2.getPv())));

        float[] tabInfoDegat = p1.attaque(p2); //attaque

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

        tabInfoCombat.put("degat", Integer.toString(Math.round(tabInfoDegat[0])));
        tabInfoCombat.put("degatSubis", Integer.toString(Math.round(tabInfoDegat[2])));

        this.vueCombat.afficherAttaque(tabInfoCombat);
    }

    private void finCombat() {
        //remettre les pv;
        this.p1.setPvCourant(this.p1.getPv());
        this.p2.setPvCourant(this.p2.getPv());
    }

    private Personnage p1;
    private Personnage p2;
    private CombatView vueCombat;

}
