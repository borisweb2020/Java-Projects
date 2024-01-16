import java.util.InputMismatchException;
import java.util.Scanner;

public class Arithmetic{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter two decimal numbers, separated by a whitespace: ");

		try{
				int a = in.nextInt();
				int b = in.nextInt();
				int sum = a + b;
				int diff = a -b;
				int product = a * b;
				System.out.println("The sum is\s" + sum);
				System.out.println("The difference is\s" + diff);
				System.out.println("The product is\s" + product);
				if(b == 0){
					System.out.println("Division by zero");
				} else if(b > a){
					float aFloat = a;
					float bFloat = b;
					float qoutientFloat = aFloat / bFloat;
					System.out.println("The qoutient is\s" + qoutientFloat);
				} else {
					int qoutient = a / b;
					System.out.println("The qoutient is\s" + qoutient);
				}
		} catch(InputMismatchException e){
			System.out.println("Enter a correct integer");
		} finally {
			in.close();
		}
	}
}

