package DataStructures.mathematics;

import java.util.*;
//import java.lang.Math;

/*
class naiveapproachgcd  //complexity is min(a,b)
{
    int gcd1(int a, int b)
    {
        int res=Math.min(a, b);
        while(res>0)
        {
            if(a%res==0 && b%res==0)
            {   // iss condition pe gcd mil jaega
                break;
            }
            // agar nhi mila hai toh usse neeche wale try
            res--;
        }
        return res;
    }
}
*/
// this is euclidean algorithm
/* 
class betterapproachgcd
{
    int gcd2(int a,int b)
    {
        while(a!=b)
        {
            if(a>b)
            {
                a=a-b;
            }
            else{
                b=b-a;
            }
            
        }
        return b;
    }
}

*/
//optimized euclidean algo

class optimizedeucledian
{
    int gcd3(int a, int b)
    {
        if(b==0)
        {
            return a;
        }
        else{
            return gcd3(b,a%b);
        }
    }
}

public class gcd {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        int b=ob.nextInt();
       // naiveapproachgcd obj=new naiveapproachgcd();
       //betterapproachgcd obj=new betterapproachgcd();
       //int answer= obj.gcd2(a,b);
       optimizedeucledian obj=new optimizedeucledian();
      int answer=obj.gcd3(a, b);
       System.out.println(answer);
       ob.close();
    }
}
