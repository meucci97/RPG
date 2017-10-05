package rpgdelamort.model;

public class Arme extends Equipement {

    public Arme(String nom) {
        super();
        this.setNom(nom);
        this.setImpactVitesse(1f);
        this.setNiveauMin(1);
        this.setAttaqueMin(1f);
        this.setAttaqueMax(1f);
        this.setChanceCrit(0f);
        this.setDegatCrit(1f);
    }

    public Arme(String nom,
            float impactVitesse,
            int niveauMin, 
            float attaqueMax,
            float attaqueMin,
            float chanceCrit, 
            float degatCrit) {
        
        super();
        this.setNom(nom);
        this.setImpactVitesse(impactVitesse);
        this.setNiveauMin(niveauMin);
        this.attaqueMax = attaqueMax;
        this.attaqueMin = attaqueMin;
        this.chanceCrit = chanceCrit;
        this.degatCrit = degatCrit;
    }
    
    

    public float getAttaqueMax() {
        return attaqueMax;
    }

    public float getAttaqueMin() {
        return attaqueMin;
    }

    public float getChanceCrit() {
        return chanceCrit;
    }

    public float getDegatCrit() {
        return degatCrit;
    }

    public void setAttaqueMax(float attaqueMax) {
        this.attaqueMax = attaqueMax;
    }

    public void setAttaqueMin(float ataqqueMin) {
        this.attaqueMin = ataqqueMin;
    }

    public void setChanceCrit(float chanceCrit) {
        this.chanceCrit = chanceCrit;
    }

    public void setDegatCrit(float degatCrit) {
        this.degatCrit = degatCrit;
    }

    @SuppressWarnings("empty-statement")
    public float[] calculDegat(){ //retourne un tableau de flottants [dégats, {0=pasCrit|1=crit}] 
        float degat=attaqueMin;
        //degat=degat+(float)Math.random()%(attaqueMax-attaqueMin); je ne pense pas que ce soit un modulo
        degat=degat+(float)Math.random()*(attaqueMax-attaqueMin);
        if((float)Math.random()<this.chanceCrit){
            float[] tab = {degat*degatCrit, 1}; 
            return tab;
        }
        float[] tab = {degat, 0}; 
        return tab;
    }
    
    private float attaqueMax;
    private float attaqueMin;
    private float chanceCrit; //pourcentage
    private float degatCrit;    //multiplicateur de dégat lors des crits

}
