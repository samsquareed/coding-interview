class Solution {
    public String toLowerCase(String s) {
        char[] chArray = s.toCharArray();
        
        for(int i=0;i<chArray.length;i++){
            if(chArray[i]>='A' && chArray[i] <= 'Z')
                chArray[i] = (char)(chArray[i]+32);
        }
        // return new String(chArray);
        return String.valueOf(chArray);
    }
}

// or

class Solution1 {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
}