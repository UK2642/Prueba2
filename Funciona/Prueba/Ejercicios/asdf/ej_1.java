package asdf;

import java.util.Scanner;

public class ej_1 {

	public static void main(String[] args) {
		//Crear un programa que pida un n�mero (n).
		//Despu�s lea n n�meros enteros y finalmente
		//visualizando el n�mero de positivos, negativos y su media.
		
		int leer, media, positivos=0, negativos=0;
		double suma=0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("N�meros a leer: ");
		leer = teclado.nextInt();
		media = leer;
		
		System.out.println("Escribe "+leer+" n�meros:");
		for(int i=0; i<leer; i++){
			int numero = teclado.nextInt();
			if(numero!=0){
				if(numero>0){
					positivos++;
				}else{
					negativos++;
				}
			}
			suma = suma + numero;
		}
		System.out.println("Positivos: "+positivos);
		System.out.println("Negativos: "+negativos);
		System.out.println("Media: "+(suma/media));
	}

}
