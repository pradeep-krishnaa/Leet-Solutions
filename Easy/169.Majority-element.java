import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i] , 1);
            }
        }
        
        int majority = nums.length/2;
        for(HashMap.Entry<Integer , Integer> e : map.entrySet()){
            if(e.getValue() > majority){
                return e.getKey();
            }
        }
        return -1;
        
    }
}