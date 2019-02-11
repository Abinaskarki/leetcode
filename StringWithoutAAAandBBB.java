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
public class StringWithoutAAAandBBB {
    public static void main(String[] args) {
        String a = strWithout3a3b(4,1);
        System.out.println(a);
        System.out.println(strWithout3a3b(1,1));
        
        
    }
    
    public static String strWithout3a3b(int A, int B) {
       String str = "";
       int  a= 0; int b = 0; 
       int size = A+B;
       for(int i = 0; i<size; i++){
           if((A>=B && a!=2) || b==2){
               str = str + 'a';
               A--;
               a++;
               b=0;
           }
           else if((B>=A && b!=2) || a==2){
               str = str + 'b';
               B--;
               b++;
               a = 0;
           } 
       }
       
        
        return str;
    }
}

