package DataStructures.mathematics;
import java.util.*;

//class solution{

    /* 
    int result;
// seive of erastosthencs=> print all prime numbers from 1 to n
void soe(int n)
{
    for(int i=1;i<=n;i++)
    {
        result= checkprime(i);
        if(result==1)
        {
    System.out.println(i); 
    }
}
}
int checkprime(int a)
{
    if(a<=1)
    {
        return 0;
    }
    if(a==2||a==3)
    {
        return 1;
    }
    if(a%2==0||a%3==0)
    {
        return 0;
    }
    for(int i=5;i*i<=a;i=i+6)
    {
        if(a%i==0||a%(i+2)==0)
        {
            return 0;
        }
    }
    return 1;
}

}

*/
class solution{
void rand(int n)
	{
		// Create a boolean array "prime[0..n]" and
		// initialize all entries it as true. A value in
		// prime[i] will finally be false if i is Not a
		// prime, else true.
		boolean prime[] = new boolean[n + 1];
		for (int i = 0; i <= n; i++)
			prime[i] = true;

		for (int p = 2; p * p <= n; p++) {
			// If prime[p] is not changed, then it is a
			// prime
			if (prime[p] == true) {
				// Update all multiples of p greater than or
				// equal to the square of it numbers which
				// are multiple of p and are less than p^2
				// are already been marked.
				for (int i = p * p; i <= n; i += p)
					prime[i] = false;
			}
		}
        for (int i = 2; i <= n; i++) {
			if (prime[i] == true)
				System.out.print(i + " ");
		}
	}
}
public class seiveoferatosthencs
  {
    public static void main(String[] args) 
    {
        solution obj=new solution();
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a number");
        int input=ob.nextInt();
        obj.rand(input);
       
       ob.close();

    }
}
