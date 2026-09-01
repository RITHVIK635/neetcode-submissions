class Solution {
    public int findDuplicate(int[] nums) {
        int low =1;
        int high = nums.length-1;
        int ans =0;
        while(low<=high){
            int mid = low +(high-low)/2;
            int count =0;
            for(int i =0; i<nums.length;i++){
                if(nums[i]<=mid){
                    count=count+1;
                }
            }
            if(count<=mid){
                low=mid+1;
            } else {
                ans =mid;
                high=mid-1;
            }
        }
        return ans;
        
    }
}
