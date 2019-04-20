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
public class PascalOptimizedRow {
    public static void main(String[] args) {
        System.out.println(getRow(3));
        
        ArrayList<Integer> list= new ArrayList<Integer>();
        list.add(0,1);
        list.add(0,1);
        list.add(0,1);
        System.out.println(list);
    }
    
    public static List<Integer> getRow(int rowIndex) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<=rowIndex;i++){
            list.add(0,1);
            System.out.println(list+"  "+i + "  "+list.size());
            for(int j=1;j<list.size()-1;j++){
                list.set(j,list.get(j)+list.get(j+1));
                System.out.println(list);               
            }
            
            System.out.println("");
            System.out.println("");
        }
        return list;
    }
}
