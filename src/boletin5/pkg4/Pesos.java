/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg4;

/**
 *
 * @author propa
 */
public class Pesos {private float peso1, peso2;

    public Pesos(){
        peso1=0;
        peso2=0;
    }
    public Pesos (float p1, float p2){
        peso1=p1;
        peso2=p2;
    }

    public void resultado(float p1, float p2){
        if (p1>p2)
            System.out.println("A diferencia de peso é " + (p1-p2) + "kg. A primeira persoa pesa máis.");
        else if (p2>p1)
            System.out.println("A diferencia de peso é " + (p2-p1) + "kg. A segunda persoa pesa máis.");
            else 
            System.out.println("Pesan o mesmo");
    }
    
}
