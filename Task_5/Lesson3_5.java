package by.epam.lesson3.task;

public class Lesson3_5 {
	
	public static void main(String[] args) {
		int n = 6;
		
		int[][] array = new int[n][n];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				
			if(i%2 == 0){
				array[i][j] = j+1;	
			}else
				array[i][j] = array.length - j;
			}
			}
		
		
		printArray(array);
		
	}
	
	
	
	public static void printArray(int[][] array){
		
		System.out.println("Результат:");
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

		//System.out.println("array["+i+"]= " +array[i]);
		System.out.print(" "+array[i][j]+" ");
		}
			System.out.println();
		}
		System.out.println();

	}

	
	
}
