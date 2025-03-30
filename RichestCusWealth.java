public class RichestCusWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                { 1, 2, 3 }, { 3, 2, 1 },{4,5}
        };
        System.out.println(maxWealth(accounts));
    }

    static int maxWealth(int[][] accounts) {
        int maxValue = 0;
        for (int i = 0; i < accounts.length; i++) {
            int temp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp = temp + accounts[i][j];
            }
            maxValue = Math.max(temp, maxValue);
        }
        return maxValue;

    }
}
