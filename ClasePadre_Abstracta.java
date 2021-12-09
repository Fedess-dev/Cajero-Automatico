
package cajeroautomatico;

import java.util.Scanner;


public abstract class ClasePadre_Abstracta {
    
    protected int transacciones, retiro, deposito;
	private static int saldo;
	Scanner entrada = new Scanner(System.in);

	
	public void Operaciones() {

	int seleccion = 0;

	do {
	
		System.out.println(" 1.Consulta de saldo");
		System.out.println(" 2.Retiro");
		System.out.println(" 3.Deposito");
		System.out.println(" 4.Salir");
	
		seleccion = entrada.nextInt();
	
	
		switch (seleccion) {
		
			case 1:
				ClasePadre_Abstracta mensajero = new ClaseHija_Consulta();
				mensajero.Transacciones();
				break;
			case 2:
				ClasePadre_Abstracta mensajero = new ClaseHija_Retiro();
				mensajero.Transacciones();
				break;
			case 3:
				ClasePadre_Abstracta mensajero = new ClaseHija_Deposito();
				mensajero.Transacciones();
				break;
			case 4:
				System.out.println("Gracias por operar con nosotros.");
				break;
			default: 
				System.out.println("Opcion no valida.");
		
		}	
	
	} while ( seleccion != 4 );

	}




	public void Retiro(){
	
		System.out.println("¿Cuanto dinero desea retirar?");
		retiro = entrada.nextInt();
	}

	public void Deposito (){

		System.out.println("¿Cuanto dinero desea depositar?");
		deposito = entrada.nextInt();

	}
	
	
	public abstract void Transacciones ();
	


	public int getSaldo (){

		return saldo;
	}

	public void setSaldo (int saldo){

		this.saldo = saldo;
	}
    
}
