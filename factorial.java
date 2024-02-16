package DataStructures.mathematics;
import java.util.*;



class findfact
{

    // iterative approach -> complexity is theta(N)
    /*
    int findfactorial(int n)
    {   int p=1;
        for(int i=1;i<=n;i++)
        {
            p=p*i;
        }
        return p;
    }
*/

    // recursive approach
    int fact(int n)
    {
        if(n==0|| n==1)
        {
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }

}
public class factorial {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter value of number");
        int n=ob.nextInt();
        findfact obj=new findfact();
       // int value=obj.findfactorial(n);
       int recursionvalue= obj.fact(n);
        //System.out.println(value);
        System.out.println(recursionvalue);
        ob.close();
        

    }
}
