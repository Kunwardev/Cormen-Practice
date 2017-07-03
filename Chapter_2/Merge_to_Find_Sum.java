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
public class Merge_to_Find_Sum
{
    private void merge(int[] A, int start, int end){
        if(start < end){
            int middle = start + (end - start)/2;
            merge(A, start, middle);
            merge(A, middle+1, end);
            merge_sort(A, start, middle, end);
        }
    }
    
    private boolean find_sum(int[] A, int sum){
        merge(A, 0, A.length-1);
        int i =0, j = A.length-1;
        while(i < j){
            if(A[i] + A[j] == sum){
                System.out.println(A[i]+" "+A[j]);
                return true;
            }
            else if(A[i] + A[j] < sum){
                i++;
            }else
                j++;
        }
        return false;
    }

    private void merge_sort(int[] A, int start, int middle, int end)
    {
        int n1 = middle - start + 1;
        int n2 = end - middle;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i=0;i<n1;i++){
            L[i] = A[start+i];
        }
        for(int j=0;j<n2;j++){
            R[j] = A[middle+j+1];
        }
        
        int i = 0, j = 0, k = start;
        while(i < n1 && j < n2){
            if(L[i] < R[j]){
                A[k++] = L[i++];
            }else{
                A[k++] = R[j++];
            }
        }
        
        while(i < n1){
            A[k++] = L[i++];
        }
        
        while(j < n2){
            A[k++] = R[j++];
        }
        
    }
    
    public static void main(String[] args)
    {
        int[] A = new int[]{4,3,5,2,1,6};
        Merge_to_Find_Sum m = new Merge_to_Find_Sum();
        m.find_sum(A, 7);
    }
    
}
