/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler_12;

/**
 *
 * @author Kacper
 */
public class Euler_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=1, sum=0,highest=0;
        while(true){
            sum+=i;
            for(int j=1;j<sum+1;j++){
                if(sum%j==0){
                    highest++;
                }
            }
            if(highest>500){
                break;
            }
            System.out.println(sum+" "+highest);
            highest=0;
            i++;
            
        }
        System.out.println(sum+" "+highest);
               
    }
    
}
