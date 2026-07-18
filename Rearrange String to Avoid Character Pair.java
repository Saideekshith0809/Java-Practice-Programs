class Solution {
    public String rearrangeString(String s, char x, char y) {
        char[] ans = new char[s.length()];
        int k = 0;

        // Characters other than x and y
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != x && ch != y) {
                ans[k++] = ch;
            }
        }

        // All y's
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == y) {
                ans[k++] = y;
            }
        }

        // All x's
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == x) {
                ans[k++] = x;
            }
        }

        return new String(ans);
    }
}
