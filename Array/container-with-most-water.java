class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int m=0;
        int r = height.length-1;
        while(l<r){
            int l1=height[l];
            int r1=height[r];
            int c=Math.min(l1,r1);
            m= Math.max(m,c*(r-l));
            if(l1<r1) l++;
            else r--;
        }
        return m;
    }
}