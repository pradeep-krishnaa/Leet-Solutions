class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        ans[0]=0;
        for(int i = 0 ; i<n+1 ; i++){
            String binary = Integer.toBinaryString(i);
            int ones = countOnes(binary);
            ans[i] = ones;
        }
        return ans;
        
    }
    private static int countOnes(String bin){
        int count=0;
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i)=='1'){
                count++;
            }
        }
        return count;
        
    }
}
