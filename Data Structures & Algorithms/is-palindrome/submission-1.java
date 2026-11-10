class Solution {
    public boolean isPalindrome(String s) {
        char[] sChar = s.toCharArray();
        String x="";
        String modS = "";
        int n = sChar.length;
        for (int i = 0; i < n; i++) {
            if (Character.isLetterOrDigit(sChar[i])) {
                modS+=sChar[i];
            }
        }
        for (int i = n-1; i >= 0; i--) {
            if (Character.isLetterOrDigit(sChar[i])) {
                x+=sChar[i];
            }
        }
        return x.equalsIgnoreCase(modS);
    }
}
