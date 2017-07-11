/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chapter_15;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class Longest_Increasing_Subsequence
{
    private int[] results;
    private int function(int[] arr){
        results = new int[arr.length];
        Arrays.fill(results, 1);
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i] > arr[j] && results[i] < results[j] + 1){
                    results[i] = results[j] + 1;
                }
            }
        }
        int max = -1;
        for(int i=0;i<arr.length;i++){
            if(results[i] > max){
                max = results[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{10, 22, 9, 33, 21, 50, 41, 60};
        Longest_Increasing_Subsequence l = new Longest_Increasing_Subsequence();
        System.out.println(l.function(arr));
    }
    
}
