class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
          int longest = Integer.MIN_VALUE;
        for(int i =0 ; i<nums.length; i++){
            set.add(nums[i]);
        }
        for(int j=0; j<nums.length;j++){
             if(!set.contains(nums[j]-1)){
               int  length=1;
               while(set.contains(nums[j]+length)){
              
                length++;
               }
                longest=Math.max(length,longest);
               


             }
        }
        return longest;
        
        
    }
}
