package rpgdelamort.model;

public class Armure extends Equipement {
	private float defense;
        
    public Armure(String nom){
        super();
        
        this.nom = nom;
        this.impactVitesse = 0.9f;
        this.defense = 10f;
    }

    public float getDefense() {
        return defense;
    }

    public Armure(int id, String nom, float impactVitesse,float defense) {
        super(id, nom, impactVitesse);
        this.defense = defense;
    }
        
        

}