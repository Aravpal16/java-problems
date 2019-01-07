

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	   Scanner ip=new Scanner(System.in);
	   int m, n;
	   double dp,l;
	   
	   int c= 0;
	   while(ip.hasNextInt())
	   {
	         m=ip.nextInt();
	         dp=ip.nextDouble();
	         l=ip.nextDouble();
	         n=ip.nextInt();
	        if (m < 0)
			break;
	        
	         int m1;
	         double r;
	         double dep[]=new double[101];
	         while(n-->0)
	         {
	             m1=ip.nextInt();
	             r=ip.nextDouble();
	             for(int i=m1;i<101;i++)
	                dep[i]=r;
	         }
	          c= 0;
		       double mp = l/m;
		       double cv = (l + dp) * (1 - dep[c]);
	              	double cl = l;
		       while (cv < cl) 
		       {
		             	
		             	c=c+1;
		             	
			          cl-= mp;
			         
			           cv = cv * (1-dep[c]);
			           
	         	}

		 System.out.print(c+" month");
		if (c!= 1)
			System.out.print("s");
			
				System.out.println();
	
	   }
	}
}

