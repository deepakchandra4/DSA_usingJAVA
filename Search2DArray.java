public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr2D = {
                { 2, 3, 4, 7 },
                { 32, 43, 32 },
                { 232, 44, 33, 45 },
                { 232, 44, 33, 45, 33 },
        };
        int target = 33;
        int ans = searchArr(arr2D, target);
        System.out.println(ans);
    };

    static int searchArr(int[][] arr2D , int target){
        for(int i=0; i < arr2D.length ; i++){
            for(int j=0; j < (arr2D[i]).length; j++){
                if(target == arr2D[i][j]){
                    return i & j;
                }
            }
        }
        return -1;
    }
}
