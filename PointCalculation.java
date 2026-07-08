import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int a[]=  new int[2];
	    Scanner s = new Scanner(System.in);
	    for(int i=0;i<2;i++){
	        a[i]=s.nextInt();
	    }
	   int A=a[0]*3;
	    int B=a[1]*1;
	    
	    int total=A+B;
	    System.out.println(total);
	}
}
