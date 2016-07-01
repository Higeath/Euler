/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler_20;

import java.math.BigInteger;

/**
 *
 * @author Kacper
 */
public class Euler_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BigInteger factorial100 = BigInteger.valueOf(0);
        factorial100=factorial(BigInteger.valueOf(100),100);
        BigInteger sum= BigInteger.valueOf(0);
        while(factorial100.compareTo(BigInteger.valueOf(0))>0){
            sum = sum.add(factorial100.mod(BigInteger.valueOf(10)));
            factorial100 = factorial100.divide(BigInteger.valueOf(10));
        }
        System.out.println(sum);
        
    }
    
    public static BigInteger factorial(BigInteger value, int counter ){
        if(counter == 1){
            return value;
        }
        
        return factorial(value=value.multiply(BigInteger.valueOf(counter-1)), counter-=1);
    }
}
