
package cajeroautomatico;


public class ClaseHija_Retiro extends ClasePadre_Abstracta {
		
		@Override
		public void Transacciones (){
		
		Retiro();
		
		if(retiro <10000){
		
		   if(retiro <= getSaldo()){
			 transacciones = getSaldo();
			 setSaldo(transacciones - retiro);
			 System.out.println("Usted ha retirado: " + retiro);
			 System.out.println("Tu saldo actual es: " + getSaldo());
			
		  } else {
		
				System.out.println("Saldo insuficiente");
		  }
	
	
	
	    } else {	System.out.println("No es posible retirar ese monto.");
		
		
		}

		
		
		}
}
	
