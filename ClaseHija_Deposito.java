

package cajeroautomatico;

public class ClaseHija_Deposito extends ClasePadre_Abstracta {
	
		@Override
		public void Transacciones (){
		
		Deposito();

		if ( deposito <= 10000 && deposito%100==0 ){
		transacciones = getSaldo();
		setSaldo(transacciones + deposito);
		System.out.println("Usted ha depositado: " + deposito);
		System.out.println("Su saldo actual es de:" + getSaldo());
		
                }else { System.out.println ("Revise que este ingresando billetes de 100 o mayor denominacion. Tambien recuerde que no se permiten depósitos mayores a 10000 por operación.");
		
		}
		
		
        }
	
	}