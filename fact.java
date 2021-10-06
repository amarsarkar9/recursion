package recursion;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Factorial(5));
	}
	static int Factorial(int N){
		//Enter your code here	
			if(N==0 || N==1)
				return 1;
			return N*Factorial(N-1);
		}

}
