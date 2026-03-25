
public class Main {

    public static void main(String[] args) {
        int i,j,m,n;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        for(i=0;i<m;i++){
            sum=0;
        
        for(j=0;j<n;j++){
            sum+=sc.nextInt();
        }
        System.out.println(sum);
        }
    }
}
