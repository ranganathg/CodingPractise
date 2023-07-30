package rangag.practise.lc;

public class ReplaceElementWithGreatonRight {
    public int[] replaceElements(int[] arr) {
        int currMax = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            int temp = currMax;
            if (arr[i] > currMax)
                currMax = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
