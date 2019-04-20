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
public class KthSymbolGrammar_MySolution {
    public static void main(String args[]){
         String s = "";
        int N =6;
        int K = 5;
        String str = getKthVal(N, s);
        System.out.println(str);
        System.out.println(Integer.parseInt(String.valueOf(str.charAt(K-1))));
    }

    private static String getKthVal(int N, String s) {
        if(N==1){
            s = s+'0';
            return s;
        }
        else{
            String val = getKthVal(N-1,s);
            return val + getReverseVal(val);
        }
    }

    private static String getReverseVal(String val) {
        String s ="";
        
        for(int i=0;i<val.length();i++){
            if(val.charAt(i) == '0')
                s= s+'1';
            else
                s=s+'0';
        }
        return s;
    }
}
