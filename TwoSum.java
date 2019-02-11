/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.problems;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author abina
 */
public class TwoSum {
 
    public static void main(String[] args) {
        int[] array = {2,3,5,8,9,10};
        int target = 10;
        int [] ak = sumTwo(array,target);
        System.out.println(ak[0] + " "+ ak[1]);
    }
    
    public static int[] sumTwo(int nums[],int target){
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0 ;i<nums.length -1 ;i++){
            if(map.containsKey(target - nums[i])){
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            else{
                map.put(nums[i],i);
            }
            
        }
        return result;
    }
}
