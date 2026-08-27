class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for( int i =0 ; i<asteroids.length; i++)
        if (stack.isEmpty() || asteroids[i]>0){
            stack.push(asteroids[i]);
        } else {
            while(!stack.isEmpty()){
            int top = stack.peek();
            if (top<0){
                stack.push(asteroids[i]);
                break;
            } if (top==Math.abs(asteroids[i])){
                 stack.pop();
                 break;
            } else if (top>Math.abs(asteroids[i])){
                break;
            } else {
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(asteroids[i]);
                    break;
                }
            }
        }
        
    }

int n = stack.size();
int [] array = new int [n];
for(int i =n-1 ; i>=0;i--){
    array[i]=stack.pop();
}
return array;
}
}