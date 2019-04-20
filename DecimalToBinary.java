/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.problems;

/**
 *
 * @author abina
 */
public class DecimalToBinary {
    public static void main(String[] args) {
        decimalBinary(6);
        //System.out.println(val);
    }

    private static void decimalBinary(int i) {
        String c = "";
        
        while(i > 0){
            int a = i%2;
            c = c+""+a;
            i=i/2;
        }
        
        for(int j=c.length()-1;j>=0;j--){
            System.out.print(c.charAt(j));
        }
         System.out.println("");
        
        
    }
    
}
