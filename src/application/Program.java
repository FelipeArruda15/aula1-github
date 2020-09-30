package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;
public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area();
		
		double areaY = y.area();
		System.out.println("Bom dia!!");
		System.out.printf("Triângulo X área : %.4f%n", areaX);
		System.out.printf("Triângulo Y área : %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior área: X");
		} 
		else {
			System.out.println("Maior área: Y");
		}
		sc.close();
	}

}
