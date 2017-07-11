/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chapter_15;

/**
 *
 * @author Kunwar
 */
public class Min_Cost_Path
{
    private int[][] tc;
    private int minCost(int[][] mat){
        int i,j;
        tc = new int[mat.length][mat[0].length];
        tc[0][0] = mat[0][0];
        for(i = 1;i<mat.length;i++){
            tc[i][0] = mat[i][0] + tc[i-1][0];
        }
        for(j = 1;j<mat[0].length;j++){
            tc[0][j] = mat[0][j] + tc[0][j-1];
        }
        for(i=1;i<mat.length;i++){
            for(j=1;j<mat[0].length;j++){
                tc[i][j] = Math.min(Math.min(tc[i-1][j], tc[i][j-1]),tc[i-1][j-1]) + mat[i][j];
            }
        }
        
        return tc[mat.length-1][mat[0].length-1];
    }
    
    public static void main(String[] args)
    {
        int cost[][]= {{1, 2, 3},
                       {4, 8, 2},
                       {1, 5, 3}};
        Min_Cost_Path m = new Min_Cost_Path();
        System.out.println(m.minCost(cost));
    }
    
}
