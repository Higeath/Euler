/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler_2;

/**
 *
 * @author Kacper
 */
public class Euler_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... only even numbers
        System.out.println(fibonnaciSeq(0,1,0,0));
    }
    
    static long fibonnaciSeq(int temp1, int temp2, int sum, long sum2){
        if(sum>=4000000){
            return sum2;
        }
        sum = temp1+temp2;
        temp1= temp2;
        temp2 = sum;
        if(sum%2==0){
            sum2+=sum;
        }
        return fibonnaciSeq(temp1, temp2, sum, sum2);

    }
}
