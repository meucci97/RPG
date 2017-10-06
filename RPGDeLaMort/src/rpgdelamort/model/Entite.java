package rpgdelamort.model;

public abstract class Entite {

    protected int id;
    protected String nom;
    protected float pv;
    protected float pvCourant;
    protected int niveau;
    protected double progression;
    protected float vitesse; //point esquive
    protected float defense;
    protected float force;

    //Selection Personnage
    public Entite(int id, String nom, float pv, int niveau, double progression, float vitesse, float defense, float force) {
        this.id = id;
        this.nom = nom;
        this.pv = pv;
        this.pvCourant = pv;
        this.niveau = niveau;
        this.progression = progression;
        this.vitesse = vitesse;
        this.defense = defense;
        this.force = force;
    }

    //Creation Personnage
    public Entite(String nom, float pv, int niveau, double progression, float vitesse, float defense, float force) {
        this.nom = nom;
        this.pv = pv;
        this.pvCourant = pv;
        this.niveau = niveau;
        this.progression = progression;
        this.vitesse = vitesse;
        this.defense = defense;
        this.force = force;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public float getPv() {
        return pv;
    }

    public int getNiveau() {
        return niveau;
    }

    public double getProgression() {
        return progression;
    }

    public float getVitesse() {
        return vitesse;
    }

    public float getDefense() {
        return defense;
    }

    public float getForce() {
        return force;
    }

    public float getPvCourant() {
        return pvCourant;
    }

    public void setPvCourant(float pvCourant) {
        this.pvCourant = pvCourant;
    }
    
    

}
