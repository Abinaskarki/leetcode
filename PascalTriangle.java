/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.problems;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abina
 */
public class PascalTriangle {
    public static void main(String[] args) {
        
        //Creating arraylist for getting the result list
        ArrayList<ArrayList<Integer>> list = getPascal(5);
        
        //Looping through arraylist and printing it out.
        for(List<Integer> i:list){
            System.out.println(i);
        }
        
    }
    
    private static ArrayList<ArrayList<Integer>> getPascal(int val) {
        
        //Creating a nested arraylist "result" to store result
        ArrayList<ArrayList<Integer>> result =new ArrayList<ArrayList<Integer>>();
        
        //initializing a 2*2 matrix array to store values
        int [][] arr = new int[val][val];
        
        //initializing array with 1 at row 0 and column 0
        arr[0][0] = 1;
        
        //Creating another arraylist to store values in list and pass to main result arraylist
        ArrayList<Integer> small = new ArrayList<Integer>();
        small.add(arr[0][0]);
        result.add(small);
        
        //Looping until user val is reaced
        for(int i = 1;i<val;i++){
            
            //creating new small arraylist to store values
            small = new ArrayList<>();
            
            //looping until we get all the elements for that small arraylist
            for(int j =0 ;j<=i;j++){
                
                //gettting values from method
                arr[i][j] = getValPascalTriangle(i,j,arr);
                small.add(arr[i][j]);
            }
            
            //adding the small Arraylist to the result 
            result.add(small);
        }
        
        //returning the result
        return result;
        
    }
        
    public static int getValPascalTriangle(int row, int col, int[][] arr){
        
        //base cases with memoization case
        if(row == col)
            return 1;
        if(col == 0)
            return 1;
        if(arr[row][col] != 0)
            return arr[row][col];
        
        //if base cases are not met, get value by using recursion and formula
        return getValPascalTriangle(row-1,col-1,arr) + getValPascalTriangle(row-1,col,arr);
            
            
    }


}
