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
public class MergeSort
{
    private void Merge(int[] A, int start, int mid, int end){
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        for(int i=0;i<n1;i++){
            L[i] = A[start + i ];
        }
        for(int i=0;i<n2;i++){
            R[i] = A[mid + i + 1];
        }
        int i = 0, j = 0, k =start;
        while(i < n1 && j < n2){
            if(L[i] < R[j]){
                A[k] = L[i];
                i++;
            }else{
                A[k] = R[j];
                j++;
            }
            k++ ;
        }
        
        while(i < n1){
            A[k] = L[i];
            k++;i++;
        }
        while(j < n2){
            A[k] = R[j];
            k++;j++;
        }
    }
    
    private void Merge_Sort(int[] A, int start, int end){
        if(start < end){
            int mid = (end + start)/2;
            Merge_Sort(A, start, mid);
            Merge_Sort(A, mid+1, end);
            Merge(A, start, mid, end);
        }
    }
    
    public static void main(String[] args)
    {
        int[] A = new int[] {3,2,5,4,6,1};
        for(int i: A)
            System.out.print(i+" ");
        System.out.println();
        MergeSort m = new MergeSort();
        m.Merge_Sort(A, 0, A.length-1);
        for(int k: A)
            System.out.print(k+" ");
    }
    
}
