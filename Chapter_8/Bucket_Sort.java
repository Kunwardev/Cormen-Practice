/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chapter_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ArrayList;
/**
 *
 * @author Kunwar
 */
public class Bucket_Sort
{
    private void bucketSort(float[] A){
        ArrayList[] l = new ArrayList[10];
        for(int i=0;i<10;i++)
            l[i] = new ArrayList<Float>();
        int length = A.length;
        for(int i=0;i<length;i++){
                int index = (int) (10 * A[i]);
                l[index].add(A[i]);
        }
        int index = 0;
        for(int i=0;i<10;i++){
            Collections.sort(l[i]);
            if(l[i].size() > 0){
                for(int p=0;p<l[i].size();p++){
                    A[index++] = Float.parseFloat(l[i].get(p).toString());
                }
            }
        }
    }
    
    public static void main(String[] args)
    {
        Bucket_Sort b = new Bucket_Sort();
        float[] A = new float[]{0.17f,0.29f,0.69f,0.35f,0.12f};
        b.bucketSort(A);
        for(float i:A){
            System.out.print(i+" ");
        }
    }
    
}
