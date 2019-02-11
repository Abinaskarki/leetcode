/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author abina
 */
public class ThreeSum {
    public static void main(String[] args) {
        int[] val = {1,-1,0,1};
        List<List<Integer>> ak = ThreeSum(val);
       
        for(int i = 0;i<ak.size();i++){
            System.out.println(ak.get(i));
            System.out.println("asdf");
        }
        
    }
    
    public static List<List<Integer>> ThreeSum(int nums[]){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        
        for(int i = 0; i<nums.length;i++){
            int start = i +1;
            int end = nums.length-1;
            
            while(start<end){
                if(nums[i] +nums[start] + nums[end] == 0){
                    result.add(Arrays.asList(nums[i],nums[start],nums[end]));
                }
                
                if(nums[i] + nums[start] +nums[end] < 0){
                    int currStart = start;
                    while(nums[currStart] == nums[start] && start<end){
                        start++;
                    }
                }
                else{
                    int currEnd = end;
                    while(nums[currEnd] == nums[end] && start< end){
                        end--;
                    }
                }
            }
        }
        return result;
    }
    
}
