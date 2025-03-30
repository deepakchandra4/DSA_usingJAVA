public class MaxArrValue {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 32, 42, 221, 232 };
        System.out.println(maxArray(arr));
        System.out.println(maxArrayRange(arr , 1 , 4));
    }

    static int maxArray(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    static int maxArrayRange(int[] arr , int start , int end) {
        int maxVal = arr[start];
        for (int i = 1; i < end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
