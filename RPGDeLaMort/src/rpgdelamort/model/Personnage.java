package rpgdelamort.model;

import java.lang.reflect.Array;
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

    public Arme getArmeEquiper() {
        return arme.get(0);
    }

    public void setArmeEquiper(Arme a) {
        arme.add(0, a);
    }

    //Selection Personnage
    public Personnage(int id, String nom, float pv, int niveau, double progression, float vitesse, float defense, float force, ArrayList<Arme> arme, Armure armure, Classe classe) {
        super(id, nom, pv, niveau, progression, vitesse, defense, force);
        this.arme = arme;
        this.armure = armure;
        this.classe = classe;
    }

    //Creation Personnage
    public Personnage(String nom, float pv, int niveau, double progression, float vitesse, float defense, float force, ArrayList<Arme> arme, Armure armure, Classe classe) {
        super(nom, pv, niveau, progression, vitesse, defense, force);
        this.arme = arme;
        this.armure = armure;
        this.classe = classe;
    }

    public float[] attaque(Personnage p){ //retourne un tableau de flottant: dégats envoyés, crit(1f)|pas crit(0f), degats subis
        float tab[] = {0f,0f,0f};
        
        if(!p.esquive()){
            float[] degatArme = arme.get(0).calculDegat();
            tab[0] = degatArme[0]*this.force; //degats envoyés
            tab[1] = degatArme[1]; //critique
            tab[2] = p.subirAttaque(tab[0]); //degats infligés
            
        }
        else{
            
        }
        return tab;
    }
    
    public float subirAttaque(float attaque){
        if(reductionDegat(attaque)>=this.pvCourant){
            this.pvCourant=0;
        }else{
            this.pvCourant=this.pvCourant-reductionDegat(attaque);
        }
        return reductionDegat(attaque);
    }
    
    public boolean esquive(){
        float vitesseReelle = this.getVitesse()*this.getArmure().getImpactVitesse()*this.getArmeEquiper().getImpactVitesse(); //reduction de la vitesse par l'equipement
        return Math.random() < (((40*Math.log10(vitesseReelle))+10))/100;
    }
    
    public boolean isAlive(){
        return this.getPvCourant()> 0f;
    }
    
    public void appliqueModifClasse(){//quand le perso levelUp
        this.force = this.force * this.getClasse().getMultiplicateurAttaque();
        this.pv *= this.getClasse().getMultiplicateurPV();
        this.pvCourant = this.pv; //remise a niveau des pvCourant après modiification des pv max
        this.defense *= this.getClasse().getMultiplicateurDefense();
        this.vitesse *= this.getClasse().getMultiplicateurVitesse();
    }
    
    public double getXpToLevelUp(){
        return 4*(Math.pow(this.getNiveau()+1,2)); //lvl A --> lvl A + 1 necessite 4(A+1)² d'experience
    }
    
    public double getXpDonnee(){
        return 10*this.getNiveau();
    }
    
    public float reductionDegat(float degat){
        return (float) (degat* ((100-((40*Math.log10(((this.getArmure().getDefense())+ this.getDefense())/3))+10))/100));
    }
}
