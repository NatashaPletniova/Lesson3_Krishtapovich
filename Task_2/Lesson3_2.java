package by.epam.lesson3.task;

import java.util.Scanner;

public class Lesson3_2 {
	/*
	 В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.
	 */
	public static void main(String[] args){
		int n = 5;
		int[] ar = new int[n];
		int[] zeroar = new int[n];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<ar.length; i++){
			
			System.out.println("ar["+i+"]=>");
			
			if (sc.hasNextInt()){
			ar[i]=sc.nextInt();
			}
			else
			{	 sc.next();
			     System.out.println("Вы ввели не целое число! В подсчете отказано!!!");
			     return;	
			}
		}
			
		System.out.println();	
		createZeroArray(ar, zeroar);
		printZeroArray(zeroar);
	
	}
	
	
	public static void createZeroArray(int[] ar, int[] zeroar){
		int j = 0;
	
		for (int i = 0; i<ar.length; i++){
			if (ar[i] == 0 ){
				zeroar[j] = i;
				j++;
				}
			}
		
		zeroar[j] = -1;
		}
	
	public static void printZeroArray(int[] zeroar){
		
		System.out.println("Результат:");
		System.out.println();
		
		for (int i = 0; i < zeroar.length; i++) {
			if (zeroar[i]>=0){

		System.out.println("zeroar["+i+"]= " +zeroar[i]);
		}
			else{
				return;
			}
			}
		System.out.println();
		}

}
