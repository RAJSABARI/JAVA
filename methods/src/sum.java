import java.util.*;

public class sum {
    public static void main(String[] args) {

        System.out.println(sum());
    }
    static  int sum(){
        Scanner in = new Scanner (System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int sum=num1+num2;
        return sum;
    }
}

