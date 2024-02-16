package DataStructures.mathematics;
import java.util.*;

 class pallin {
boolean checkpallin(int n)
{
    int copy=n;
    int r=0;
    while(n!=0)
    {
    //    we will be in loop untill we extract each and every digit so time taken is theta(no of digits) 
        int b=n%10;
        r=(r*10)+b;
        n=n/10;
    }
    if(r==copy)
    {
        return true;
    }
    else{
        return false;
    }
}   
}

public class pallindromenumber {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter number");
        int n=ob.nextInt();
        pallin obj=new pallin();
       boolean ans= obj.checkpallin(n);
       System.out.println(ans);
       ob.close();
    }
}



//time complexity is-> theta(n) where n is no. of digits