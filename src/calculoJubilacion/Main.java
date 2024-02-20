package calculoJubilacion;

import java.util.Scanner;
/*
 * @autor Mariano
 */

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingresa tu edad en años");

		int años = scanner.nextInt();

		// Creamos la persona con los años ya introducidos y llamamos al metodo
		// CalcularAñosHastaJubilacion

		Persona persona = new Persona(años);

		persona.CalcularAñosHastaJubilacion(años);
		
		//Modificacion para nueva version en github
	}

}
