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
public class Max_Size_Sum_SubSquare
{
    int[][] results;
    private int function(int[][] mat){
        results = new int[mat.length][mat[0].length];
        for(int i=1;i<mat.length;i++){
            for(int j=1;j<mat[0].length;j++){
                if(mat[i][j] == 1 && mat[i-1][j] == 1 && mat[i][j-1] == 1 && 
                        mat[i-1][j-1] == 1){
                    results[i][j] = results[i-1][j-1] + 1;
                }else{
                    results[i][j] = mat[i][j];
                }
            }
        }
        int max = -1;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(results[i][j] > max)
                    max = results[i][j];
            }
        }
        
        for(int i=0;i<results.length;i++){
            for(int j=0;j<results[0].length;j++){
                System.out.print(results[i][j]);
            }System.out.println();
        }
        
        return max;
    }
    
    public static void main(String[] args)
    {
        int[][] mat = new int[][]{{0,1,1,0,1}
                                 ,{1,1,0,1,0},
                                  {0,1,1,1,0},
                                  {1,1,1,1,0}
                                 ,{1,1,1,1,1},
                                  {0,0,0,0,0}};
        Max_Size_Sum_SubSquare m = new Max_Size_Sum_SubSquare();
        System.out.println(m.function(mat));
    }
    
}
