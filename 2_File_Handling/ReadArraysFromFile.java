import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.FileReader;

import java.util.ArrayList;

public class ReadArraysFromFile{
	public static void main(String[] args){
		ArrayList<Integer> array_1 = new ArrayList<>();

		try{
			File arrayInt = new File("../resources/textfiles/array_int.txt");
			Scanner readerArray = new Scanner(arrayInt);
			while(readerArray.hasNextInt()){
				Integer data = readerArray.nextInt();
				array_1.add(data);
			}
			readerArray.close();
		} catch(IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
		System.out.println(array_1);

		ArrayList<Integer> array_2 = new ArrayList<>();

		BufferedReader br = null;
		try{
			br = new BufferedReader(new FileReader("../resources/textfiles/array_int.txt"));
			String line;
			while((line = br.readLine()) != null){
				int item = Integer.parseInt(line);
				array_2.add(item);
			}
		} catch(IOException e) {
			System.out.println("An error " + e);
		} finally {
			try {
				br.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(array_2);

		ArrayList<String> array_3 = new ArrayList<>();

		try{
			File arrayString = new File("../resources/textfiles/array_string.txt");
			Scanner readerArray = new Scanner(arrayString);
			while(readerArray.hasNextLine()){
				String data = readerArray.nextLine();
				array_3.add(data);
			}
			readerArray.close();
		} catch(IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
		System.out.println(array_3);
	}
}