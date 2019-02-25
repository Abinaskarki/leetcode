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
public class ReverseInteger {
    public static void main(String[] args) {
        int x =1534236469;
        int y = -1534236469;
        int z = -23454;
        int a = 34356754;
        
        System.out.println(reverseInt(x));
        System.out.println(reverseInt(y));
        System.out.println(reverseInt(z));
        System.out.println(reverseInt(a));
    }

    private static int reverseInt(int x) {
        String a = String.valueOf(x);
        char ar[] = a.toCharArray();
        String b = "";
        
        if(ar[0] == '-'){
            b = b+ar[0];
            for(int i =ar.length-1;i>0;i--){
                b = b+ar[i];
            }
        }
        else{
            for(int i = ar.length-1;i>=0;i--){
                b = b+ar[i];
            }
        }
        
        long val = Long.parseLong(b);
        if(val > Integer.MAX_VALUE || val<Integer.MIN_VALUE){
            return 0;
        }
        
        return (int) val;
    }
}
