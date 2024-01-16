import java.util.Scanner;

public class Factorial{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		if(in.hasNextInt()){
			int a = in.nextInt();
			if(a < 0){
				System.out.println("Enter a positive integer!");
			} else {
				int loopFact = loopMethod(a);
				int recursionFact = recursionMethod(a);
				int fibo = fibonachi(a);
				System.out.println("Factorial with a loop algorithm: " + loopFact);
				System.out.println("Factorial with a recursive algorithm: " + recursionFact);
				System.out.println("Fibonachi with a recursive algorithm: " + fibo);
			}
		} else {
			System.out.println("Enter a correct integer");
		}
		in.close();
	}

	static int loopMethod(int n){
		int f = 1;
		for(int i = 1; i <= n; i++){
			f *= i;
		}
		return f;
	}

	static int recursionMethod(int n){
		if(n == 1){
			return 1;
		} else {
			return n * recursionMethod(n - 1);
		}
	}

	static int fibonachi(int n){
		if(n == 1 || n == 2){
			return 1;
		}

		return fibonachi(n - 1) + fibonachi(n - 2);
	}
}