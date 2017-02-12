package by.epam.lesson3.task;
/*
	В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые 
	кратны данному К
 */

import java.util.Scanner;

public class Lesson3_1 {
	
	public static void main(String[] args){
		int n = 5;
		int k = 5;
		int[] ar = new int[n];
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
		calculateSumFromArray(ar, k);
		
	}
	
	public static void calculateSumFromArray(int[] ar, int k){
		int s = 0;
	
		for (int i = 0; i<ar.length; i++){
			if (ar[i]%k == 0 ){
				s = s + ar[i];}
			}
		
		System.out.println("Сумма элементов кратных K ="+ " "+k+": "+s);
		}

}
