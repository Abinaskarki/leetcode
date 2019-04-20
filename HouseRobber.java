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
public class HouseRobber {
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,2,6,1,9};
        System.out.println(getMaxVal(arr));
    }
    
    private static int getMaxVal(int[] arr){
        int inc = 0;
        int exl = 0;
        
        for(int i = 0; i<arr.length; i++){
            int temp = inc;
            inc = Math.max(exl + arr[i],inc);
            exl = temp;
        }
        
        return Math.max(inc,exl);
    }
}
