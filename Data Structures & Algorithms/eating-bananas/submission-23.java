class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // piles.length should be less than or equal h 
        // if piles.length equals h then max of piles(i) is res
        // we can start from total bananas divide by h 
        int minspeed=1;
        int maxspeed=0;
        for (int pile:piles) {
            maxspeed=Math.max(maxspeed,pile);
        }
        while(minspeed<maxspeed){
        int mid = minspeed+(maxspeed-minspeed)/2;
        if(canEat(piles,h,mid)){
            maxspeed=mid;
        }else{
            minspeed=mid+1;
        }
        }

        
        
        
        
    
    return minspeed;
    }

    private boolean canEat(int[] piles,int h,int speed){
        int hours=0;
        for (int pile:piles)
            hours+=(int) Math.ceil((double) pile/speed);
            
        
     return hours<=h;
    }
}

