/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adopteanimal;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HolyHugo
 */
public class Chien extends NouvelAnimal {
    
    public Chien() {
        setNom("Isis");
        setCaractere("Joyeux");
        setCouleur("Brun");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getCaractere() {
        return caractere;
    }

    public void setCaractere(String caractere) {
        this.caractere = caractere;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
        protected void cri(){
        System.out.println("Wouf");
    }
        
    protected void choisirRace(){
        races.add(0,"Labrador");
        races.add(1,"Yorkshire");
        races.add(2,"Cocker");
        for(int i =0; i<races.size(); i++){
            System.out.println(races.get(i));}
        Scanner sc2 = new Scanner(System.in);
        race = sc2.nextLine();
        if("Labrador".equals(race)||"Yorkshire".equals(race)||"Cocker".equals(race)){
            setRace(race);}
        
    }

    
}
