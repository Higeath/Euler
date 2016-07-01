/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler_19;

/**
 *
 * @author Kacper
 */
public class Euler_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year=1901, month=1, day=1;
        int[] daysInMonth={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int sundays=0;
        int sundayCounter=1;
        
        for(int y=year; y<2001; y++){
            if(y%4==0&&y%100!=0||y%100==0&&y%400==0){
                daysInMonth[1]=29;
            }else{
                daysInMonth[1]=28;
            }
            for(int m=1; m<13;m++){
                for(int d=1; d<(daysInMonth[m-1]+1);d++){
                    sundayCounter++;
                    if(sundayCounter==7){
                        sundayCounter =0;
                        if(d==1){
                            sundays++;
                        }
                    }
                    System.out.println("Year: "+y+" month: "+m+" day: "+d + " Sundays: "+sundays+" counter: "+sundayCounter);
                    if(y==2000&&m==12&&d==31){
                        break;
                    }
                }
            }
            
        }
        
        System.out.println(sundays);
    }
    
}
