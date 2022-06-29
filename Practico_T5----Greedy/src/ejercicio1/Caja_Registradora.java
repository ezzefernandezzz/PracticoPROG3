package ejercicio1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Caja_Registradora {
	private List<Integer> monedas;
	private int cambio;
	
	public Caja_Registradora(int cambio) {
		super();
		this.monedas = new LinkedList<Integer>();
		monedas.add(100);
		monedas.add(25);
		monedas.add(10);
		monedas.add(5);
		monedas.add(1);
		this.cambio = cambio;
	}
	
	
	
	public List<Integer> cambio_Greedy() //conjunto<candidatos> C
	{ // Inicialmente el conjunto C contiene todos los candidatos
		List<Integer> cambioRecibido = new LinkedList<Integer>(); // Conjunto solución, inicialmente Vacío
		Iterator<Integer> itMonedas = monedas.iterator();
		Integer billete = itMonedas.next();
		
		while (itMonedas.hasNext() || cambio > 0) {
			//x = seleccionar(C); // determina el mejor candidatos del conjunto a seleccionar
			
			//C.borrar(x);
			if (billete <= cambio )	//factible(S,x)
			{
				cambioRecibido.add(billete);	//S.agregar(x);
				cambio -= billete;
			}
			else
				billete = itMonedas.next();
		}
		
		if (cambio == 0)
			return cambioRecibido;
		else
			return null;
	}
	
}
