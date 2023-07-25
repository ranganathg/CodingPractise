package rangag.practise.lc;

public class DuplicateZeroes {
    public void duplicateZeros(int[] arr) {
        int length = arr.length - 1;
        int j = arr.length - 1;
        for (int k = 0; k <= j; k++) {
            if (arr[k] == 0) {
                if (k == j) {
                    arr[length] = 0;
                    length--;
                }
                j--;
            }
        }
        for (int i = j; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[length] = 0;
                length--;
                arr[length] = 0;
            } else {
                arr[length] = arr[i];
            }
            length--;
        }
    }
}
