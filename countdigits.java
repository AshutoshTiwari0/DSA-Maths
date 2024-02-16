package DataStructures.mathematics;
import java.util.*;
public class countdigits {
    public static void main(String[] args) {
        int c=0;
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        while(n!=0)
        {
            n=n/10;
            c++;

        }
        System.out.println("no of digits are "+c);
        ob.close();
    }
}
