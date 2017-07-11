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
public class Fibonacci
{
    private int[] results;
    
    private int function(int n){
        results = new int[n+1];
        if(n < 2){
            return n;
        }else{
            results[0] = 0;
            results[1] = 1;
            for(int i=2;i<=n;i++){
                results[i] = results[i-1] + results[i-2];
            }
        }
        return results[n];
    }
    
    public static void main(String[] args)
    {
        int n = 6;
        Fibonacci f = new Fibonacci();
        System.out.println(f.function(n));
    }
    
}
