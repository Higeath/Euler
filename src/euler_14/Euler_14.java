/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler_14;

/**
 *
 * @author Kacper
 */
public class Euler_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count =0,highest=0,starting=0;
        long x;
        int i=0;
        for(i=1;i<=1000000;i++){
            count = 0;
            x=i;
            while(x>0){
                //System.out.print(x+" ");
                if(x==1){
                    count++;
                    break;
                }
                       
                if(x%2==0){
                   x=x/2;
                }
                else{
                   x=3*x+1;
                }
                count++;
            }
           // System.out.println();
            if(count>highest){
                highest =count;
                starting = i;
            }
        }
        System.out.println(starting+" "+highest);
    }
    
}
