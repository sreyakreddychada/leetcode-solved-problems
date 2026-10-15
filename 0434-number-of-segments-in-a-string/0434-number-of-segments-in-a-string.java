
class Solution {
    public int countSegments(String s) {
        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!Character.isWhitespace(ch) &&
                (i == 0 || Character.isWhitespace(s.charAt(i - 1)))) {
                c++;
            }
        }

        return c;
    }
}
