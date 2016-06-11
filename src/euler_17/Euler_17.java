/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler_17;

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
                {"ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"},
                {"hundred"},
                {"thousand"}
            };
        

        String sumL="";
        String sumAll="";
        int x ;
        for(int j=1;j<1001;j++){
            x=j;
            for(int i =0;i<String.valueOf(j).length();i++){
                if(i>1&&x%10>0){
                    sumL += numbers[i][0];
                    //sumL +=" ";
                    sumL += numbers[0][(x%10)-1];
                    //sumL += " ";
                }

                else if(x%10>0){
                    sumL += numbers[i][(x%10)-1];
                    if(String.valueOf(j).length()>2&&i==0){
                        //sumL+="-";
                    }else{
                        //sumL += " ";
                    }
                }

                if(String.valueOf(j).length()>2&&i==1&&sumL.length()!=0){
                    sumL += "and";
                }
                x=x/10;
              
            }
            System.out.println(sumL);
            sumAll+=sumL;
            sumL="";
            //sumL="";
        }
          //  System.out.println(sumL);
        System.out.println(sumAll.length());
    }
    
}
