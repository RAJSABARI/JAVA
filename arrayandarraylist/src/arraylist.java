import java.sql.Array;
import java.util.ArrayList;
import java.util.*;

public class arraylist {
    public static void main(String[] args) {
       //syntax
        ArrayList<Integer> list=new ArrayList<>();
        Scanner in= new Scanner(System.in);
        for(int i =0;i<5;i++){
         list.add(in.nextInt());
        }
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.set(5,99);
        System.out.println(list);

    }
}
