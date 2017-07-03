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
public class Priority_Queue
{
    private int heap_size;
    private int left(int i){
        return (2*i+1);
    }
    
    private int right(int i){
        return (2*i+2);
    }
    
    private void max_Heapify(int[] A, int n, int i){
        int largest = i;
        int l = left(i);
        int r = right(i);
        
        if(l < n && A[l] > A[i])
            largest = l;
        if(r < n && A[r] > A[i])
            largest = r;
        
        if(largest != i){
            int temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;
            max_Heapify(A, n, largest);
        }
    }
    
    private void priority_queue(int[] A){
        for(int i=A.length/2; i>=0 ;i--){
            max_Heapify(A, A.length, i);
        }
    }
    
    private int get_Maximum(int[] A){
        return A[0];
    }
    
    public static void main(String[] args)
    {
        int[] A = new int[]{4,3,8,2,5,6};
        Priority_Queue p = new Priority_Queue();
        p.heap_size = A.length;
        p.priority_queue(A);
        for(int i=0;i<p.heap_size;i++){
            System.out.print(A[i]+" ");
        }
    }
    
}
