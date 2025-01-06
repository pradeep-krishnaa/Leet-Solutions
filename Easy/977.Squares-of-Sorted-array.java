class Solution {
    public int[] sortedSquares(int[] nums) {
        int res[] = new int[nums.length];
        int l = 0;
        int r = nums.length - 1;
        // int index = nums.length - 1;
        for(int i = nums.length-1 ; i >=0 ; i--){
            int lsq = nums[l] * nums[l];
            int rsq = nums[r] * nums[r];
            if(lsq < rsq){
                res[i]=rsq;
                r--;
                // index--;

            }
            else{
                res[i]=lsq;
                l++;
                // index--;
            }
        }
        return res;
        
    }
}