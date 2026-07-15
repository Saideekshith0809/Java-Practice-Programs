import java.util.*;

class Codechef {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            char[] s = sc.next().toCharArray();

            int i = 0;

            while (i < n && s[i] != 'z') {
                i++;
            }

            while (i < n && s[i] == 'z') {
                s[i] = 'a';
                i++;
            }

            System.out.println(s);
        }
    }
}
