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
public class longestCommonPrefix {
    public static void main(String[] args) {
        String a[] ={"flower","flow","flight"};
        String b[] = {"dog","racecar","car"};
        String c[] = {""};
        String d[] = null;
        
        System.out.println(longCommonPrefix(a,findMin(a)));
        System.out.println(longCommonPrefix(b,findMin(b)));
        System.out.println(longCommonPrefix(c,findMin(c)));
       //System.out.println(longCommonPrefix(d,findMin(d)));
    }

    private static String longCommonPrefix(String[] a,String min) {
        if(a == null){
            throw new NullPointerException("Array is null");
        }
        else if(a.length == 0){
            return "";
        }
        else{
            for(String st:a){
            if(!st.startsWith(min)){
                return longCommonPrefix(a,min.substring(0, min.length()-1));
            }
          }
        }
        return min;
        
    }
    
    private static String findMin(String ar[]){
        if(ar == null){
            throw new NullPointerException("Array is null");
        }
        else if(ar.length==0){
            return "";
        }
        else{
            String min = ar[0];
        
        for(String b:ar){
            if(min.length() > b.length()){
                min = b;
            }
        }
        return min;
        }
        
        
    }
}
