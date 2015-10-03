/**
 * Universidad del Valle de Guatemala
 * Algortimos y estrcutura de datos
 * Seccion 10- Hoja de Trabajo 2
 * -------------------------------------------------
 * Laboratorio #8
 * @author Freddy Ruíz 14592/ Julio Ochoa 14
 * -------------------------------------------------
 *controlPacientes:
 *Esta clase contiene todos los métodos utilizados para determinar
 *la prioridad de atención de los pacientes.
 * 
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;


public class controlPacientes {
	private String linea;
	private String[] palabras, abcdario;
	private ArrayList<String> lineas= new ArrayList<String>();;

public void lecturaPacientes(String texto){
		
		//*********************LECTURA DEL TEXTO A TRADUCIR********************
		try{
      	File archivo = new File (texto);
      	FileReader fr= new FileReader(archivo);
      	BufferedReader bf= new BufferedReader(fr);
      
      	
      	//Ciclo para determinar el tamaño del array
          while((linea = bf.readLine()) != null){
          lineas.add(linea);
          }
          
          //Obtención del identificador del paciente  
          for (int i=0; i < lineas.size(); i++){
          System.out.println( lineas.get(i).charAt(lineas.get(i).length()-1));
          }
      
      
		}
		
		//Cierre del try
        catch(Exception e){ //En caso que no pueda leerse el archivo
     	   System.err.println( "ARCHIVO NO ENCONTRADO" );
       } //Cierre del Catch
	  
	}
}
