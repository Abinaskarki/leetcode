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
import java.util.*;

public class PowerSetString {
    public static void main(String[] args) {
        String word = "big";
        
        System.out.println(getPowerSet(word));
    }
    
    public static List<String> getPowerSet(String word){
        List<String> result = new ArrayList<String>();
        getAllString(word,0,"", result);
        return result; 
    }
    
    public static void getAllString(String word, int i, String s, List<String> result){
        if(i == word.length()){
            result.add(s);
            return;
        }
        
        getAllString(word,i+1,s+String.valueOf(word.charAt(i)),result);
        getAllString(word, i+1,s,result);
    }
}
