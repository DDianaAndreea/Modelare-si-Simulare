/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statemachine;

import java.util.HashMap;

/**
 *
 * @author DIANA
 */
public class CoffeeMachine extends StateMachine {

    
    public CoffeeMachine()
    {
        
        tabela_tranzitie=new HashMap<String,HashMap<String, String>>();
        
        HashMap<String, String> stare_urmatoare;
        stare_urmatoare=new HashMap<String, String>();
        stare_urmatoare.put("5", "S1");
        stare_urmatoare.put("10", "S2");
        tabela_tranzitie.put("S0",stare_urmatoare);

        stare_urmatoare=new HashMap<String,String>();
        stare_urmatoare.put("5", "S2");
        stare_urmatoare.put("10", "S3");
        tabela_tranzitie.put("S1",stare_urmatoare);

        stare_urmatoare=new HashMap<String,String>();
        stare_urmatoare.put("5"," S3");
        stare_urmatoare.put("C10"," S0");
        tabela_tranzitie.put("S2",stare_urmatoare);

        stare_urmatoare=new HashMap<String,String>();
        stare_urmatoare.put("C10"," S1");
        stare_urmatoare.put("C15"," S0");
        tabela_tranzitie.put("S3",stare_urmatoare);
        
        stare_curenta="S0";
     
        
    }
    
}
