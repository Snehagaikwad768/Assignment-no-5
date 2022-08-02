/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.util.*;   

public class RemoveDuplicatesExample1 {
     //Creating removeDuplicates() method to remove duplicates from array  
    static void removeDuplicate(char str[], int length)   
    {   
        //Creating index variable to use it as index in the modified string   
        int index = 0;   
    
        // Traversing character array  
        for (int i = 0; i < length; i++)   
        {   
              
            // Check whether str[i] is present before or not   
            int j;   
            for (j = 0; j < i; j++)    
            {   
                if (str[i] == str[j])   
                {   
                    break;   
                }   
            }   
    
            // If the character is not present before, add it to resulting string   
            if (j == i)    
            {   
                str[index++] = str[i];   
            }   
        }   
        System.out.println(String.valueOf(Arrays.copyOf(str, index)));   
    }   
    
    // main() method starts  
    public static void main(String[] args)   
    {   
        String info = "javaTpoint is the best learning website";  
        //Converting string to character array  
        char str[] = info.toCharArray();  
        //Calculating length of the character array  
        int len = str.length;   
        //Calling removeDuplicates() method to remove duplicate characters  
        removeDuplicate(str, len);   
    }   
}  

