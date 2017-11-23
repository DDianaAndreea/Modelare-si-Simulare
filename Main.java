/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statemachine;

import java.util.Scanner;

/**
 *
 * @author DIANA
 */
public class Main {
    
    public static void main(String[] args){
         try
        {
            CoffeeMachine coffee_machine=new CoffeeMachine();
            Scanner scanner = new Scanner(System.in);
            String input;
            System.out.println("Introduceti optiunea:");
            input = scanner.next();
            
            if(input.equals("5")) {
                System.out.println("Ati introdus o bacnota de 5$");
             } else if(input.equals("10")){
                System.out.println("Ati introdus o bacnota de 10$");
            }else System.out.println("Optiunea introdusa este invalida.Se pot introduce bacnote de 5$ si 10$");
            
            while (!input.equals("0"))
            {
                coffee_machine.transition(input);
                System.out.println("Urmatoarea optiune:");
                input = scanner.next();
               
                if(input.equals("C10")){
                     System.out.println("Ati solicitat o cafea de 10$");
                    }else if(input.equals("C15")){
                        System.out.println("Ati solicitat o cafea de 15$");
                    }else if(input.equals("5")){
                        System.out.println("Ati adaugat 5$");
                    }else if(input.equals("10")){
                        System.out.println("Ati adaugat 10$");
                    }else System.out.println("Optiundea introdusa este invalida.");
                    
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}


