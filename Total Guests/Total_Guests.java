/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;


class Total_Guests {
	public static void main (String[] args) {
	    
	    int N, sum=0;
	    Scanner input = new Scanner(System.in);
        N = input.nextInt();
        
        int[] P = new int[N];
        for(int i =0;i<N;i++){
            P[i] = input.nextInt();
        }
        
        for(int i=0;i<N;i++){
            System.out.print(P[i] + " ");
        }   
         
         for(int i=0;i<N;i++){
             if(sum>=P[i]){
                sum +=1; 
             }
             
	}
	System.out.println(sum);
}
}