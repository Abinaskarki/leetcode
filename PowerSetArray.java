/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.problems;

import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author abina
 */
public class PowerSetArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        
        System.out.println(getPowerSet(arr));
    }
    
    public static ArrayList<ArrayList<Integer>> getPowerSet(int[] arr){
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        
        getAlllists(arr,0,new ArrayList<Integer>(),result);
        
        return result;
    }
    
    public static void getAlllists(int[] arr, int i , ArrayList<Integer> li, ArrayList<ArrayList<Integer>> result){
        if(i == arr.length){
            result.add(new ArrayList<>(li));
            return;
        }
        li.add(arr[i]);
        getAlllists(arr,i+1,li,result);
        
        li.remove(li.size()-1);
        getAlllists(arr,i+1,li,result);
    }
}
