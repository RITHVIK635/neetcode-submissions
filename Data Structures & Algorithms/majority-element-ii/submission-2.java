class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i =0 ; i<nums.length; i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        } 
        for ( int j =0;j<nums.length;j++){
            int count = hm.getOrDefault(nums[j],0);
            if (count > (nums.length)/3){

            if(!ans.contains(nums[j]))
            
                ans.add(nums[j]);
            }
        }
        return ans;
        
    }
}