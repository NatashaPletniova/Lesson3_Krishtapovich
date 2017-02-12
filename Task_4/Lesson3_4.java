package by.epam.lesson3.task;

import java.util.Random;

public class Lesson3_4 {
	/*
	 Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из 
	 четных чисел этой последовательности. Если таких чисел нет, то вывести 
	 сообщение об этом факте.
	 */
	
	public static void main(String[] args) {
		int n = 5;
		int[] ar = new int[n];
		int[] evenar = new int[n];
		
		/*ar[0] = 123;
		ar[1] = 127;
		ar[2] = 129;
		ar[3] = 23;
		ar[4] = 3; */
		
		int rez;
		enterArrayWithRandom(ar);
		System.out.println();
		rez = createEvenArray (ar, evenar);
		if (rez>0){
			printArray(evenar);	
		}else {
			System.out.println("В исходной последовательности четных чисел нет!");
			
		}
	
		
	}
	
	public static void enterArrayWithRandom(int[] ar){
		Random rand = new Random();
		
		for (int i=0; i<ar.length; i++){
			ar[i]=rand.nextInt(300);
			System.out.println("ar["+i+"]= " +ar[i]);

		}
	}
	
	
	public static int createEvenArray (int[] ar, int[] evenar) {
		int j = 0;
		for (int i=0; i<ar.length; i++){
			if(ar[i]%2 == 0){
			evenar[j] = ar[i];
			//System.out.println("evenar["+j+"]= " +evenar[j]);
			j++;
			}
			                           }
		
		return j;
		}
			
	
	
	
	public static void printArray(int[] array){
		
		System.out.println("Результат:");
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {

		System.out.println("array["+i+"]= " +array[i]);
		}
		System.out.println();

	}
	
	
}
