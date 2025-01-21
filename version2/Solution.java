class Solution {
    public String makeSmallestPalindrome(String s) {
        int length = s.length();
        int lastIndex = length - 1;
        char[] res = s.toCharArray();

        for (int i = 0; i <= lastIndex / 2; i++) {
            int rightIndex = lastIndex - i;
            if (res[i] != res[rightIndex]) {
                char smallerChar = (char) Math.min(res[i], res[rightIndex]);
                res[i] = smallerChar;
                res[rightIndex] = smallerChar;
            }
        }

        return new String(res);
    }
}

