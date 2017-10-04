package rpgdelamort.model;

import java.util.ArrayList;


public class Personnage extends Entite {

	private ArrayList<Arme> arme;
	private Armure armure;
	private Classe classe;

    public Armure getArmure() {
        return armure;
    }

    public void setArmure(Armure armure) {
        this.armure = armure;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

}