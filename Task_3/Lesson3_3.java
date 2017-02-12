package by.epam.lesson3.task;

import java.util.Scanner;

public class Lesson3_3 {
	/*
	 * Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.
	 */
	public static void main(String[] args){
		int n = 5;
		double[] ar = new double[n];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<ar.length; i++){
			
			System.out.println("ar["+i+"]=>");
			
			if (sc.hasNextDouble()){
			ar[i]=sc.nextDouble();
			}
			else
			{	 sc.next();
			     System.out.println("Вы ввели не число! В подсчете отказано!!!");
			     return;	
			}
		}
			
		System.out.println();	
		checkArray(ar);
		
	}
	
	public static void checkArray(double[] ar){
		double cur = ar[0];
		for (int i = 1; i<ar.length; i++){
			if (cur > ar[i]){
				 System.out.println("Нарушен принцип возрастающей последовательности!!!");
				 return;
				
			}
			cur = ar[i];
			
		}
		
		System.out.println("Возрастающая последовательность!!!");
		
	}

}
