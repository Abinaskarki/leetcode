/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.problems;

import java.util.*;
/**
 *
 * @author abina
 */
public class PowerSetArrayKsize {
    
    public static void main (String args[]){
        
        int[] arr = {1,2,3,4};
        int k =2;
        
        System.out.println(getKPowerSet(arr,k));
        
    }
    
    private static  List<List<Integer>> getKPowerSet(int[] arr, int k){
        List<List<Integer>> result = new ArrayList<>();
        getKArrays(arr, 0 ,k, new ArrayList<Integer>(), result);
        
       return result;
    }
    
    private static void getKArrays(int[] arr, int i, int k , ArrayList<Integer> li, List<List<Integer>> result){
    
        if(i == arr.length){
            if(li.size() == k){
                result.add(new ArrayList<>(li));
            }      
            return;
        }
        
        li.add(arr[i]);
        getKArrays(arr, i+1, k, li, result);
        li.remove(li.size()-1);
        getKArrays(arr, i+1, k, li, result);
        
    }
}
