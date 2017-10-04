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

    public int getNiveauMin() {
        return niveauMin;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setImpactVitesse(float impactVitesse) {
        this.impactVitesse = impactVitesse;
    }

    public void setNiveauMin(int niveauMin) {
        this.niveauMin = niveauMin;
    }

    protected int id;
    protected String nom;
    protected float impactVitesse;
    protected int niveauMin;

}
