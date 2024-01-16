import java.util.Scanner;

public class PrimeDivisor{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		String input = in.nextLine();

		if(input.matches("\\d+")){
			int a = Integer.parseInt(input);
			int largestDivisor = largestDivisorCalculator(a);
			System.out.println("Largest prime divisor: " + largestDivisor);
		} else {
			System.out.println("WARNING: Enter a correct integer");
		}

		in.close();
	}

	static boolean isPrime(int n){
		boolean isTrue = true;
		for(int i = 2; i * i <= n; i++){
			if(n % i == 0){
				isTrue = false;
				break;
			}
		}

		return isTrue;
	}

	static int largestDivisorCalculator(int a){
		int result = 1;
		for(int i = a - 1; i > 0; i--){
			if(a % i == 0){
				if(isPrime(i)){
					result = i;
					break;
				}
			}
		}

		return result;
	}
}