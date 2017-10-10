package rpgdelamort.model;

public class Classe {
    
    public Classe(String nom){
        this.setNom(nom);
        this.setMultiplicateurVitesse(1.2f);  
        this.setMultiplicateurAttaque(1.2f); 
        this.setMultiplicateurDefense(1.05f);
        this.setMultiplicateurPV(1.2f);        
    }

    public Classe(int id, String nom, float multiplicateurPV, float multiplicateurVitesse, float multiplicateurAttaque, float multiplicateurDefense) {
        this.id = id;
        this.nom = nom;
        this.multiplicateurPV = multiplicateurPV;
        this.multiplicateurVitesse = multiplicateurVitesse;
        this.multiplicateurAttaque = multiplicateurAttaque;
        this.multiplicateurDefense = multiplicateurDefense;
    }
    
    public Classe(String nom,
            float multiplicateurVitesse,
            float multiplicateurAttaque, 
            float multiplicateurDefense, 
            float mulitplicateurPV){
        
        this.setNom(nom);
        this.setMultiplicateurVitesse(multiplicateurVitesse);  
        this.setMultiplicateurAttaque(multiplicateurAttaque); 
        this.setMultiplicateurDefense(multiplicateurDefense);
        this.setMultiplicateurPV(mulitplicateurPV);        
        
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public float getMultiplicateurPV() {
        return multiplicateurPV;
    }

    public float getMultiplicateurVitesse() {
        return multiplicateurVitesse;
    }

    public float getMultiplicateurAttaque() {
        return multiplicateurAttaque;
    }

    public float getMultiplicateurDefense() {
        return multiplicateurDefense;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMultiplicateurPV(float multiplicateurPV) {
        this.multiplicateurPV = multiplicateurPV;
    }

    public void setMultiplicateurVitesse(float mulitiplicateurVitesse) {
        this.multiplicateurVitesse = mulitiplicateurVitesse;
    }

    public void setMultiplicateurAttaque(float multiplicateurAttaque) {
        this.multiplicateurAttaque = multiplicateurAttaque;
    }

    public void setMultiplicateurDefense(float multiplicateurDefense) {
        this.multiplicateurDefense = multiplicateurDefense;
    }
    
    

    private int id;
    private String nom;
    private float multiplicateurPV;
    private float multiplicateurVitesse;
    private float multiplicateurAttaque;
    private float multiplicateurDefense;

}
