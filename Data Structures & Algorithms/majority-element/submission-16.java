class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int res = 0;
        int maxcount =0;
        for (int i =0; i<nums.length;i++ ){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if(hm.get(nums[i])>maxcount){
                res=nums[i];
               maxcount = hm.get(nums[i]);
            }
        }
return res;
        
    }
}