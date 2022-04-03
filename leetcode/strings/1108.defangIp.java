class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for(char ch : address.toCharArray()){
            if(ch == '.')
                sb.append("[.]");
            else
                sb.append(ch);
        }
        return new String(sb);
    }
}

class Solution2 {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}


/**
   replace methode:
   
   Stringname.replace('old char','new char');

   or for more than one replacement
   
   Stringname.replace('old char1','new char1').replace('old char2','new
   char2').........................replace('old charn','new charn');
   
   
 */

 class Solution3 {
    public String defangIPaddr(String address) {
        StringBuilder b = new StringBuilder(address.length() + 6);
        for (char c : address.toCharArray()) {
            b.append(c == '.' ? "[.]" : c);
        }
        return b.toString();
    }
}