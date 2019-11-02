package com.mediajava.programin;

import java.util.Scanner;

public class programing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner var = new Scanner(System.in);
		nota notas = new nota();
			int a,b,c,d;
			
				System.out.println("digite suas  Notas : ");
				
					a = var.nextInt();
					b = var.nextInt();
					c = var.nextInt();
					d = var.nextInt();

					notas.setN1(a);
				notas.setN2(b);
				notas.setN3(c);
				notas.setN4(d);
				
				System.out.println(notas.getmediatotal());
				
				
		
	var.close();
		
		
	}

}
