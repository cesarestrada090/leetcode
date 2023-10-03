package easy;

import java.util.Arrays;

public class MaximumProduct3Numbers {
    public static void main(String[] args) {
        int array [] = new int[]{-1,-2,-3,-4};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Math.max(array[0]*array[1]*array[2],array[array.length-1]*array[array.length-2]*array[array.length-3]));
    }
}
