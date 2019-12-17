package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triagle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triagle x, y;
		
		x = new Triagle();
		y = new Triagle();

		System.out.println("Enter the meansures of triagles X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the meansures of triagles Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double p = (x.a + x.b + x.c ) / 2.0;
		double areaX = Math.sqrt((p * (p - x.a) * (p - x.b) * (p - x.c)));
		
		p = (y.a + y.b + y.c ) / 2.0;
		double areaY = Math.sqrt((p * (p - y.a) * (p - y.b) * (p - y.c)));
		
		if (areaX > areaY) {
			System.out.println("Larger area: X: ");
		}
			
			else {
				System.out.println("Larger area: Y: ");
							}
		
		sc.close();
			
		}
		
		
}


