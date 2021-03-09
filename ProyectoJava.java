//Cambios del miembro #2
Escribir "NUMERO";
Si (y=3) Entonces
	Escribir "Hola";
FinSi


Linea de Reemplazamiento de Commit 1.


Hola
esto es una prueba #1
esto es una prueba #2
esto es una prueba #3

import javax.swing.*;
import java.io.*;
import java.util.*;

//ESTO ES UN COMENTARIO DE PRUEBA, PARA SIMULAR LOS CAMBIOS DE OTROS COLABORADORES QUE ESTAN
//TRABAJANDO CONMIGO EN GITHUB.

//MI CAMBIO: CAMBIE EL NOMBRE DE LA CLASE PRINCIPAL A PROYECTOJAVA.

public class ProyectoJava {
	public static void main(String[]args)throws IOException {
		Scanner sc = new Scanner(System.in);
		String a;
		
		int opc;
		
		do {
			
			System.out.println("");
			System.out.println("");
			System.out.println("-------------------------------");
			System.out.println("            Menu");
			System.out.println("");
			System.out.println("1. Programa       7. Programa");
			System.out.println("2. Programa       8. Programa");
			System.out.println("3. Programa       9. Programa");
			System.out.println("4. Programa       10. Programa");
			System.out.println("5. Programa       11. Salir");
			System.out.println("6. Programa");
			System.out.println("");
			System.out.print("Ingrese opcion ---------> ");
			opc = sc.nextInt();
			System.out.println("");
			System.out.println("-------------------------------");
			System.out.println("");
			System.out.println("");
			
			switch(opc) {
//--------------------------------------------------------------------------------