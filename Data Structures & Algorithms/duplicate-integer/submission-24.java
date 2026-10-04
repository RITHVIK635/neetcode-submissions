class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i =0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for (int j =0;j<nums.length;j++){
            if (hm.get(nums[j])>1){
                return true;
            }
        }
        return false;
        
    }
}