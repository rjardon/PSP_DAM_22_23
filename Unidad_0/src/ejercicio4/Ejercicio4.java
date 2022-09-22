package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static Scanner teclado = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		
		do {
			
			System.out.println("1.");
			System.out.println("2.");
			
			System.out.println("¿Qué desea hacer?");
			
			switch(num) {
			
			case 1:crearLlamada();
				break;
				
			case 2:mostrarLlamadas();
				break;
			
			}
		}
		while(num!=0);
	}

	public static void crearLlamada() {
		// TODO Auto-generated method stub
		
	}
	
	public static void mostrarLlamadas() {
		// TODO Auto-generated method stub
		
	}
}
