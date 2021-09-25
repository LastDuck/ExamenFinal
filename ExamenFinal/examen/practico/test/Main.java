package test;

import java.util.Scanner;

import polisa.Polisa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner lector=new Scanner(System.in);
		int opcion=0;
		int indice=0;
	
		Polisa [] NPoliza=new Polisa[15];
		
		do {
			System.out.println("\n\t→>>ASEGURADORA DEL SUR, elija una opción:<<←");
			System.out.println("Bienvenido Sistema Bibliotecario ");
			System.out.println("  1.- Ingresar Póliza");
			System.out.println("  2.- Actualizar Valor");
			System.out.println("  3.- Consultar Póliza");
			System.out.println("  4.- Imprimir Reporte ");
			System.out.println("  5.-salir");
			opcion=lector.nextInt();
			
			if(opcion==1) {
				System.out.println("1.-PólizaGeneralb)");
				System.out.println("2-PólizaVip");
				System.out.println("Seleccione una opción");
				int opcion1=lector.nextInt();
				if(opcion1==1) {
					System.out.println("Nombre");
					String nombre=lector.nextLine();
					System.out.println("Descripción");
					String descripcion=lector.nextLine();
					System.out.println("Año vigencia");
					int anio=lector.nextInt();
					System.out.println("Código de Póliza");
					String codigo=lector.nextLine();
					System.out.println("Valorde la Póliza");
					int valor=lector.nextInt();
					System.out.println("Código descuento");
					String codigoD=lector.nextLine();
					System.out.println("Número de Seguro");
					String numeroS=lector.nextLine();
					
					NPoliza[indice]=new Polisa(nombre, descripcion, anio, codigo, valor);
					
					
				}
					else if(opcion1==2) {
						System.out.println("Nombre");
						String nombre=lector.nextLine();
						System.out.println("Descripción");
						String descripcion=lector.nextLine();
						System.out.println("Año vigencia");
						int anio=lector.nextInt();
						System.out.println("Código de Póliza");
						String codigo=lector.nextLine();
						System.out.println("Valorde la Póliza");
						int valor=lector.nextInt();
						System.out.println("Beneficio");
						String beneficio=lector.nextLine();
						
						NPoliza[indice]=new Polisa(nombre, descripcion, anio, codigo, valor);
					
				}
			
				
			}else if(opcion==2) {
				System.out.println("Código de Póliza");
				String codigo=lector.nextLine();
				for(int i=0;i<NPoliza.length;i++) {
					
				}
				
			}else if(opcion==3){
				
			}else if (opcion==4) {
				
			}
			
		}while(opcion!=4);

	}

}
