import java.util.*;
public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(124);
        List newList = new ArrayList();
         newList.add(123);
         newList.add(12.3);
         newList.add("12.3");

          System.out.println(list);
          System.out.println(newList);
    }
}