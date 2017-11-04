/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adopteanimal;

import java.util.Scanner;

/**
 *
 * @author HolyHugo
 */
class Chat extends NouvelAnimal {

    public Chat() {
        setNom("Kimi");
        setCaractere("Joueur");
        setCouleur("Noir");
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
        System.out.println("Mew");
    }
    
    protected void choisirRace(){
        races.add(0,"Goutiere");
        races.add(1,"Shorthair");
        races.add(2,"Angora");
        System.out.println("Quelle race ?");
        for(int i =0; i<races.size(); i++){
            System.out.println(races.get(i));}
        Scanner sc2 = new Scanner(System.in);
        race = sc2.nextLine();
        if("Goutiere".equals(race)||"Shorthair".equals(race)||"Angora".equals(race)){
            setRace(race);}
    }



    
}
