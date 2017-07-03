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
public class Adding_n_Bits
{
    private int[] sum(int[] A, int[] B){
        int carry = 0;
        int[] C = new int[A.length+1];
        for(int i=0;i<A.length;i++){
            carry = (A[i] + B[i])/ 2;
            C[i] = (A[i] + B[i]) % 2;
        }
        C[A.length] = carry;
        return C;
    }
    
    public static void main(String[] args)
    {
        Adding_n_Bits a = new Adding_n_Bits();
        int[] A = new int[]{0,1,0};
        int[] B = new int[]{1,0,1};
        int[] C = a.sum(A, B);
        for(int k: C)
            System.out.print(k+" ");
    }
    
}
