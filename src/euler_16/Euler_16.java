/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler_16;

import java.math.BigInteger;

/**
 *
 * @author Kacper
 */
public class Euler_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        //System.out.println(powersOfTwo(1000,new BigInteger("1")));
        System.out.println(sumOfPowerOfTwo(powersOfTwo(1000, new BigInteger("1"))));
    }
    
    public static BigInteger powersOfTwo(int value, BigInteger answer){
        if(value==0){
            return answer;
        }
        return answer=powersOfTwo(value-1,answer.multiply(BigInteger.valueOf(2)));
    }
    public static BigInteger sumOfPowerOfTwo(BigInteger answer){
        BigInteger sum=new BigInteger("0");
        while(answer.compareTo(BigInteger.valueOf(0))!=0||answer.compareTo(BigInteger.valueOf(0))==1){
            sum = sum.add(answer.remainder(BigInteger.valueOf(10)));
            answer = answer.divide(BigInteger.valueOf(10));
            
        }
        return sum;
    }
    
}
