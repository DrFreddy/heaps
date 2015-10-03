import java.io.FileNotFoundException;

/**
 * Universidad del Valle de Guatemala
 * Algortimos y estrcutura de datos
 * Seccion 10- Hoja de Trabajo 2
 * -------------------------------------------------
 * Laboratorio #8
 * @author Freddy Ruíz 14592/ Julio Ochoa 14
 * -------------------------------------------------
 *Main:
 *Esta clase es la encargada de interactuar con el usuario y mostrarle
 *el orden en el cual serán ordenados los datos.
 * 
 */

public class main {
	public static void main(String[] args) {
		controlPacientes lectura = new controlPacientes();
		System.out.println ("------BIENVENIDO AL HOSPITAL VIDA MEDICA--------");
		System.out.println("\nA continuación se mostrará el orden en el que serán \natendidos los pacientes:");
		System.out.println("\nOrden Correcto:");
		lectura.lecturaPacientes("src\\pacientes.txt");
	
	
	}
}
	
