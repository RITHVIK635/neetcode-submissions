class Solution {
    public int numRescueBoats(int[] people, int limit) {
        // each boat weigth limit
        // each boat two persons atmost
        // weight of any person should be less than limit
        // 2,5,6,4,3 --> limit 6  --> 2,3,3,5,6
        Arrays.sort(people);
        int i =0;
        int j= people.length-1;
        int count =0;
        while(i<=j){
        if (people[i]+people[j]>limit){
            j=j-1;
        }else {
            i++;
            j--;
        

        }
        count = count + 1 ;
        }
        return count ;
    }
}