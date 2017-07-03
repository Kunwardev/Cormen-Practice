/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chapter_2;

/**
 *
 * @author Kunwar
 */
public class Selection_Sort
{
    private void sort(int[] A){
        for(int i=0;i<A.length;i++){
            int min = Integer.MAX_VALUE;
            int index = i;
            for(int j=i;j<A.length;j++){
                if(A[j] < min){
                    min = A[j];
                    index = j;
                }
            }
            if(index != i){
                int temp = A[index];
                A[index] = A[i];
                A[i] = temp;
            }
        }
    }
    
    public static void main(String[] args)
    {
        Selection_Sort s = new Selection_Sort();
        int[] A = new int[]{5,3,4,2,1,6};
        s.sort(A);
        for(int j: A)
            System.out.print(j+" ");
    }
    
}
