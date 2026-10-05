class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int [] result = new int [2];
        for (int i=0; i<nums.length;i++){
        int difference = target-nums[i];
          if(hm.containsKey(difference)){
            result[1]=i;
            result[0]=hm.get(difference);
          }
          else{
            hm.put(nums[i],i);
          }
        }
        return result;
    }
}
