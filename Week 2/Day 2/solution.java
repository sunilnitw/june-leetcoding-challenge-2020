class Solution {
    public boolean isSubsequence(String s, String t) {
        char sArray[] = s.toCharArray(), tArray[] = t.toCharArray();
        int sL = s.length(), tL = t.length(), i = 0, j = 0;
        for (; i < sL && j < tL; i++) {
            while (j < tL && sArray[i] != tArray[j++]);
            if (j == tL && sArray[i] != tArray[j - 1]) {
                break;
            }
        }
        return (i == sL) ? true : false;
    }
}