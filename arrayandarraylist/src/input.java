import java.util.*;

public class input {
    public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
 //        int input = in.nextInt();
//        int size[]= new int[input];
//        for(int i =0;i<size.length;i++){
//            size[i]=in.nextInt();
//        }
//        for(int i =0;i<size.length;i++){
//            System.out.println(size[i]);
//        }



        // to store a string in a Array
        Scanner input = new Scanner (System.in);
        int name= input.nextInt();
        String[] str= new String[name];
        for(int i =0; i<str.length;i++){
            str[i]= input.next();
        }
        System.out.println(Arrays.toString(str));



    }
}
