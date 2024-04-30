
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){

        int size = nums.size();

        int secondMax = 0;
        int max = 0;
       

        for (int i = 0; i < size ; i ++) {

            for(int j = i + 1; j < size; j ++){

                int add = nums.get(i) + nums.get(j);

                if (add > secondMax) {

                    secondMax = add;
                }
            }

        }
       int totalSum = max + secondMax;

        return totalSum;
    }
}