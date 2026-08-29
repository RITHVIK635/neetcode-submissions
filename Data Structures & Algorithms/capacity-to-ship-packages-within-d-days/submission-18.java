class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int mincap=0;
        int maxcap=0;
        for (int i =0; i<weights.length;i++){
             mincap=Math.max(mincap,weights[i]);
             maxcap=maxcap+weights[i];
        }
        while(mincap<maxcap){
            int mid = mincap+(maxcap-mincap)/2;
            int days1 =1;
            int sum=0;
            for (int j=0;j<weights.length;j++){
                if(sum+weights[j]>mid){
                    days1=days1+1;
                    sum=0;
                }
                sum=sum+weights[j];
            }
            if(days1>days){
                mincap=mid+1;
            } else {
                maxcap=mid;
            }
        }
        return mincap;
    }
}