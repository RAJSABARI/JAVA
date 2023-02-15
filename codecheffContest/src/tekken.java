//https://www.codechef.com/START77D/problems/TEKKEN
//code is done in codechef
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class takken
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int test=in.nextInt();
        for(int i=0;i<test;i++){
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            if(b>c){
                b=b-c;
                c=0;
                if(a>b){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                c=c-b;
                b=0;
                if(a>c){
                    System.out.println("YES");

                }
                else{
                    System.out.println("NO");
                }

            }


        }
    }
}