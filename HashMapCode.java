/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.problems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author abina
 */
public class HashMapCode {
    
    public static void main(String[] args) {
        int arr[] = {2,2,9,9,2,6,9,4};
        
        Map<Integer,Integer> map = new LinkedHashMap<>();
        int count = 0;
        
        
        
       for(int i =0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                if(map.get(arr[i]) >= 1){
                    map.remove(arr[i]);
                }
                else{
                    map.put(arr[i],map.get(arr[i])+1);
                }                
            }
            else if(!map.containsKey(arr[i])){
                map.put(arr[i],0);
            }
        }
     
          System.out.println(map);
    }
}
