import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 6, 2, 9, 8 };
        int ans = linearSearchMethod(arr, 6);
        System.out.println(ans);

    }

    static int linearSearchMethod(int[] arr, int item) {
        if (arr.length == 0) {
            return -1;
        };
        for (int i = 0; i <= arr.length - 1; i++) {
            int element = arr[i];
            if (element == item) {
                return i;
            }
        }
        return -1;
    };
}
