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
			case 1:
			    int  cant,acum=0;
				InputStreamReader lector = new InputStreamReader(System.in);
				BufferedReader entrada = new BufferedReader(lector);
				
				System.out.println("Sumatoria");
				System.out.println("");
				System.out.println("-----------------------------------------------------");
				System.out.println("Ingrese la cantidad de números que desea procesar:");
				cant = Integer.parseInt(entrada.readLine());
				System.out.println("");
				
				int [] num = new int [cant];
				
				
				for(int i=0;i<cant;i++) {
					System.out.print("Ingrese numero en la posición-"+(i+1)+": ");
					num[i]=Integer.parseInt(entrada.readLine());
				}
				
				for(int i=0;i<cant;i++) {
					acum=acum+num[i];
				}
				
				System.out.println("");
				System.out.println("-----------------------------------------------------");
				System.out.println("La sumatoria total de los números ingresados es: "+acum);
				break;
//--------------------------------------------------------------------------------------------------			
			case 2:
				
				int i=0,j=0;
				
				System.out.println("Números pares del 1 al 10");
				System.out.println("-----------------------------");
				
				for(i=0;i<=10;i=i+2) {
					j=j+1;
					System.out.println("Numero par-"+(j)+": ");
					System.out.println(i);
					System.out.println("");
				}
				break;
				
//--------------------------------------------------------------------------------------------------
			case 3:
				
				int num1=0,num2=1,sum=0;
				
				System.out.println("15 primeros números de la serie Fibonacci");
				System.out.println("-----------------------------------------");
				System.out.println("");
				System.out.println("                   | 0 " );
				System.out.println("                   | 1 " );
				for(i=0;i<=12;i++) {
					sum = num1 + num2;
					num1 = num2;
					num2 = sum;
					System.out.println("                   | " + sum );
				}
				break;
//--------------------------------------------------------------------------------------------------
			 case 4:
				
					int produc=1,aux=0;
					int cant1 = 0;
					sum=0;
					
					System.out.println("Suma de los números pares y producto de los impares");
					System.out.println("---------------------------------------------------");
					System.out.println("");
					System.out.println("Ingrese la cantidad de números que desea procesar:");
					cant1 = sc.nextInt();
					System.out.println("");
					System.out.println("---------------------------------------------------");
					
					num = new int[cant1];
					int [] par = new int[cant1];
					int [] impar = new int[cant1];
					
					System.out.println("");
					for(i=0;i<cant1;i++) {
						System.out.print((i+1)+". Ingrese un número: ");
						num[i]= sc.nextInt();
						System.out.println("");
					}
					
					for(i=0;i<cant1;i++){
						if(num[i]%2==0){
							sum = sum + num[i];
							par[i]=num[i];
						}else {
							produc = produc * num[i];
							impar[i]=num[i];
						}
					}
					
					System.out.println("---------------------------------------------------");
					System.out.print("Pares: ");
					for(i=0;i<cant1;i++) {
						if(num[i]%2==0 && aux==0) {
							System.out.print("" + par[i]);
							aux = 1;
						}else if(num[i]%2==0 && aux!=0) {
							System.out.print(" + " + par[i]);
						}
					}
					System.out.print(" = " + sum);
					System.out.println("");
					System.out.println("");
					aux=0;
					
					
					System.out.print("Impares: ");
					for(i=0;i<cant1;i++) {
						if(num[i]%2!=0 && aux==0) {
							System.out.print("" + impar[i]);
							aux = 1;
						}else if(num[i]%2!=0 && aux!=0) {
							System.out.print(" * " + impar[i]);
						}
					}
					System.out.print(" = " + produc);		
					break;

//--------------------------------------------------------------------------------------------------
			case 5:
				InputStreamReader lecto = new InputStreamReader(System.in);
				BufferedReader entrad = new BufferedReader(lecto);
				
				System.out.println("Determinar si el número es primo");
				System.out.println("--------------------------------");
				System.out.println("");
				System.out.print("Ingrese un número: ");
				int numer = Integer.parseInt(entrad.readLine());
				System.out.println("");

				int resid,auxi=0;
					
					
				for(int e=0;e<=numer;e++) {
					resid=numer%(e+1);
					if(numer>1 && resid==0) {
						auxi=auxi+1;
					}
				}
						
				System.out.println("--------------------------------");
				if(auxi==2) {
					System.out.println("El número " + numer + " es primo");
				}else {
					System.out.println("El número " + numer + " no es primo");
				}
				
				break;


//--------------------------------------------------------------------------------------------------
			case 6:
				
				int nu,temp1=0,nu1=1,nu2=2;
				
				sc = new Scanner(System.in);
				System.out.println("Calcular factorial");
				System.out.println("--------------------------------------------------");
				System.out.println("");
				System.out.print("Ingrese un número: ");
				nu = sc.nextInt();
				System.out.println("");
				
				System.out.println("--------------------------------------------------");
				System.out.print(nu + "! es: " + nu1);
				for(i=0;i<(nu-1);i++) {
					temp1=nu1*nu2;
					nu1=temp1;
					nu2=nu2+1;
					System.out.print(" * " + (nu2-1));
				}
				System.out.println(" = " + temp1);
				break;

//--------------------------------------------------------------------------------------------------
			case 7:
				
				int number,aux1,cont=0;
				
				InputStreamReader lect = new InputStreamReader(System.in);
				BufferedReader entra = new BufferedReader(lect);
				
				
				System.out.println("Convertir un número decimal a binario");
				System.out.println("-----------------------------------------------");
				System.out.println("");
				System.out.print("Ingrese un número: ");
				number = Integer.parseInt(entra.readLine());
				System.out.println("");
				System.out.println("-----------------------------------------------");
				
				aux1 = (int)number;
				int [] bin = new int[aux1];
				
				int divi=number;
				for(i=0;divi>=1;i++) {
					if(divi!=1) {
						bin[i]=(divi%2);
						divi=divi/2;
						cont=cont+1;
					}else {
						bin[i]=(divi%2);
						divi=2/divi;
						break;
					}
				}
				
				System.out.print("El número "+number+" convertido a binario = ");
				for(i=(cont);i>=0;i--) {
					System.out.print(bin[i]);
				}
				break;


//--------------------------------------------------------------------------------------------------
			case 8:
			
				double c, f;
				
				System.out.print("CENTIGRADOS A FAHRENHEIT\n\n");
				System.out.print("Ingresa un grado Centigrado: ");
				c=sc.nextDouble();
				
				f=((c*9)/5)+32;
				System.out.printf("\n%.2f°C = %.2f°F\n", c, f);
				break;
				
//--------------------------------------------------------------------------------------------------
			case 9:
				
				double x, y, r;
				
				System.out.print("HIPOTENUSA DE UN TRIÁNGULO RECTÁNGULO\n\n");
				System.out.print("Ingresa la longitud del Cateto 'X': ");
				x=sc.nextDouble();
				System.out.print("Ingresa la longitud del Cateto 'Y': ");
				y=sc.nextDouble();
			 
				r=Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
			 
				System.out.printf("\nLa longitud de la Hipotenusa es: %.2f", r);
				break;
				
//--------------------------------------------------------------------------------------------------
			case 10:
				
				int anio;
				
				System.out.print("CALCULO AÑO BISIESTO\n\n");
				System.out.print("Ingresa un año para determinar si ES o NO Bisiesto: ");
				anio=sc.nextInt();
				System.out.print("\n");
				
				
				if((anio%4) == 0) {
					if((anio%100) == 0) {
						if((anio%400) == 0) {
							System.out.print(anio+" ES UN AÑO BISIESTO (TIENE 366 DIAS)");
						}
						else {
							System.out.print(anio+" NO ES UN AÑO BISIESTO (TIENE 365 DIAS)");
						}
					}
					else {
						System.out.print(anio+" ES UN AÑO BISIESTO (TIENE 366 DIAS)");
					}
				}
				else {
					System.out.print(anio+" NO ES UN AÑO BISIESTO (TIENE 365 DIAS)");
				}
				break;
//--------------------------------------------------------------------------------------------------
			case 11:
				System.out.println("*********** Ejecución finalizada ***********");
				break;
//--------------------------------------------------------------------------------------------------
			default:
				System.out.println("*********** Ingrese una opción válida *********** ");
			}
			
//--------------------------------------------------------------------------------------------------
		
		}while(opc!=11);
		
	}

}
