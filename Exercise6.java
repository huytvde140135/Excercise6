/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author OS
 */
public class Exercise6 {
 private static ArrayList<String> replaceRepetitive(String words) {     
    String [] arr = words.split("\\s");
    ArrayList<String> a = new ArrayList<String>(Arrays.asList(arr));
     for (int i = 0; i < a.size() - 1; i++) {
         int j = i + 1;
         String b = "";
         if (j<a.size() &&a.get(i).equals(a.get(j))) {
             b = a.get(j);
             a.remove(j);
         }
         if (b != "") a.set(i, "REAPEAT");
     }
     return a;
  }
  
 
    public static void main(String[] args){
        //Case 1
        ArrayList<String> a = replaceRepetitive("i want to to go go the the zoo");
        System.out.println("Case 1: i want to to go go the the zoo");
        System.out.print("Expect output: ");
        for (String b:a){
            System.out.print(b+" ");   
        }
        System.out.println("\nReal ouput: i want REPEAT REPEAT REPEAT zoo");
        
        //Case 2
        ArrayList<String> c = replaceRepetitive("truong van van huy huy");
        System.out.println("\nCase 2: truong van van huy huy");
        System.out.print("Expect output: ");
        for (String b:c){
            System.out.print(b+" ");   
        }
        System.out.println("\nReal ouput: truong REPEAT REPEAT");
        
        //Case 3
        ArrayList<String> d = replaceRepetitive("fpt fpt university number number one");
        System.out.println("\nCase 3: fpt fpt university number number one");
        System.out.print("Expect output: ");
        for (String b:d){
            System.out.print(b+" ");   
        }
        System.out.println("\nReal ouput: REPEAT university REPEAT one");
        
        //Case 4
        ArrayList<String> e = replaceRepetitive("laobao town in in my heart heart");
        System.out.println("\nCase 4: laobao town in in my heart heart");
        System.out.print("Expect output: ");
        for (String b:e){
            System.out.print(b+" ");   
        }
        System.out.println("\nReal ouput: laobao town REPEAT my REPEAT");
        
        //Case 5
        //Case 4
        ArrayList<String> f = replaceRepetitive("em yeu yeu co co giao");
        System.out.println("\nCase 5: em yeu yeu co co giao");
        System.out.print("Expect output: ");
        for (String b:f){
            System.out.print(b+" ");   
        }
        System.out.println("\nReal ouput: em REPEAT REPEAT giao");
        
        
    }
    
}
