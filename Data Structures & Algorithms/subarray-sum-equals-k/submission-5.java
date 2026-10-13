class Solution {
    public int subarraySum(int[] nums, int k) {
        int res=0;
        int sum=0;
        Map<Integer,Integer> prefixsum = new HashMap<>();
        prefixsum.put(0,1);
        for(int num:nums){
            sum = sum +num;
            int diff = sum -k;
            res=res+prefixsum.getOrDefault(diff,0);
            prefixsum.put(sum,prefixsum.getOrDefault(sum,0)+1);
        }
        return res;
    }
}