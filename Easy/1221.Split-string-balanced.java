class Solution {
    public int balancedStringSplit(String s) {
        if(s==null || s.length() ==0){
            return 0;

        }
        int r=0 , l=0 , count=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='R'){
                r++;
            }
            else{
                l++;
            }
            if(l==r){
                count++;
            }
        }
        return count;
        
    }
}