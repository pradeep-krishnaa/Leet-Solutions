import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);

        }
        while(pq.size() > 1){
            int one = pq.poll();
            int two = pq.poll();
            if(one > two){
                pq.add(one-two);
            }

            
        }
        if(pq.size()==1){
            return pq.poll();
        }
        
        return 0;
        
    }
}
        
    
