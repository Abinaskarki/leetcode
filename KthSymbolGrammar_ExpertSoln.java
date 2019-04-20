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
public class KthSymbolGrammar_ExpertSoln {
    
    public static void main(String[] args) {
        int N = 30;
        int  K = 123425432;
        
        System.out.println(kth(K-1));
    }

    private static int kth(int K) {
        if(K == 0)
            return 0;
        if(K%2 == 0)
            return kth(K/2);
        else
            return rev(kth(K/2));
    }

    private static int rev(int val) {
        return (val == 0)?1:0;
    }
   
}
