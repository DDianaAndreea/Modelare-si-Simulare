/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statemachine;

/**
 *
 * @author DIANA
 */
import java.util.HashMap;

public abstract class StateMachine {
    String stare_curenta;
    HashMap<String,HashMap<String, String>> tabela_tranzitie;
   

    public void transition(String action) {
       
        if(tabela_tranzitie.get(stare_curenta) != null && tabela_tranzitie.get(stare_curenta).get(action) != null)
            stare_curenta = tabela_tranzitie.get(stare_curenta).get(action);
        System.out.println("Starea curenta:" +stare_curenta);
        
    }
    
}
