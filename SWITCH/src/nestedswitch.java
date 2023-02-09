import java.util.*;

public class nestedswitch {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int roll=in.nextInt();
        String department=in.nextLine().trim();
        switch (roll){
            case 1:{
                System.out.println("raghul"+roll);
                break;
            }
            case 2:{
                System.out.println("raj");
                switch (department){
                    case "IT":{
                        System.out.println("INFORMATION TECHNOLOGY");
                        break;
                    }
                    default:
                    {
                        System.out.println("please enter a valid value");
                    }
                }
            }
            default:
            {
                System.out.println("please enter valid value");
            }
        }
    }
}
