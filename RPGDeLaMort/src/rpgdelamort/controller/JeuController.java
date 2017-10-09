/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpgdelamort.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import rpgdelamort.model.Arme;
import rpgdelamort.model.Armure;
import rpgdelamort.model.Classe;
import rpgdelamort.model.Personnage;

/**
 *
 * @author p1711638
 */
public class JeuController {

    public ArrayList<Personnage> getTabPersos() {
        return tabPersos;
    }

    public JeuController() {
        this.tabPersos = new ArrayList<>();
    }

    public Personnage combat() {
        ArrayList<Arme> tabArme = new ArrayList<>();
        tabArme.add(new Arme("Epée"));

        this.getTabPersos().add(new Personnage("so6", 100f, 1, 0d, 5f, 10f, 5f, tabArme, new Armure("Armure en bois"), new Classe("Saucisse")));
        this.getTabPersos().add(new Personnage("stefano", 100f, 1, 0d, 5f, 12f, 5f, tabArme, new Armure("Armure"), new Classe("Tartare")));

        CombatController c = new CombatController(this.getTabPersos().get(0), this.getTabPersos().get(1));

        Map<String, Integer> tabClassement = new HashMap<>();
        tabClassement.put(this.getTabPersos().get(0).getNom(), 0);
        tabClassement.put(this.getTabPersos().get(1).getNom(), 0);

        boolean victoire = false;

        int nbCombat = 3;
        int i = 1;
        while (i <= nbCombat && !victoire) {
            Personnage gagnantManche = c.combat();

            tabClassement.replace(gagnantManche.getNom(), tabClassement.get(gagnantManche.getNom()) + 1); //augmentation du code du gagnant de 1

            for (Map.Entry t : tabClassement.entrySet()) {
                if ((int) t.getValue() >= (nbCombat / 2) + 1) {
                    victoire = true;
                }
            }

            i++;
        }
        return this.getTabPersos().get(0);
    }

    private ArrayList<Personnage> tabPersos;

}
