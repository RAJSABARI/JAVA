import java.util.ArrayList;

public class ame {
    public static void main(String[] args) {
        ArrayList <Integer> al = new ArrayList<>();
      int a[]= {1,2,3,4,1,3,4};
        for (int i = 0; i < a.length; i++) {
            al.add(a[i]);
        }

        System.out.println(al);
        System.out.println(al.lastIndexOf(1));
    }
}
