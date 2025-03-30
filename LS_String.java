public class LS_String {
    public static void main(String[] args) {
        String str = "DeepakChandraMaurya";
        char target = 'a';
        System.out.println(searchStr(str, target, 'e', 'r'));
    }

    static boolean searchStr(String str, char target, char end, char start) {
        if (str.length() == 0) {
            return false;
        }
        ;

        // for(int i=0; i< str.length(); i++){
        // if(target == str.charAt(i)){
        // return true;
        // }

        // }

        // for(char ch : str.toCharArray() ){
        // if(target == ch){
        // return true;
        // }
        // }
        return false;
    }
}
