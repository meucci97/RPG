package rpgdelamort.model;

public class Arme extends Equipement {
    
    public Arme(String nom){
        
    }

    public float getAttaqueMax() {
        return attaqueMax;
    }

    public float getAtaqqueMin() {
        return ataqqueMin;
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

    public void setAtaqqueMin(float ataqqueMin) {
        this.ataqqueMin = ataqqueMin;
    }

    public void setChanceCrit(float chanceCrit) {
        this.chanceCrit = chanceCrit;
    }

    public void setDegatCrit(float degatCrit) {
        this.degatCrit = degatCrit;
    }

    

    private float attaqueMax;
    private float ataqqueMin;
    private float chanceCrit;
    private float degatCrit;

}
