import java.io.*;
import java.util.Scanner;
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    int cost;
	    
	    if(n >= 5){
	        cost = n * 85;
	    } else {
	        cost = n * 100;
	    }
	    
	    System.out.println(cost);
	}
}
