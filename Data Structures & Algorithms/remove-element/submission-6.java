class Solution {
    public int removeElement(int[] nums, int val) {
        int crush=0;
        for ( int ex=0; ex<nums.length;ex++){
            if(nums[ex]!=val){
                nums[crush]=nums[ex];
                crush++;
            }
        }
        return crush ;
    }
}