import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int m,n,i,j;
        Scanner sc= new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        int [][]a= new int[m][n];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                a[i][j]+=sc.nextInt();
            }
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        

    }
}
