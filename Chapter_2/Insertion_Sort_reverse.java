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
public class Insertion_Sort_reverse
{
    private void sort(int[] A){
        for(int j=1;j<A.length;j++){
            int key = A[j];
            int i = j-1;
            while(i >=0 && A[i] < key){
                A[i+1] = A[i];
                i--;
            }
            A[i+1] = key;
        }
    }
    
    public static void main(String[] args)
    {
        int[] A = new int[]{5,2,4,6,1,3};
        Insertion_Sort_reverse a = new Insertion_Sort_reverse();
        a.sort(A);
        for(int k: A)
            System.out.print(k+" ");
    }
    
}
