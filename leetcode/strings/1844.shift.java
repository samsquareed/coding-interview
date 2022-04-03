class Solution {
    public String replaceDigits(String s) {
        char[] ch = s.toCharArray();

        for (int i = 1; i < ch.length; i++) {
            if (ch[i] >= '0' && ch[i] <= '9') {
                // ch[i] = (char) (ch[i - 1] + ch[i]); this was wrong as error was : incompatible types: char cannot be converted to String
                int in = Integer.parseInt(ch[i] + "");
                ch[i] = (char) (ch[i - 1] + in);
            }

        }
        return new String(ch);
    }
}