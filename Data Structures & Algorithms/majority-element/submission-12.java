class Solution {
    public int majorityElement(int[] nums) {
        int maxcount=0;
        int majorityelement=nums[0];
        for ( int i=0; i< nums.length; i++){
            int count =1;
            for (int j =i+1;j<nums.length;j++){
                if (nums[i]==nums[j]){
                    count=count+1;
                }
            }
            if (count>maxcount){
                maxcount=count;
                majorityelement=nums[i];
            }
            
        }
        return majorityelement;
    }
}