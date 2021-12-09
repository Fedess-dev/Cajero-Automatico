
package cajeroautomatico;


public class ClasePrincipal {
public static void main (String args[]){
	
	ClasePadre_Abstracta mensajero = new ClaseHija_Consulta();
	mensajero.setSaldo(10000);
	mensajero.Operaciones();
		
                        
	
	}
}