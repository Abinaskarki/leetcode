/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.problems;

import java.util.Arrays;

/**
 *
 * @author abina
 */
public class DNA {
    public static void main(String[] args) {
        int a[] = {3,5,2,4};
        int customer = 6;
        System.out.println(dnaValue(a,customer));
    }
    
    public static int dnaValue(int a[],int customer){
        Arrays.sort(a);
        int price = 0;
        for(int i = 0;i<customer;i++){
            int x = a.length-1;
            
            int y = a.length-2;
            if(a[x]>a[y]){
                price = price + a[x];
                System.out.println(price);
                a[x] = a[x] -1;
                System.out.println(a[x]);
            }
            else{
                price  = price + a[y];
                System.out.println(price);
                System.out.println(a[y]);
                a[y] = a[y] -1;
            }
        }
        
        return price;
               
    }
}
