package recursion;

public class sumofproduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sumOfProductOfDigits(35,6798));

	}
	public static int sumOfProductOfDigits(int n1,int n2)
	{
	         if(n1==0 || n2==0)
	        	 return 1;
	         return (n1%10*n2%10)+sumOfProductOfDigits(n1/10,n2/10);
	}
}
	  


