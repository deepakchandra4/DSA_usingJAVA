public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 12, 24, 56, 78 };
        int[] arr1 = { 43,42,41,39,38,37,36,35,35,34};
        int target = 35;
        System.out.println("Value find one Index Number : " + agnosticBS(arr1, target));
    }

    static int agnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc;
        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }

        while (start <= end) {
            // finding mid value.
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }

            // if sorted element is in Ascending order.
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
