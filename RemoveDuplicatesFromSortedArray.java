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
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int arr[]= {0,0,1,2,2,4,4,4,4,4,5,6,7,7,7,8,9,9,9};
        
        int count = removeDuplicateArray(arr);
        for(int i=0;i<count;i++){
            System.out.print(arr[i]+"  ");
        }
    }
    
    //method to remove dupllicates from array
    private static int removeDuplicateArray(int[] arr) {
        int count = 0;      //Setting count as length of sorted array without duplicates
        
        if(arr.length>0){   //checking if array is not empty
            count = 1;
            
            //Looping through all the elements of array
            for(int n:arr){
                if(n>arr[count-1]){     //checking if n is greater than previous element
                    arr[count] = n;     //setting the value of new sorted array as n
                    count++;            //Incrementing the count to store other element in differnet array index
                }
            }
        }
        return count;   //returning count as the length of the sorted array without duplicates
    }
}
