/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler_5;



/**
 *
 * @author Kacper
 */
public class Euler_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println(divisible1to20(1,1));
    
    }
    
    public static int divisible1to20(int value, int diviser){
        while(true){
            if(value%diviser==0&&diviser==20){
                break;        
            }
            if(value%diviser==0){
                diviser++;
            }else{
                diviser=1;
                value++;
            }
        }
        return value;
        
            
    }
 

}
