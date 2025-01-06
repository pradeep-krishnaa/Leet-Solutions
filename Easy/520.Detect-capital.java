class Solution {
    public boolean detectCapitalUse(String word) {
        if(allCap(word) || allLower(word) || titlecase(word)){
            return true;
        }
        return false;

        
    }
    private boolean allCap(String word){
        int count = 0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch)){
                count++;
            }
        }
        if(count==word.length()){
            return true;
        }
        return false;
    }

    private boolean allLower(String word){
        int count = 0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isLowerCase(ch)){
                count++;
            }
        }
        if(count==word.length()){
            return true;
        }
        return false;
    }

    private boolean titlecase(String word){
        char ch = word.charAt(0);
        String sub = word.substring(1);
        if(Character.isUpperCase(ch) && allLower(sub)){
            return true;
        }
        return false;
    }
}

// method 2

class Solution2 {
    public boolean detectCapitalUse(String word) {
        if(allCap(word) || allLower(word) || titlecase(word)){
            return true;
        }
        return false;

        
    }
    private boolean allCap(String word){
        
        if(word.equals(word.toUpperCase())){
            return true;
        }
        return false;
    }

    private boolean allLower(String word){
        
        if(word.equals(word.toLowerCase())){
            return true;
        }
        return false;
    }

    private boolean titlecase(String word){
        char ch = word.charAt(0);
        String sub = word.substring(1);
        if(Character.isUpperCase(ch) && allLower(sub)){
            return true;
        }
        return false;
    }
}
