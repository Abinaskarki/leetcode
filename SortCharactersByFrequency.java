/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.problems;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 *
 * @author abina
 */
public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String s ="tree";
        String str = "";
        String st = "bcccbaaa";
        
        System.out.println(sortByFrequency(str));
        System.out.println(sortByFrequency(s));
        System.out.println(sortByFrequency(st));
    }

    private static String sortByFrequency(String s) {
        //base case checking if null or not
        if(s.length() < 1 || s==null){
            return s;
        }
        
        //creating a map to store characters and char counts
        final Map<Character,Integer> map = new HashMap();
        
        //looping through all chars in string and storing to map
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        
        //Creating a priorityqueue maxHeap to store characters by maximum count
        PriorityQueue<Character> maxHeap = new PriorityQueue<Character>(map.size(),new Comparator<Character>(){
           @Override
            public int compare(Character a, Character b){
                return map.get(b)-map.get(a);
            }
        });
        
        
        maxHeap.addAll(map.keySet());
        
        //Create a StringBuilder to store characters and make a result string 
        StringBuilder str = new StringBuilder();
        
        //appending to str by polling value from maxHeap
        while(!maxHeap.isEmpty()){
            char c = maxHeap.poll();
            for(int i=0;i<map.get(c);i++){
                str.append(c);
            }
        }        
        return str.toString();
    }
}
