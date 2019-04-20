/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.problems;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author abina
 */
public class FirstUniqueCharInNString {
    public static void main(String[] args) {
        String a = "asdf";
        System.out.println(a);
        System.out.println(firstUniqueChar(a));
        
        String b = "catcatcatf";
        System.out.println(b);
        System.out.println(firstUniqueChar(b));

    }

    private static int firstUniqueChar(String s) {
        //Checking for null cases
        if(s==null || s.length()<1){
            return -1;
        }
        
        //Creating a LinkedHashMap which doesnot alter the index of char while storing 
        Map<Character,Integer> map =  new LinkedHashMap();
        
        //Looping through String and storing it to LinkedHashMap
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        
        //Initializing res to -1
        int res = -1;
        boolean a= true;
        int i = 0;
        
        //Looping through chars from string and storing its index to res if it satisfies "if condidition"
        while(a && i<s.length()){
            if((map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) == 1)){
                res = i;
                a = false; 
            }
            i++;
        }        
        
        return res;
        
    }
}
