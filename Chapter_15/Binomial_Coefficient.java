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
public class Binomial_Coefficient
{
    private int[][] results;
    
    private int function(int n, int k){
        results = new int[n+1][k+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=(int)Math.min(i,k);j++){
                if(j == 0 || j == i){
                    results[i][j] = 1; 
                }else{
                    results[i][j] = results[i-1][j-1] + results[i-1][j];
                }
            }
        }
        return results[n][k];
    }
    
    public static void main(String[] args)
    {
        int n = 4, k = 2;
        Binomial_Coefficient b = new Binomial_Coefficient();
        System.out.println(b.function(n, k));
    }
    
}
