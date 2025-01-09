import java.util.*;
class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> circle = new ArrayList<>();
        for (int i = 1; i <= n; ++i) {
            circle.add(i);
        }
        int curr_idx = 0;
        while(circle.size() > 1){
            // if size is greator than 1 it rotates
            int nxt_idx = (curr_idx + k - 1) % circle.size();
            circle.remove(nxt_idx);
            curr_idx = nxt_idx;
        }

        return circle.get(0);
    }
}