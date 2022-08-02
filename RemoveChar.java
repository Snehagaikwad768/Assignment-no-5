/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class RemoveChar {
    public static void main(String[] args) {  
              String str = "India is my country";  
              System.out.println(charRemoveAt(str, 7));  
           }  
           public static String charRemoveAt(String str, int p) {  
              return str.substring(0, p) + str.substring(p + 1);  
           }  
}  

