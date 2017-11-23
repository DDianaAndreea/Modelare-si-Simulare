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
    public abstract void transition(String action);

  
    
}
