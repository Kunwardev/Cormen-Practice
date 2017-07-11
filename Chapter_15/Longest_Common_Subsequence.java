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
public class Longest_Common_Subsequence
{
    int[][] results;
    private int function(char[] a, char[] b){
        if(a.length == 0 || b.length == 0)
            return 0;
        results = new int[a.length+1][b.length+1];
        for(int i=0;i<=a.length;i++){
            for(int j=0;j<=b.length;j++){
                if(i == 0 || j == 0)
                    results[i][j] = 0;
                else if(a[i-1] == b[j-1])
                    results[i][j] = results[i-1][j-1] + 1;
                else
                    results[i][j] = Math.max(results[i-1][j], results[i][j-1]);
            }
        }
        return results[a.length][b.length];
    }
    
    public static void main(String[] args)
    {
        String a = "AGGTAB";
        String b = "GXTXAYB";
        Longest_Common_Subsequence l = new Longest_Common_Subsequence();
        System.out.println(l.function(a.toCharArray(), b.toCharArray()));
    }
    
}
