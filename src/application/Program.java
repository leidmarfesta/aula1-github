package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("This is just a beta program to classes. It is not a real program!!");
		
		// criar programa que calcule a area dos triangulos X e y . Ao final dizer qual tem maior �rea (ler o tamanho dos lados no console)
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("enter the measures of the triangle 'X':");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("enter the measures of the triangle 'Y':");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		//calculando �rea X
		double areaX = x.area();
		
		//calculando �rea Y
		double areaY = y.area(); 

		System.out.printf("Triangle X area: %.4f %n", areaX);
		System.out.printf("Triangle Y area: %.4f %n", areaY);
		
		if (areaX > areaY) {
			System.out.println(" Larger area is 'X'!!");
		}else {
			System.out.println(" Larger area is 'Y'!!");
		}
		
		
		sc.close();
	}

}
