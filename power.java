package DataStructures.mathematics;
import java.util.*;


/* 
class recur
{
    int solve1(int n,int x)
    {   
        if(x==0)
        {
            return 1;
        }
        else{
            return n*solve1(n, x-1);
        }
        
    }
}
public class power {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter number");
        int y=ob.nextInt();
        System.out.println("enter power coefficient");
        int power=ob.nextInt();
        recur obj=new recur();
        int ans=obj.solve1(y,power);
        System.out.println(ans);
        ob.close();
    }
}





*/

/*
class naivee
{
    public int power(int x,int n)
    {
        int p=1;
        for(int i=1;i<=n;i++)
        {
            p=p*x;
        }
        return p;
    }
}

public class power {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter number");
        int y=ob.nextInt();
        System.out.println("enter power coefficient");
        int power_input=ob.nextInt();
       // naivee obj=new naive();
        //int ans=obj.solve1(y,power_input);
       // System.out.println(ans);
       naivee obj=new naivee();
       int ans=obj.power(y, power_input);
       System.out.println(ans);
        ob.close();
    }
}

*/

//efficient solution-> log n time
/*
class efficient
{
    public int power(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        int temp=power(x,n/2);
        temp=temp*temp;
        if(n%2==0)
        {
            return temp;
        }
        else{
            return temp*x;
        }
    }
}

public class power {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter number");
        int y=ob.nextInt();
        System.out.println("enter power coefficient");
        int power_input=ob.nextInt();
       // naivee obj=new naive();
        //int ans=obj.solve1(y,power_input);
       // System.out.println(ans);
      // naivee obj=new naivee();
       //int ans=obj.power(y, power_input);
       efficient obj=new efficient();
       int ans=obj.power(y,power_input);
       System.out.println(ans);
        ob.close();
    }
}
*/

//iterative solution-> it also takes log n too
class iterative
{
    public int power(int x,int n)
    {
        int res=1;
        while(n>0)
        {
            if(n%2!=0)
            {
                res=res*x;
            }
                x=x*x;
                n=n>>1; // equivalent to n=n/2
        }
            return res;
        
    }
}

public class power {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter number");
        int y=ob.nextInt();
        System.out.println("enter power coefficient");
        int power_input=ob.nextInt();
       // naivee obj=new naive();
        //int ans=obj.solve1(y,power_input);
       // System.out.println(ans);
      // naivee obj=new naivee();
       //int ans=obj.power(y, power_input);
       iterative obj=new iterative();
       int ans=obj.power(y,power_input);
       System.out.println(ans);
        ob.close();
    }
}
