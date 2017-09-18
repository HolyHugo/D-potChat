/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.poo2;
import java.util.Scanner;

/**
 *
 * @author hugo_portable
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String varchoix = "";
        Scanner choix = new Scanner(System.in);
        
        varchoix = choix.nextLine();
        if ("chien".equals(varchoix)){
            chien chien = new chien(6 ,"Vylo","malin","noire");
            System.out.println(chien.Tkwa());
        }
        if ("chat".equals(varchoix)){
        chat chat = new chat(3 ,"Zigzag","fainéant","blanche");
        System.out.println(chat.Tkwa());
        }else{
            System.out.println("Animal inconnu");
        }

        
    }
    
}
