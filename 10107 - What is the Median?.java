import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
		long [] arr=new long[10000];
		int size=0;
		Arrays.fill(arr, Long.MAX_VALUE);
		while(input.hasNextInt()){
		   arr[size++]=input.nextLong();
		   Arrays.sort(arr);
		   if(size==1)
		     System.out.println(arr[0]);
		  else{
		   if(size%2==0){
		           int middle = size/2;
		           long ans = (arr[middle]+arr[middle-1])/2;
		           System.out.println(ans);
		       } 
		   
		   if(size%2!=0){
		       int middle1 = size/2;
		       long ans1 = arr[middle1];
		       System.out.println(ans1);
               }
		   }
		}
	}
}
