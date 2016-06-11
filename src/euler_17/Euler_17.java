/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler_17;

import java.util.Arrays;

/**
 *
 * @author Kacper
 */
public class Euler_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] numbers = 
            {
                {"one","two","three","four","five","six","seven","eight","nine"},
                {"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"},
                {"hundred"},
                {"thousand"},
                {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"},
            };
        
        String digitWord="";
        String digitWords="";
        for(int i=1;i<1001;i++){
            int[] digits = digits(i);
            System.out.println(Arrays.toString(digits));
            for(int j=0; j<digits.length;j++){
                
                if(j>1&&digits[j]>0){ 
                    digitWord += numbers[j][0];
                    digitWord += numbers[0][digits[j]-1];
                }
                else if(digits[j]>0||digits[j]!=1&&j!=1&&digitWord.length()!=0){
                    if(digits.length>1&&digits[1]==1&&digits[0]>0){
                        digitWord += numbers[4][digits[j]-1];
                        j++;
                    }else{
                        digitWord += numbers[j][digits[j]-1];
                    }
                }
                if(digits.length>2&&j==1&&digitWord.length()!=0){
                    digitWord += "and";
                }
                
            }
            System.out.println(digitWord);
            digitWords+=digitWord;
            digitWord = "";
        }
        System.out.println(digitWords.length());
    }
    
    public static int[] digits(int value){
        int valueDigits = String.valueOf(value).length();
        int[] digits = new int[valueDigits];
        int temp = value;
        for(int i=0; i<valueDigits;i++){
            digits[i] = temp%10;
            temp /=10;
        }
        return digits;
    }
}
