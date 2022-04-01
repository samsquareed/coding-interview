package leetcode.strings;

class Solution {
    public void reverseString(char[] s) {
        int i=0, j=s.length-1;
        
        while(i<j){
            char ch = s[i];
            s[i]=s[j];
            s[j] = ch;
            i++;
            j--;
        }
    }
}

//solved it as a part of "Daily LeetCoding Challenge April, Day 1":