class Solution {
    public String makeSmallestPalindrome(String s) {
        int length = s.length();
        int n = length / 2;
        int lastIndex = length - 1;
        char[] res = s.toCharArray();

        for(int i = 0; i < n; i++) {
            char currCharLeft = s.charAt(i);
            int j = lastIndex - i;
            char currCharRight = s.charAt(j);
            if(currCharLeft != currCharRight) {
                if(currCharLeft < currCharRight) {
                    currCharRight = currCharLeft;
                    res[i] = currCharLeft;
                    res[j] = currCharRight;
                } else {
                    currCharLeft = currCharRight;
                    res[i] = currCharLeft;
                    res[j] = currCharRight;
                }
            } else {
                res[i] = currCharLeft;
                res[j] = currCharRight;
            }
        }

        return String.valueOf(res);
    }
}
