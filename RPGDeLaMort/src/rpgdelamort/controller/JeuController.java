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
    
    public JeuController(){
        ArrayList<Arme> tabArme = new ArrayList<>();
        tabArme.add(new Arme("Epée"));
        
        Personnage p1 = new Personnage("so6",100f,1,0d,1f,10f,5f,tabArme,null, new Classe("Saucisse"));
        Personnage p2 = new Personnage("stefano",110f,1,0d,1f,12f,7f,tabArme,null, new Classe("Tartare"));
                
    }
    
}
