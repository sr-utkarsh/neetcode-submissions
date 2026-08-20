class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int i = 0;
        int j = n-1;
        int maxarea = 0;
        while(i<j){
            int min = Math.min(heights[i],heights[j]);
            maxarea=Math.max(maxarea,min*(j-i));
            if(min==heights[i]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxarea;
    }
}
