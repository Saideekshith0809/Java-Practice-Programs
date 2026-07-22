import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0){
	        int [] a= new int[5];
	        for(int i=0;i<5;i++){
	            a[i]=sc.nextInt();
	        }
	        int count1=0;
	        int count2=0;
	        for (int i = 0; i < 5; i++) {
	            if (a[i] >= 60){
	                count1++;
	            }
	            if (a[i] >= 30){
	                count2++;
	            }
	            
	        }
	        if(count1>=2 && count2>=4){
	            System.out.println("Pass");
	        }
	        else{
	            System.out.println("Fail");
	        }
	    }

	}
}

