/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpgdelamort.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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

    public List<Personnage> getTabPersos() {
        return tabPersos;
    }

    public JeuController() {
        this.tabPersos = new ArrayList<>();
    }

    public Personnage combat(Personnage p1, Personnage p2, int nbManche) {
        CombatController c = new CombatController(p1, p2);

        Map<String, Integer> tabClassement = new HashMap<>();
        tabClassement.put(p1.getNom(), 0);
        tabClassement.put(p2.getNom(), 0);

        boolean victoire = false;

        int nbCombat = nbManche;
        int i = 1;
        Personnage gagnantManche =  null;
        while (i <= nbCombat && !victoire) {
            gagnantManche = c.combat();

            tabClassement.replace(gagnantManche.getNom(), tabClassement.get(gagnantManche.getNom()) + 1); //augmentation du code du gagnant de 1

            for (Map.Entry t : tabClassement.entrySet()) {
                if ((int) t.getValue() >= (nbCombat / 2) + 1) {
                    victoire = true;
                }
            }

            i++;
        }
        return gagnantManche;
    }

    public Personnage lanceTournoi() {
        ArrayList<Arme> tabArme = new ArrayList<>(); //temporaire
        tabArme.add(new Arme("Epée"));
        this.getTabPersos().add(new Personnage("so6", 100f, 1, 0d, 5f, 10f, 5f, tabArme, new Armure("Armure en bois"), new Classe("Saucisse")));
        this.getTabPersos().add(new Personnage("stefano", 100f, 1, 0d, 5f, 12f, 5f, tabArme, new Armure("Armure"), new Classe("Tartare")));
        this.getTabPersos().add(new Personnage("ALLO", 100f, 1, 0d, 5f, 12f, 5f, tabArme, new Armure("Armure"), new Classe("Tartare")));
        this.getTabPersos().add(new Personnage("est", 100f, 1, 0d, 5f, 12f, 5f, tabArme, new Armure("Armure"), new Classe("Tartare")));
        this.getTabPersos().add(new Personnage("oui", 100f, 1, 0d, 5f, 12f, 5f, tabArme, new Armure("Armure"), new Classe("Tartare")));
        this.getTabPersos().add(new Personnage("gezi", 100f, 1, 0d, 5f, 12f, 5f, tabArme, new Armure("Armure"), new Classe("Tartare")));
        this.getTabPersos().add(new Personnage("osdvsd", 100f, 1, 0d, 5f, 12f, 5f, tabArme, new Armure("Armure"), new Classe("Tartare")));
        this.getTabPersos().add(new Personnage("ovvsv", 100f, 1, 0d, 5f, 12f, 5f, tabArme, new Armure("Armure"), new Classe("Tartare")));
        this.getTabPersos().add(new Personnage("oui", 100f, 1, 0d, 5f, 12f, 5f, tabArme, new Armure("Armure"), new Classe("Tartare")));
        this.getTabPersos().add(new Personnage("ovojkovsv", 100f, 1, 0d, 5f, 12f, 5f, tabArme, new Armure("Armure"), new Classe("Tartare")));
        this.getTabPersos().add(new Personnage("ovvqVVsv", 100f, 1, 0d, 5f, 12f, 5f, tabArme, new Armure("Armure"), new Classe("Tartare")));
        this.getTabPersos().add(new Personnage("ovqvsv", 100f, 1, 0d, 5f, 12f, 5f, tabArme, new Armure("Armure"), new Classe("Tartare")));
        this.getTabPersos().add(new Personnage("ovv vsv", 100f, 1, 0d, 5f, 12f, 5f, tabArme, new Armure("Armure"), new Classe("Tartare")));
        this.getTabPersos().add(new Personnage("ovvvsv", 100f, 1, 0d, 5f, 12f, 5f, tabArme, new Armure("Armure"), new Classe("Tartare")));
        this.getTabPersos().add(new Personnage("ov   vsv", 100f, 1, 0d, 5f, 12f, 5f, tabArme, new Armure("Armure"), new Classe("Tartare")));
        this.getTabPersos().add(new Personnage("ovrerretrttvsv", 100f, 1, 0d, 5f, 12f, 5f, tabArme, new Armure("Armure"), new Classe("Tartare")));
        
        tabPersos = this.getTabPersos();
        //gestion du nombre impair de personnages
        if (tabPersos.size() % 2 == 1) {
            tabPersos.add(new Personnage("pantin", 100f, 1, 0d, 0f, 0f, 0f, tabArme, new Armure("armure de pantin"), new Classe("Dummy")));

        }
        int nbManche = 1;
        return tournoi(tabPersos, nbManche);
    }

    private Personnage tournoi(List<Personnage> tabPersos, int nbManche) {
        if(tabPersos.size() == 1){
            return tabPersos.get(0);
        }
        else if (tabPersos.size() == 2) {
            System.out.println(tabPersos.get(0).getNom());
            Personnage p = this.combat(tabPersos.get(0),tabPersos.get(1), nbManche);
            System.out.println(p.getNom());
            return p;
            
        } else {
            
            List<Personnage> subList1 = tabPersos.subList(0, tabPersos.size()/2);            
            List<Personnage> subList2 = tabPersos.subList(tabPersos.size()/2, tabPersos.size());
            Personnage p1 = (this.tournoi(subList1, nbManche));
            Personnage p2 = (this.tournoi(subList2, nbManche));

            return this.combat(p1,p2,nbManche);
        }
    }

    private List<Personnage> tabPersos;

}
