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

    public boolean attaque(Personnage p){
        if(p.esquive()){
            return false;
        }else{
            return p.subirAttaque(arme.get(0).calculDegat()*this.force);
        }
    }
    
    public boolean subirAttaque(float attaque){
        if(attaque>=this.pv){
            this.pv=0;
            return true;
        }else{
            this.pv=this.pv-attaque;
            return false;
        }
    }
    
    public boolean esquive(){
        return false;
    }
    
}
