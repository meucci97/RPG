package rpgdelamort.model;

public abstract class Equipement {
    

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public float getImpactVitesse() {
        return impactVitesse;
    }

  

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setImpactVitesse(float impactVitesse) {
        this.impactVitesse = impactVitesse;
    }

  

       public Equipement() {
        
    }
    public Equipement(int id, String nom, float impactVitesse) {
        this.id = id;
        this.nom = nom;
        this.impactVitesse = impactVitesse;
    }

    protected int id;
    protected String nom;
    protected float impactVitesse;

}
