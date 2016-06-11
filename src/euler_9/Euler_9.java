/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler_9;

/**
 *
 * @author Kacper
 */
public class Euler_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(PythagoreanTriplet());
    }
    public static int PythagoreanTriplet(){
       
       while(true){
           
            for(int c=0;c<1000;c++){
                for(int b=0;b<1000;b++){
                    for(int a=0;a<1000;a++){
                        if(a<b){
                            if(b<c){
                                if(a*a+b*b==c*c&&a+b+c==1000){
                                    return a*b*c;
                                   
                                }
                            }
                        }
                    }
                }
            }
       }
    }
}
