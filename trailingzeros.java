package DataStructures.mathematics;
import java.util.*;

class solution
{
   
    public int trailingzero(int n)
    {
        int sol=0;
    // this solution fails for high values of n bcoz n! grows extensively-> complexity is theta(n)
    /* 
           int p=1;int count=0;
        for(int i=1;i<=n;i++)
        {
            p=p*i;
        }
        while(p!=0)
        {
            int b=p%10;
            if(b==0)
            {
                count++;
            }
            p=p/10;
        }
        return count;
    }
    */
//a zero is formed by muliplpying 5*2 or factors of 5 and 2
   // solution is-> n/5+n/25+n/125+.........
    for(int i=5;i<=n;i=i*5)
    {
        sol=sol+(n/i);
    }
return sol;
}
}
public class trailingzeros {
    public static void main(String[] args) {
        // trailing zeros
        /*
         * example 1-> 5!=120 output=1(no of zeros at end)
         * example 2-> 10!=3628800 output=2(no of zeros at end)
         
         */
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        solution obj=new solution();
       int answer= obj.trailingzero(n);
       System.out.println(answer);
       ob.close();

    }
}
