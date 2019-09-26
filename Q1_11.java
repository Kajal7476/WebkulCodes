/*


5
*****   *@@@@@
    *   * @@@
    *   *  @
    *   *
    *****


*/
import java.util.*;
class Q1_11
{
    public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k1=1,k2=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=2*n-1;j++)
			{
	        if((j==n||j==2*n-1)||(i==n &&(j>=n &&j<=2*n-1)) || (i==1 &&(j<=n)))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j=1;j<=n;j++)
			{
				if(j>=k1 &&j<=k2)
					System.out.print("@");
				else
					System.out.print(" ");
			}
			k1++;k2--;
			System.out.println();
		}
	}
}