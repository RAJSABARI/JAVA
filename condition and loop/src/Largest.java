import java.util.*;

public class Largest {
    public static void main(String[] args){
     Scanner input= new Scanner(System.in);
     int number1=input.nextInt();
     int number2=input.nextInt();
    int number3=input.nextInt();

    if(number1>number2){
        System.out.println(number1);
        }
    else if(number2>number3){
        System.out.println(number2);
    }
    else{
        System.out.println(number3);
    }
    }
}


