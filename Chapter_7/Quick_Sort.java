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
public class Quick_Sort
{
    private void quickSort(int[] a, int start, int end){
        if(start < end){
            int partition = Partition(a, start, end);
            quickSort(a, start, partition - 1);
            quickSort(a, partition + 1, end);
        }
    }

    private int Partition(int[] a, int start, int end)
    {
        int x = a[end];
        int i = start - 1;
        for(int j=start; j<end;j++){
            if(a[j] <= x){
                i++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        int temp = a[i+1];
        a[i+1] = a[end];
        a[end] = temp;
        return i+1;
    }
    
    public static void main(String[] args)
    {
        int[] a = new int[] {4,5,3,2,6,1};
        Quick_Sort q = new Quick_Sort();
        q.quickSort(a, 0, a.length-1);
        for(int j: a){
            System.out.print(j+" ");
        }
    }
    
}
