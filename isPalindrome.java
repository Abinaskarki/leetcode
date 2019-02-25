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
public class isPalindrome {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(palindrome(x));
    }

    private static boolean palindrome(int x) {
        String a = "";
        int b = x;
        
        if(x<0){
            return false;
        }
        else if(x == 0){
            return true;
        }
        else{
            while(b != 0){
                a = a+b%10;
                b= b/10;
            }
        }
        
        if(Integer.parseInt(a) == b){
            return true;
        }
        else{
            return false;
        }
    }
}
