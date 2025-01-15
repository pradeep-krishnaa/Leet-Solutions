import java.util.HashMap;
import java.util.Map.Entry;

class Solution {
    public String reformatDate(String date) {
        String year = date.substring(date.length()-4);
        String res = year + "-";
        HashMap<String , String > map = new HashMap<>();
        map.put("Jan" , "01");
        map.put("Feb" , "02");
        map.put("Mar" , "03");
        map.put("Apr" , "04");
        map.put("May" , "05");
        map.put("Jun" , "06");
        map.put("Jul" , "07");
        map.put("Aug" , "08");
        map.put("Sep" , "09");
        map.put("Oct" , "10");
        map.put("Nov" , "11");
        map.put("Dec" , "12");

        String month = date.substring(date.length()-8 , date.length()-5);
        // System.out.println(month);

        for(Entry<String, String> entry : map.entrySet()){
            if (entry.getKey().equals(month)) {

                
                res+=entry.getValue()+"-";
            }
        }

        String word[] = date.split(" ");
        String dayth = word[0];
        String day = dayth.substring(0,dayth.length()-2);
        if(day.length()==1){
            res+="0" + day;
        }
        else{
            res+=day;
        }
        return res;
    }
}
