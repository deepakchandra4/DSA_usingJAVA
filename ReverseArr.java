import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {1 ,3 , 5 , 7 , 9 , 20};
        reverseValue(arr, 0, 5);
        System.out.println(Arrays.toString(arr));

    }
    static void reverseValue(int[] arr , int start , int end){
        start = 0;
        end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
