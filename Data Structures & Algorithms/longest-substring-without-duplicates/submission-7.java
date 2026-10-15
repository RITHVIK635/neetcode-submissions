class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0){
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        int maxlength=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            char currchar=s.charAt(right);
            while(set.contains(currchar)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(currchar);
            maxlength=Math.max(maxlength,right-left+1);
            
        }
        return maxlength;
    }
}
