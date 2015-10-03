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
import java.io.FileReader;
import java.util.ArrayList;


public class controlPacientes {
	private String linea, sintoma;
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
          
          //Obtención de los datos del paciente
          for (int i=0; i < lineas.size(); i++){
          //Nombre del paciente
          System.out.println(lineas.get(i).substring(0, lineas.get(i).indexOf(",")));
          //Sintomas
          palabras=lineas.get(i).substring(lineas.get(i).indexOf(",")+1,lineas.get(i).length()-1).substring(0,lineas.get(i).substring(lineas.get(i).indexOf(",")+1,lineas.get(i).length()-1).indexOf(",")).split(" ");
    	  for (int j=0; j< palabras.length; j++){
        	  if (palabras[j].equals("")== true){
        		
        	  }
        	 
        	  else{
        	  sintoma= sintoma+palabras[j]+" ";
        	  sintoma= sintoma.replace("null", "");
        	  }
        	    
          }
          
          System.out.println(sintoma);
          sintoma="";
        
          
          //Identificador
          System.out.println( lineas.get(i).charAt(lineas.get(i).length()-1));
          }
               
		}
		
		//Cierre del try
        catch(Exception e){ //En caso que no pueda leerse el archivo
     	   System.err.println( e );
       } //Cierre del Catch
	  
	}
}
