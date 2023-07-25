package rangag.practise.lc;

public class ValidMountainArray {
    public boolean validMountainArrayConcise(int[] arr) {
        int i = 0;
        int len = arr.length;
        if (len < 3) return false;
        while (i + 1 < len && arr[i] < arr[i + 1]) i++;
        if (i == 0 || i == len - 1) return false;
        while (i + 1 < len && arr[i] > arr[i + 1]) i++;
        return i == len - 1;
    }

    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        int i = 0;
        int j = 1;
        while (j < arr.length && arr[i] < arr[j]) {
            i++;
            j++;
        }
        if (i == 0 || j == arr.length) return false;
        while (j < arr.length && arr[i] > arr[j]) {
            i++;
            j++;
        }
        if (j != arr.length) return false;
        return true;
    }
}
