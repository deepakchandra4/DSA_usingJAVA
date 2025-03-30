import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        // input
        // for (int i = 0; i < 5; i++) {
        //     list.add(in.nextInt());
        // }

        // for(int i=0; i<= list.size(); i++){
        //     System.out.print(list.get(i));
        // }
        // System.out.print(list);

        //input of 2D array.
        for(int i=0; i<3; i++){
            list2.add(new ArrayList<>());
        }
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                list2.get(i).add(in.nextInt());
            }
        }
        System.out.print(list2);

        // System.out.println(list);
        // System.out.println(list.contains(23));
        // System.out.print(list.set(0, 343));
        // System.out.println(list.remove(4));
    }
}
