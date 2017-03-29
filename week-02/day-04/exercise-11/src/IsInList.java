import java.util.*;

public class IsInList {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(2,4,6,8,10,12,14,16));
    ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(4,8,12,16));

    if (arrayList.containsAll(list2)) {
      System.out.println("true");
    }
    else {
      System.out.println("false");
    }

//    int[] index = {list2.indexOf(4),list2.indexOf(8), list2.indexOf(12), list2.indexOf(16)};
//
//    if (arrayList.contains(index)) {
//      System.out.println("true");
//    }
//    else {
//      System.out.println("false");
//
//    }
  }
}