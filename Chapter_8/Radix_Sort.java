/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chapter_8;

/**
 *
 * @author Kunwar
 */
public class Radix_Sort
{
    private int[] stable_sort(int[] A, int exp){
        int length = A.length;
        int[] C = new int[10];
        int[] B = new int[length];
        for(int i=0;i<length;i++){
            C[(A[i]/exp)%10]++;
        }
        for(int i=1;i<10;i++)
            C[i] = C[i-1] + C[i];
        for(int i=length-1;i>=0;i--){
            B[C[(A[i]/exp)%10]-1] = A[i];
            --C[(A[i]/exp)%10];
        }
        return B;
    }
    
    private int getMax(int[] A){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            if(max < A[i]){
                max = A[i];
            }
        }
        return max;
    }
    
    private int[] Radix(int[] A){
        int max = getMax(A);
        for(int exp = 1; max/exp > 0; exp *= 10){
            A = stable_sort(A, exp);
            for(int p: A){
                System.out.print(p+" ");
            }System.out.println();
        }
        return A;
    }
    
    public static void main(String[] args)
    {
        int[] A = new int[]{10,2,74,66,24,36,150,90,1,88};
        Radix_Sort r = new Radix_Sort();
        A = r.Radix(A);
        
    }
    
}
