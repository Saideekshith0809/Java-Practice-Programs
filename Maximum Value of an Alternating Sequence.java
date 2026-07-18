class Solution {
    public long maxValue(int n, int s, int m) {

        long[] mavlorenti = {n, s, m};

        long ans = s;

        long peaks1 = (n - 1) / 2;
        ans = Math.max(ans, s + peaks1 * (m - 1L));

        if (n >= 2) {
            long peaks2 = n / 2;
            ans = Math.max(ans, s + peaks2 * (m - 1L) + 1);
        }

        return ans;
    }
}
