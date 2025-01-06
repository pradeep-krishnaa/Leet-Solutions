class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<=arr.length-2;i++){
            sb.append(reverseEach(arr[i]) + " ");
        }
        sb.append(reverseEach(arr[arr.length-1]));
        return sb.toString();
        
    }

    private String reverseEach(String word){
        String res = "";
        for(int i=word.length()-1 ; i>=0 ; i--){
            char ch=word.charAt(i);
            res+=ch;
        }
        return res;
    }
}