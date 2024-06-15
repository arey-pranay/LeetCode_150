class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> a[0]-b[0]);
        int count = 0;
        int sz = points.length;
        for(int i=0;i<sz-1;i++){
            int a = Math.max(points[i][0],points[i+1][0]);
            int b = Math.min(points[i][1],points[i+1][1]); 
            if(a<=b){
                count++;
                points[i+1][0] = a;
                points[i+1][1] = b;
            }
        }
        return sz - count;
    }
}
