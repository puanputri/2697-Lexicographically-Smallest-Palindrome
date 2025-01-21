class Solution3 {
    public String makeSmallestPalindrome(String s) {
        char[] res = s.toCharArray();
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            res[i] = res[n - 1 - i] = (char) Math.min(res[i], res[n - 1 - i]);
        }

        return new String(res);
    }
}

