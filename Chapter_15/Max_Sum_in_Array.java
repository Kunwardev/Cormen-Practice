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
public class Max_Sum_in_Array
{
    private int maxSum(int[] arr){
        int max_ending = 0, max_so_far = 0;
        for(int i=0;i<arr.length;i++){
            max_ending += arr[i];
            if(max_ending > max_so_far)
                max_so_far = max_ending;
            if(max_ending < 0)
                max_ending = 0;
        }
        return max_so_far;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,-4,2,3,8,-12,6};
        Max_Sum_in_Array m = new Max_Sum_in_Array();
        System.out.println(m.maxSum(arr));
    }
    
}
