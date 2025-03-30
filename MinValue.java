public class MinValue {
    public static void main(String[] args) {
        int[] arr = { 23, 34, 43, 65, 21, 4 , 2 };
        int ans = minimumVal(arr);
        System.out.println(ans);
    }

    static int minimumVal(int[] arr) {
        int min = arr[0];
        // if (min == 0) {
        //     return -1;
        // }
        for(int i=1; i < arr.length; i++){
            if(arr[i] < min){
                min= arr[i];
            }
        }
        return min;
    }
}
