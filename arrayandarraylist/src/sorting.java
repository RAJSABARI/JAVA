import java.util.Arrays;
import java.util.*;
//Sorting the array 
public class sorting {
    public static void main(String[] args) {
        //int arr[] = {11, 22, 55, 66, 44};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 55) {
//                System.out.println(i);
//            }
//        }
        //System.out.println(Arrays.toString(arr));
        Scanner in = new Scanner(System.in);
        int input=in.nextInt();
        int size[]= new int[input];
        for(int i=0;i<size.length;i++){
            size[i]=in.nextInt();
        }
        for(int i=0;i<size.length;i++){
            System.out.println(size[i]);
        }
        Arrays.sort(size);
        System.out.println(Arrays.toString(size));

    }
}
