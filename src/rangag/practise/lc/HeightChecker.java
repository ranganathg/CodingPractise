package rangag.practise.lc;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int length = heights.length;
        int[] sortedHeights = Arrays.copyOf(heights, length);
        Arrays.sort(sortedHeights);
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (sortedHeights[i] != heights[i])
                count++;
        }
        return count;
    }
}
