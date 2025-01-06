class Solution {
    public int bitwiseComplement(int n) {
        String bin = Integer.toBinaryString(n);
        String comp = complement(bin);
        int ans = Integer.parseInt(comp , 2);
        return ans;
        
    }

    private String complement(String s){
        String res = "";
        for(int i = 0 ; i< s.length() ; i++){
            if(s.charAt(i) == '1'){
                res+='0';
            }
            else{
                res+='1';
            }
        }
        return res;
    }
}
