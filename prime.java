package DataStructures.mathematics;
import java.util.*;

class primechecker
{
   // int checker(int n)
   // {  //naive approach-> O(n)
        /* 
         int c=0;
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
            c++;
            }
        }
        if(c==1)
        {
            return 1;
        }
        else{
            return 0;
        }
        */

// optimization upto under root n
/*
    int optimizedchecker(int n)
    {   
         int limit=(int)Math.sqrt(n);
         for(int i=2;i<=limit;i++)
         {
            if(n%i==0)
            {
              return 0;  
            }
         }
         return 1; 
    }
 */



 // more optimized-> we also remove numbers divisible by 3 and 2

 int bestapproach(int n)
 {
    if(n<=1)
    {
        return 0;
            }
        if(n==2||n==3)
        {
            return 1;
        }
    if(n%2==0||n%3==0)
    {
        return 0;
    }
     for(int i=5;i*i<=n;i=i+6)
        {
            if(n%i==0|| n%(i+2)==0)
            {
                return 0;
            }
        }
    return 1;
}
}
public class prime {
  public static void main(String[] args) {
    Scanner ob=new Scanner(System.in);
    int a=ob.nextInt();
    primechecker obj=new primechecker();
    //int ans=obj.checker(a);
    //int ans=obj.optimizedchecker(a);
    int ans=obj.bestapproach(a);
    if(ans==1)
    {
        System.out.println("prime");
    }
    else{
        System.out.println("not prime");
    }
    ob.close();
  }  
}
