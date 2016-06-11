/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler_3;

/**
 *
 * @author Kacper
 */
public class Euler_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(600851475143L,2,0));
    }
 
     public static long largestPrimeFactor(long factor, int value, long largest){
      if(value==factor){
          return largest;
      }
        if(factor%value==0){
           factor = factor/value;
           largest = factor;
           return largestPrimeFactor(factor,value, largest);
       }
           value++;
           return largestPrimeFactor(factor, value, largest);
       
        
    }

}
