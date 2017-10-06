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
        if(attaque>=this.pvCourant){
            this.pvCourant=0;
        }else{
            this.pvCourant=this.pvCourant-attaque;
        }
        return attaque;
    }
    
    public boolean esquive(){
        return false;
    }
    
    public boolean isAlive(){
        return this.getPvCourant()> 0f;
    }
    
}
