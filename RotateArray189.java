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
public class RotateArray189 {
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int k = 3;
  
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
        
//        rotateArray(arr,k);        
    }

//    private static void rotateArray(int[] arr, int k) {
//
//        k = k%arr.length;
//        
//        reverse(arr,0,arr.length);
//        int count = 0;
//        while(count < k){
//            int temp = arr[arr.length-1];
//            
//            for(int i = arr.length-1;i>0;i--){
//                arr[i] = arr[i-1];
//            }
//            arr[0] = temp;
//            count++;
//        }
//        
//        for(int a = 0;a<arr.length;a++){
//            System.out.print(arr[a]+"  ");
//        }
  //  }
    
    private static void reverse(int[] arr, int start, int end) {
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    /*
    ANOTHER WAY OF SOLVING THE PROBLEM
        public void rotate(int[] nums, int k) {
         k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);      
    }
    
    public void reverse(int[] nums, int start, int end) {
    while (start < end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
}
    */

}


