/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.leetcode;

/**
 *
 * @author abina
 */
class nQueenProblem {

         class Position{
        int row,col;
        Position(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    
    public Position[] solveNQueen(int n){
        Position[] pos = new Position[n];
        
        if(solveNQueenHelper(n,0, pos)){
            return pos;
        }
        else{
            return new Position[0];
        }
    }
    
    public boolean solveNQueenHelper(int n, int row, Position[] pos){
        if(row == n){
            return true;
        }
        
        int col;
        for(col = 0; col<n; col++){
            boolean foundSafe = true;
            
            for(int queen =0;queen<row ;queen++){
                if(pos[queen].col == col || pos[queen].row - pos[queen].col == row-col
                        || pos[queen].row + pos[queen].col == row+col){
                    foundSafe = false;
                    break;
                }
            }
            
            if(foundSafe){
                pos[row]  = new Position(row,col);
                if(solveNQueenHelper(n,row+1,pos)){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        nQueenProblem nq = new nQueenProblem();
        Position[] pos = nq.solveNQueen(4);
        for(Position p:pos){
            System.out.println(p.row + " "+ p.col);
        }
    }
}
