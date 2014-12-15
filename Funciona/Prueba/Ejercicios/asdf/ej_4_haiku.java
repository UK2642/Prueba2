package asdf;

import java.util.Arrays;
import java.util.Scanner;

public class ej_4_haiku {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String []versos= new String[40];
		int numVersos=0;
		String respuesta="";
		
		//Saludo
		System.out.println("Generador Haiku");
		System.out.println("Escribe versos (*=fin):");
		
		//Leer versos
		String verso="";
		while(!verso.equals("*")){
			verso=teclado.nextLine();
			if (!verso.equals("*")){
				versos[numVersos++]=verso;
			}
		}
		System.out.println("Versos leídos:");
		System.out.println(Arrays.toString(versos));
		
		//Elegir tres aleatorios y mostrarlos
		while(respuesta.equalsIgnoreCase("s")){	
			for(int i=0; i<3; i++){
				int aleatorio;
				
				aleatorio=(int)(Math.random()*numVersos);
				System.out.println(versos[aleatorio]);
			}
			System.out.println("¿Otro haiku? [s/n]");
			respuesta=teclado.nextLine();
		}
		
	}

}
