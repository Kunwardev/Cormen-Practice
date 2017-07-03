/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chapter_6;

/**
 *
 * @author Kunwar
 */
public class Heap_sort
{
    private int parent(int i){
        return (i/2);
    }
    
    private int left(int i){
        return (2*i+1);
    }
    
    private int right(int i){
        return (2*i+2);
    }
    
    private void Max_Heapify(int[] A,int n, int i){
        int l = left(i);
        int r = right(i);
        int largest = i;
        
        if(l < n && A[l] > A[i])
            largest = l;
        
        if(r < n && A[r] > A[i])
            largest = r;
        
        if(largest != i){
            int temp = A[largest];
            A[largest] = A[i];
            A[i] = temp;
            Max_Heapify(A, n, largest);
        }
    }
    
    private void Build_Max_Heap(int[] A){
        int length = A.length;
        for(int i=length/2;i>=0;i--){
            Max_Heapify(A, A.length, i);
        }
    }
    
    private void Heap_Sort(int[] A){
        Build_Max_Heap(A);
        for(int i: A)
            System.out.print(i+" ");    
        System.out.println();
        int length = A.length;
        for(int i=length-1; i>=1; i--){
            {
                int temp = A[i];
                A[i] = A[0];
                A[0] = temp;
                Max_Heapify(A, i, 0);
            }
        }
    }
    
    public static void main(String[] args)
    {
        int[] A = new int[]{4,3,5,2,1,6};
        Heap_sort h = new Heap_sort();
        h.Heap_Sort(A);
        for(int k: A){
            System.out.print(k+" ");
        }
    }
    
}
