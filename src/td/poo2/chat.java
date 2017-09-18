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
public class chat extends animal {
    private String cri;

    public chat(int age, String nom, String caractere, String couleur) {
        super(age, nom, caractere, couleur);
        cri = "miaou";
        
    }

    public chat(String cri, int age, String nom, String caractere, String couleur) {
        super(age, nom, caractere, couleur);
        this.cri = cri;
    }
    
    public String Tkwa(){
        String str = super.Tkwa()+ " "+this.cri+ " est son cri";
        return str;
    }

    public String getCri() {
        return cri;
    }

    public void setCri(String cri) {
        this.cri = cri;
    }
   
}
