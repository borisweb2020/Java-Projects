public class LinearSearch{
	public static void main(String[] args){
		int[] array = {10, 2, 15, 0, -8, 44, 2, 150};
		int item = 44;

		for(int i = 0; i < array.length; i++){
			if(array[i] == item){
				System.out.println("Index of the number is " + i);
				break;
			}
		}
	}
}