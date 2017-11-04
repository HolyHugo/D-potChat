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
public class AdopteAnimal {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        
        NouvelAnimal unChat = new Chat();
        NouvelAnimal unChien = new Chien();
        unChien.cri();
        unChat.cri();
        
        System.out.println("\n\n");
        System.out.println(unChien.getRace());
        System.out.println(unChien.getNom());
        System.out.println(unChat.getNom());

    }
    
}
