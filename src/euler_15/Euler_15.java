/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler_15;

import java.util.Arrays;

/**
 *
 * @author Kacper
 */
public class Euler_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] ways = new int[2][2];
        //ways[0][0]=1;
        System.out.println(numberOfPaths(ways,0,0,0));
    }
    
    public static int numberOfPaths(int[][] ways, int count, int x, int y){
        if(x==2&&y==2){
            count++;
            Arrays.fill(ways, null);
            x=0;
            y=0;
        }
         

        if(x<2){
            x++;
            return numberOfPaths(ways, count, x, y);
        }
        if(y<2){
            y++;
            return numberOfPaths(ways, count, x, y);
        }
        
        return count;
    } 
    
}
