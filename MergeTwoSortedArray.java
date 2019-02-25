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
public class MergeTwoSortedArray {
   
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        int m = 3;
        int n =3;
        mergeTwoArray(nums1,m,nums2,n);
    }
    //the merged sorted array is stored in nums1
    private static void mergeTwoArray(int[] nums1, int m, int[] nums2, int n) {
       //checking if given num1 array is empty
        if(nums1 == null){
            nums1 = nums2;
        }
        
        int i = m-1;   //storing the length of nums1 -1
        int j = n-1;    //storing the length of nums2-1
        int count = m+n-1;  //storing the length of merge sorted -1
        
        while(i>=0 && j>=0){    //looping until one array's all elements are checked
            if(nums1[i] > nums2[j]){  //checking if nums1[i] > nums2[j]
                nums1[count] = nums1[i];    // storing the nums1[i] to last element of merged array
                i--;        //decrementing i value
            }
            else{
                nums1[count] = nums2[j];    //storing nums2[j] to end element of merged array
                j--;    //decrementing j value
            }
            count--;    //decrementing count value
        }
        
        //checking if nums1 array is not empty and if it is not,
        //storing all its value to merged array
        while(i>=0){
            nums1[count] = nums1[i];
            i--;count--;
        }
        
        //checking if nums2 array is not empty and if it is not,
        //storing all its value to merged array
        while(j>=0){
            nums1[count] = nums2[j];
            j--;count--;
        }
        
        //Printing out the values of sorted array
        for(int x =0;x<m+n;x++){
            System.out.print(nums1[x]+" ");
        }
    }
   
   
}
