//https://www.codechef.com/START77D/problems/CONCATPAL
//code done in code chef using java
import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int test =in.nextInt();
        for(int i =0; i<test;i++){
            int jerry=in.nextInt();
            int tom=in.nextInt();
            if(jerry<tom){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}