/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpgdelamort.controller;

import java.util.ArrayList;
import rpgdelamort.model.Arme;
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

    
    public JeuController(){
        this.tabPersos = new ArrayList<>();
    }
    
    public Personnage combat(){
        ArrayList<Arme> tabArme = new ArrayList<>();
        tabArme.add(new Arme("Epée"));
        
        this.getTabPersos().add(new Personnage("so6",100f,1,0d,1f,10f,5f,tabArme,null, new Classe("Saucisse")));
        this.getTabPersos().add(new Personnage("stefano",110f,1,0d,1f,12f,7f,tabArme,null, new Classe("Tartare")));
        
        CombatController c = new CombatController(this.getTabPersos().get(0),this.getTabPersos().get(1));
        
        return c.combat(); //fight!
    }
    
    private ArrayList<Personnage> tabPersos;
    
}
