package DataStructures.mathematics;

import java.util.Scanner;

// naive approach
/*
class lcmm
{ 
    public int solve(int a,int b)
    {
        int max=Math.max(a, b);
        while(true)
        {
            if(max%a==0 && max%b==0)
                return max;
        max++;
        }
   
    }
}

*/


//efficient approach->
// a general formula
//a*b= gcd(a,b)*lcm(a,b)
class lcmm{
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
    int lcm(int a,int b)
    {
        return (a*b)/gcd3(a, b);
    }
}
public class lcm {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        int b=ob.nextInt();
        lcmm obj=new lcmm();
        int result=obj.lcm(a, b);
        System.out.println(result);
        ob.close();
    }
}
