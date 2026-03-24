import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n,sum=0;

        int digits= (n==0)?1:(int)Math.log10(n)+1;

        while(n>0){
            int d=n%10;
            sum+=(int)Math.pow(d,digits);
            n/=10;
        }
        if(sum== temp)
        System.out.print("Yes");
        else
            System.out.print("No");
    }
    
}
