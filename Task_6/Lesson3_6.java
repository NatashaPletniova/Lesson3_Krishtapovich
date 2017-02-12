package by.epam.lesson3.task;

public class Lesson3_6 {
	public static void main(String[] args) {
		int n = 6;
		
		int[][] array = new int[n][n];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				
			if((i == 0)||(i == (array.length - 1))){
				array[i][j] = 1;	
			}else
				if ((j == 0)||(j == (array.length - 1))){
					array[i][j] = 1;	
				}else {
				
				array[i][j] = 0;
				}
			}
			}
		
		
		printArray(array);
		
	}
	
	
	
	public static void printArray(int[][] array){
		
		System.out.println("Результат:");
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

		System.out.print(" "+array[i][j]+" ");
		}
			System.out.println();
		}
		System.out.println();

	}

}
