class Solution {
    public void rotate(int[] nums, int k) {
         int n = nums.length;
         int j=0;
         while (j<k) {
            int temp = nums[n-1];
            
                for (int i = nums.length-1 ; i>0 ;i--){
                    
            nums[i]=nums[i-1];
            }
            nums[0]=temp;
        
        j=j+1;
        
    }
         }
    }
