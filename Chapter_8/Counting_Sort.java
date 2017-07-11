/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chapter_8;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class Counting_Sort
{
    private int[] countingSort(int[] A, int k){
        int length = A.length;
        int[] C = new int[k];
        int[] B = new int[length];
        for(int i=0;i<length;i++){
            C[A[i]] = C[A[i]] + 1;
        }
        
        for(int i=1;i<k;i++){
            C[i] = C[i] + C[i-1];
        }
        
        for(int i=length-1;i>=0;i--){
            B[C[A[i]]-1] = A[i];
            --C[A[i]];
        }
        return B;
    }
    
    public static void main(String[] args)
    {
        Counting_Sort c = new Counting_Sort();
        int[] A = new int[]{1,4,3,5,2,4,3,2,1,2,4};
        int[] B = c.countingSort(A, 6);
        for(int k: B){
            System.out.print(k+" ");
        }
    }
    
}
