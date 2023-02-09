import java.util.*;

public class switchexample {
      /*
        Switch syntax
        switch(condition){
         case 1:
            statement;
            break;
          case 2:
             statement;
             break;
             .
             .
             deafault:
                  statement;
         */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the fav fruits name");
        String fruit = in.nextLine().trim();
        switch (fruit) {
            case "apple":
                System.out.println("keep away from the doctor");
                break;
            case "mango":
                System.out.println("season fruit");
                break;
            case "Orange":
                System.out.println("kids frav");
                break;
            default:
                System.out.println("Please Enter valid item");
        }


    }
}