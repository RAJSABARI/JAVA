//https://www.codechef.com/START77D/problems/AIRLINES
//code is done in codechef

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class airlines
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int test=in.nextInt();
        for(int i =0;i<test;i++){
            int planes=in.nextInt();
            int pasanger=in.nextInt();
            int amount=in.nextInt();
            int temp=planes*10;
            if(pasanger<=temp){
                int output=pasanger*amount;
                System.out.println(output);
            }
            else{
                int a=planes*10;
                int out1=a*amount;
                System.out.println(out1);
            }
        }

    }
}