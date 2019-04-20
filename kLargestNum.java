/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.problems;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author abina
 */
public class kLargestNum {
    public static void main(String[] args) {
        int a[] = {2,35,67,92,689,03,15};
        int k = 1;
        System.out.println(getLargestK(a,k));
    }
    
    private static int getLargestK(int[] a,int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(a.length,new Comparator<Integer>(){

           @Override
           public int compare(Integer a, Integer b){
               return b-a;
           }
        });
        
        for(int i:a){
            maxHeap.add(i);
        }
        
        for(int i=0;i<k-1;i++){
            maxHeap.poll();
        }
        return maxHeap.poll();
}
}
