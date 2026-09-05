class Solution {
    public int longestConsecutive(int[] nums) {
        int n= nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
    int maxlength=0;
        for(Integer element:set){
            int prev = element-1;
            if(!set.contains(prev)){
                int len =1;
                int next=element+1;
                while(set.contains(next)){
                    len=len+1;
                    next=next+1;
                }
                maxlength=Math.max(maxlength,len);
            }
        }
        return maxlength;
        
    }
}
