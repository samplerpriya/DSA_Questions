import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class _Q34_ArrayList_Question {

    //REVERSE
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
////        reverse print---> O(n)
//        for(int i = list.size()-1;i>=0;i--){
//            System.out.println(list.get(i));
//        }
//        System.out.println();
//    }



    // MAXIMUM ARRAY IN ARRAYLIST
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(5);
//        list.add(9);
//        list.add(6);
//        list.add(8);
//
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < list.size(); i++) {
////            if(max < list.get(i)){
////                max = list.get(i);
////            }
//        max = Math.max(max, list.get(i));
//
//        }
//        System.out.println("max"+max);
//    }



    //SWAP TWO NUMBER

//    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
//        int temp = list.get(idx1);
//        list.set(idx1, list.get(idx2));
//
//        list.set(idx2, temp);
//    }
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(5);
//        list.add(9);
//        list.add(6);
//        list.add(8);
//
//        int idx1 = 1, idx2 = 3;
//        System.out.println(list);
//        swap(list, idx1, idx2);
//        System.out.println(list);
//    }





//    sorting an array
public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(5);
    list.add(9);
    list.add(6);
    list.add(8);

    System.out.println(list);
    Collections.sort(list);// ascending
    System.out.println(list);

//    descending
    Collections.sort(list, Collections.reverseOrder());
    System.out.println(list);
}

}
