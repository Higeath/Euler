/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler_10;

/**
 *
 * @author Kacper
 */
public class Euler_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long i =2;
        long sum =0;
        while(i<2000000){
            if(isPrime(i)){
                sum+=i;
            }
            System.out.println(i);
            i++;
        }
        System.out.println(sum);
                
    }
      
    public static boolean isPrime(long value){
        if(value>5){
            if(value%2==0||value%3==0||value%5==0){
                return false;
            }
        }
        for(int i=1;i<value+1;i++){
            if(value%i==0&&i!=value&&i!=1){
                return false;
            }
        }
        return true;
    }
    
}
