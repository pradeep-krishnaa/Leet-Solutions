class Solution {
    
    private static boolean checkpalin(String s){
        int left = 0;
        int right = s.length() - 1;
        while(right>left){
            if(s.charAt(left) != s.charAt(right)){
                return false;
                
            }
            left++;
            right--;
        }
        return true;
        
    }
        
        
        
        
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                sb.append(ch);
            }
        }
        String res = sb.toString();
        res = res.toLowerCase();
        if(checkpalin(res)){
            return true;
        }
        else{
            return false;
        }
        
        
    }
}
