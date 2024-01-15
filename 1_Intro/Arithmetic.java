import java.util.InputMismatchException;
import java.util.Scanner;

public class Arithmetic{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter two decimal numbers, separated by a whitespace: ");

		try{
			String input = in.nextLine();
			String[] numbers = input.split(" ");

			if(numbers.length == 2){
				int firstNumber = Integer.valueOf(numbers[0]);
				int secondNumber = Integer.valueOf(numbers[1]);
				System.out.println("Your numbers are " + firstNumber + " and " + secondNumber);
			} else {
				System.out.println("Enter two decimal numbers, separated by a whitespace");
			}

		} catch(NumberFormatException e){
			System.out.println("Enter a correct integer");
		} finally {
			in.close();
		}
	}
}

