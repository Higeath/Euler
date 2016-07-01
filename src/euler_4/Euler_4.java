/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler_4;
/**
 *
 * @author Kacper
 */
public class Euler_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println(palindrome3digits());
    }
    
    public static int palindrome3digits(){
        int value = 0, highest =0;
        for(int x=100;x<1000;x++){
            for(int y=100;y<1000;y++){
                value = x*y;
                if(isPalindrome(value)&&value>highest){
                     highest = value;
                }
            }
        }
        return highest;
    }
    public static boolean isPalindrome(int value){
        String number = String.valueOf(value);
        char[] digits = number.toCharArray();
        if(digits.length%2==0){
            for(int i=0;i<digits.length/2;i++){
                if(digits[i]!=digits[(digits.length-1)-i]){
                    return false;
                }
                
            }
            return true;
        }
        return false;
    }
}
