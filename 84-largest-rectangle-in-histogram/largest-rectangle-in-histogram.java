class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int maxArea = 0;
        int rightsmaller [] = new int [heights.length];
        int leftsmaller [] = new int [heights.length];
        // right smaller
        for(int i=heights.length-1; i>=0; i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                rightsmaller[i] = heights.length;
            }else{
                rightsmaller[i] = s.peek();
            }
            s.push(i);
        }
        //left smaller 
        s = new Stack<>();
        for(int i=0; i<heights.length; i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                leftsmaller[i] = -1;
            }else{
                leftsmaller[i] = s.peek();
            }
            s.push(i);
        }

        for(int i=0; i<heights.length; i++){
            int height = heights[i];
            int width = rightsmaller[i]-leftsmaller[i]-1;
            int currArea = height*width;
            maxArea = Math.max(currArea,maxArea);
        }
        return maxArea;
    }
}