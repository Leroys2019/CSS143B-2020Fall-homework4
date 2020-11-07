package Problem1;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<List<Integer>> permute(int[] nums) {
        // homework
        List<List<Integer>> results = new ArrayList<>();
        findPer(nums, 0, results);
        return results;
    }
    public static void findPer(int[] nums, int position, List<List<Integer>> results) {
        if(position == nums.length -1){
            List<Integer> nPermute = new ArrayList<Integer>();
            for(int i =0; i<nums.length;i++){
                nPermute.add(nums[i]);
            }
        }
    }
}
