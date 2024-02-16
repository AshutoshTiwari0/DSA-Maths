package DataStructures.mathematics;
import java.util.*;


class solution{
    /* 
 boolean isPrime(int n)
 {
    if(n<=1)
    {
        return false;
            }
        if(n==2||n==3)
        {
            return true;
        }
    if(n%2==0||n%3==0)
    {
        return false;
    }
     for(int i=5;i*i<=n;i=i+6)
        {
            if(n%i==0|| n%(i+2)==0)
            {
                return false;
            }
        }
    return true;
}
    void naive(int n)
    {
        // first finding factors and then if it is prime
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            {
                // check i is prime or not
                int x=i;
                while(n%x==0)
                {
                    System.out.println(i);
                    x=x/i;
                }
                }
            }
      
        }

        */
            void correct(int n)
            {
                if(n<=1)
                return;
                for(int i=2;i*i<=n;i++)
                {
                    while(n%i==0)
                    {
                        System.out.println(i);
                        n=n/i;
                    }
                }
            
            if(n>1){
                System.out.println(n);
            }


    }
}




public class primefactors {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        solution obj=new solution();
        int a=ob.nextInt();
        obj.correct(a);
        
        ob.close();
    }
}
