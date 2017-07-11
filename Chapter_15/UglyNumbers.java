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
public class UglyNumbers
{
    int[] results;
    private int function(int n){
        results = new int[n];
        int i2 = 0, i3 = 0, i5 = 0;
        results[0] = 1;
        int next_multiple_of_2 = results[0] * 2;
        int next_multiple_of_3 = results[0] * 3;
        int next_multiple_of_5 = results[0] * 5;
        
        for(int i=1;i<n;i++){
            int next_ugly = Math.min(Math.min(next_multiple_of_2, next_multiple_of_3),next_multiple_of_5);
            results[i] = next_ugly;
            if(next_ugly == next_multiple_of_2){
                i2++;
                next_multiple_of_2 = results[i2] * 2;
            }
            if(next_ugly == next_multiple_of_3){
                i3++;
                next_multiple_of_3 = results[i3] * 3;
            }
            if(next_ugly == next_multiple_of_5){
                i5++;
                next_multiple_of_5 = results[i5] * 5;
            }
            //System.out.println(results[i]);
        }
        return results[n-1];
    }
    
    public static void main(String[] args)
    {
        UglyNumbers u = new UglyNumbers();
        System.out.println(u.function(150));
    }
    
}
