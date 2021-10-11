public class SumOfProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfProductOfDigits(32,3));

	}
	public static int sumOfProductOfDigits(int n1, int n2)
	{
	    // Your code here
		int sum=0;
	     if(n1>0 && n2>0)
	     {
		        	 return (n1 % 10) * (n2 % 10)+sumOfProductOfDigits(n1/10,n2/10);
	     }
	          
		 return 0;
	     
	}

}  


