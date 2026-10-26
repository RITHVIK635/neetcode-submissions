class Solution {
    public int findDuplicate(int[] nums) {
        int low =1;  // we are assuming numbers from 1 to n 
        int high = nums.length-1;  // because length is n+1;
        int ans =0;  // intialising our final answer
        while(low<=high){
            int mid = low +(high-low)/2;
            int count =0;
            for(int i =0; i<nums.length;i++){
                if(nums[i]<=mid){ 
                    count=count+1;
                }
            }
            if(count<=mid){ // here you may think count must be equal to mid no 
            // because if count is less than mid means so larger number is repeating
            // in the place of it so low = mid +1 and if count equal to mid then
            // all are perfectly synced we have to check greater side of mid 
                low=mid+1;
            } else {
                ans =mid;
                high=mid-1;
            }
        }
        return ans;
        
    }
}
