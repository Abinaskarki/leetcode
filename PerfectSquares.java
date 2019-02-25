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
public class PerfectSquares {
    public static void main(String[] args) {
        System.out.println(getMinSquares(6));
        System.out.println(getMinSquares(1));
        System.out.println(getMinSquares(10000));
        System.out.println(getMinSquares(234));
    }

    private static int getMinSquares(int n) {
        int code[] = new int[n+5];
        code[0] = 0;
        code[1] = 1;
        code[2] = 2;
        code[3] = 3;
        
        for(int i =4;i<=n;i++){
            code[i] = i;
            
            for(int x= 1;x<=i;x++){
                int temp = x*x;
                if(temp>i){
                    break;
                }
                else{
                    code[n] = Math.min(code[n], 1+code[i-temp]);
                }
            }
        }
        
        return code[n];
    }
    
    /*
    USING DYNAMIC PROGRAMMING WITHOUT MEMOIZATION
        private static int getMinSquares(int n) {
        // base cases 
        if (n <= 3) 
            return n; 
  
        // getMinSquares rest of the table using recursive 
        // formula 
        int res = n; // Maximum squares required is 
                     // n (1*1 + 1*1 + ..) 
  
        // Go through all smaller numbers 
        // to recursively find minimum 
        for (int x = 1; x <= n; x++) 
        { 
            int temp = x*x; 
            if (temp > n) 
                break; 
            else
                System.out.println("x "+x);
                System.out.println("getMinSquares  "+getMinSquares(n-temp));
                res =  Math.min(res, 1+getMinSquares(n - temp)); 
                System.out.println("res  "+res);
        } 
        return res; 
    }
    */
}
