package recursion;

public class fibonacci {
	public static void main(String[] args) {
		System.out.println(Fibonacci(6));
		
	}
	 static long  Fibonacci(long  n) 
	    { 
		 	if(n<=1)
		 		return n;
		 	return Fibonacci(n-1)+Fibonacci(n-2);
	    } 

}
