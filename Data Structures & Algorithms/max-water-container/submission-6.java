class Solution {
    public int maxArea(int[] heights) {
        int res=0;
        int left =0;
        int right=heights.length-1;
        while(left<right){
            int width=right-left;
            int currentHeight=Math.min(heights[left],heights[right]);
            res = Math.max(res,currentHeight*width);
            if (heights[left]<heights[right]){
                left++;
            } else {
                right--;
            }

        }
        return res;
    }
}
