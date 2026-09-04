class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null|| s.length()==0){
            return 0;    // base case as usual
        }
        HashSet<Character> set = new HashSet<>(); // why set no duplicates storing
        int maxlength=0;  // length of sliding window 
        int left =0;  // starting from zero
        for(int right=0;right<s.length();right++){
            char currentchar=s.charAt(right);  // right moves forward by check if char exist or not in hashset
            while(set.contains(currentchar)){
                set.remove(s.charAt(left)); //why remove directly left++ but again if element repeats third time 
                left++;  // because window size
                }
                set.add(currentchar) ;// addition 
                maxlength=Math.max(maxlength,right-left+1); // updating for every step
            
        }
        return maxlength;
        
        
    }
}
