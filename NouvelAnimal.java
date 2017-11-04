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
public class NouvelAnimal {
    ArrayList races = new ArrayList();
    String race;
    String nom;
    String couleur;
    String caractere;
    
    public NouvelAnimal() {
        choisirRace();
    }
    
    
    protected void cri(){
        System.out.println("bruit");
    }
    protected void choisirRace(){
        System.out.println("Race");
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
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
    
    

   
}
