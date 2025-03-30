public class EvenNumInArr {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896, 454543, 343 };

        int ans = findNumbers(nums);
        System.out.println(ans);

    }

    static int findNumbers(int[] nums) {
        // int count = 0;
        // for(int num : nums){
        // if(even(num)){
        // count++;
        // }
        // }
        // return count;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (even(nums[i])) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {

        int numbersOfdigits = digits(num);
        if (numbersOfdigits % 2 == 0) {
            return true;
        }
        return false;
    }
    // optimized version

    static int digit2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        return (int) (Math.log10(num) + 1);
    }

    // iterating one
    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}