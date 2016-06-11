/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler_6;




/**
 *
 * @author Kacper
 */
public class Euler_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println(differenceSqSumAndSumOfSq(100));
    
    }
    
    public static int differenceSqSumAndSumOfSq(int value){
        int sqSum=0, sumOfSq=0;
        for(int i=1;i<value+1;i++){
            sqSum +=i;
        }
        sqSum *=sqSum;
        for(int i=1;i<value+1;i++){
            sumOfSq +=i*i;
        }

        return sqSum-sumOfSq;
        
            
    }
 

}
