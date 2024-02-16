package DataStructures.mathematics;
import java.util.*;
class naive{

    /*
   void solve(int n)  // takes O(N) time
   {
    for(int i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            System.out.println(i);
        }
    }
   }
*/

/*
   void optimized(int n)// takes square root N time  problem with this approach is we get unsorted form of numbers
   {
    for(int i=1;i*i<=n;i++)
    {
        if(n%i==0)
        {
            System.out.println(i);
            if(i!=n/i)
            {
                System.out.println(n/i);
            }
        }
    }
   }

*/


   void optimizedinorder(int n)
   {
    int i;
    for(i=1;i*i<=n;i++)
    {
        if(n%i==0)
        System.out.println(i);
    }
    for(;i>=1;i--)
    {
        if(n%i==0)
        {
            System.out.println(n/i);
        }
    }
   }
}

public class divisors {
    public static void main(String[] args) {
        naive obj=new naive();
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a number");
        int input=ob.nextInt();
       // obj.solve(input);
      //obj.optimized(input);
      obj.optimizedinorder(input);
        ob.close();
    }
}
