/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.problems;

import java.util.HashMap;

/**
 *
 * @author abina
 */
public class RomanToInt {
    public static void main(String[] args) {
        String s= "III";
        
        HashMap<Character,Integer> map = createMap();
        int result = map.get(s.charAt(s.length()-1));
        
        for(int i=s.length()-2;i>=0;i--){
            if(map.get(s.charAt(i+1)) > map.get(s.charAt(i))){
                result -= map.get(s.charAt(i));
                System.out.println(result);
            }
            else{
                result += map.get(s.charAt(i));
                System.out.println(result);
            }
        }
        
        System.out.println(result);
        
    }
    public static HashMap<Character,Integer> createMap(){
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
            map.put('I',1);
            map.put('V',5);
            map.put('X',10);
            map.put('L',50);
            map.put('C',100);
            map.put('D',500);
            map.put('M',1000);
            
            return map;
    }
}
