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
public class KClosestPointToOrigin {
    public static void main(String[] args) {
        int[][] points1 = {new int[]{2,-2},new int[]{1,4}};
        int[][] points2 = {new int[]{3,3},new int[]{5,-1},new int[]{-2,4}};
        
        int k1= 1;
        int[][] res1= getKClosestPoint(points1,k1);
        System.out.println("CASEI");
        for(int i=0;i<k1;i++){
            System.out.print(res1[i][0]+" , "+res1[i][1]);
        }
        
        int k2 = 2;
        int[][] res2 = getKClosestPoint(points2,k2);
        
        System.out.println("");
        System.out.println("CASE II");
        for(int i=0;i<k2;i++){
            System.out.println(res2[i][0]+" , "+res2[i][1]);
            
        }
    }
    
    public static int[][] getKClosestPoint(int[][] points,int k){

        PriorityQueue<int[]> minHeap = new PriorityQueue<int[]>(points.length,new Comparator<int[]>(){
            @Override
            public int compare(int[] a,int[] b){
                int adist = a[0]*a[0]+a[1]*a[1];
                int bdist = b[0]*b[0] + b[1]*b[1];
                
                return adist-bdist;
            }
        });
        
        for(int[] point:points){
            minHeap.add(point);
        }
        
        int res[][] = new int[k][2];
        
        for(int i=0;i<k;i++){
            int[] val = minHeap.poll();
            res[i][0] = val[0];
            res[i][1] = val[1];
        }
        return res;
        
    }
}
