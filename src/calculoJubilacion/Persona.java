package calculoJubilacion;

/**
 *@author Molinero 
 */

public class Persona {

	private int años;

	public Persona(int años) {
		this.años = años;
	}

	/**
	 * Javadoc
	 * 
	 * @param años
	 * 
	 * @return Metodo que pide un int referente a los años de persona y retorna la respuesta correcta segun la edad introducida.
	 *         
	 */
	public void CalcularAñosHastaJubilacion(int años) {

		// años de referencia para la edad de jubilacion
		int edadJubilacion = 67;

		// condicional de la edad
		if (años > edadJubilacion - 10) {
			System.out.println("Solo te quedan 7 años. !vamos que ya queda poco!");
		} else if (años < edadJubilacion - 20) {
			System.out.println("Te quedan 23 años. !A seguir trabajando gandul!");
		}
	}
}
