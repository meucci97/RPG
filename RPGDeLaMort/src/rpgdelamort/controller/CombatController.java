/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpgdelamort.controller;

import rpgdelamort.model.Personnage;

/**
 *
 * @author p1711638
 */
public class CombatController {

    public CombatController(Personnage p1, Personnage p2) {
        this.p1 = p1;
        this.p2 = p2;
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
    
    
    private Personnage p1;
    private Personnage p2;

}
