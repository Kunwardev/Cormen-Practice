/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chapter_7;

/**
 *
 * @author Kunwar
 */
public class Stooge_Sort
{
    private void STOOGE_SORT(int[] A, int i, int j){
        if(A[i] > A[j]){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
        
        if(i+1 >= j)
            return;
        int k = (j-i+1)/3;
        STOOGE_SORT(A, i, j-k);
        STOOGE_SORT(A, i+k, j);
        STOOGE_SORT(A, i, j-k);
    }
    
    public static void main(String[] args)
    {
        Stooge_Sort s = new Stooge_Sort();
        int[] A = new int[]{3,2,4,1,5,6};
        s.STOOGE_SORT(A, 0, A.length-1);
        for(int k: A){
            System.out.print(k+" ");
        }
    }
    
}
