package recursion;

import java.util.Scanner;

public class factRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			int a=sc.nextInt();
			System.out.println(sum(a));
		}
				

	}
	static int sum(int n)
	{
		if(n==0)
			return 0;
		else
			return (n%10)+sum(n/10);
	}

}
