/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.poo2;

/**
 *
 * @author hugo_portable
 */
public class animal {
    protected int age;
    protected String nom,caractere,couleur;

    public animal(int age, String nom, String caractere, String couleur) {
        this.age = age;
        this.nom = nom;
        this.caractere = caractere;
        this.couleur = couleur;
    }

   

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCaractere() {
        return caractere;
    }

    public void setCaractere(String caractere) {
        this.caractere = caractere;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    



    public String Tkwa(){
        return "\t"+this.nom+" a "+this.age+"ans il est de couleur "+this.couleur+" et est sacrement "+this.caractere;
                }
    }

