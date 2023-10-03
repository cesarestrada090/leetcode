package easy;

import java.util.Arrays;

public class ProductItselft {
    /**
     * Given an integer array nums, return an array answer such that answer[i]
     * is equal to the product of all the elements of nums except nums[i].
     *
     * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
     *
     * You must write an algorithm that runs in O(n) time and without using the division operation.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [1,2,3,4]
     * Output: [24,12,8,6]
     * Example 2:
     *
     * Input: nums = [-1,1,0,-3,3]
     * Output: [0,0,9,0,0]
     *
     * @param args
     */
    public static void main(String[] args) {
        int sourceArray[] = new int[]{1,2,3,4};
        int prefixArray[] = new int[4];
        int postFixArray[] = new int[4];
        int prefix = 1;
        int postFix = 1;
        for(int i = 0; i < sourceArray.length; i++){
            prefixArray[i] = prefix;
            prefix = prefix * sourceArray[i];
        }

        for(int i = sourceArray.length -1; i >= 0; i--){
            postFixArray[i] = postFix;
            postFix = postFix * sourceArray[i];
        }

        System.out.println(Arrays.toString(prefixArray));
        System.out.println(Arrays.toString(postFixArray));
        for(int i = 0; i < sourceArray.length; i++){
            sourceArray[i] = prefixArray[i]*postFixArray[i];
        }
    }
}
