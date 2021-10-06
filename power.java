package recursion;

import java.text.DecimalFormat;
import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			DecimalFormat df = new DecimalFormat("###.##");
			float a=sc.nextFloat();
			short b=sc.nextShort();
			float ans=powerof(a,b);
			
			System.out.println(df.format(ans));
			//System.out.println(Math.round (ans));
		}
		

	}
	static float powerof(float a,short b)
	{
		if(b==0)
		return 1;
		if(b>0)
		return powerof(a,(short) (b-1))*a;
		return powerof(a,(short) (b+1))*(1/a);
		
	}

}
