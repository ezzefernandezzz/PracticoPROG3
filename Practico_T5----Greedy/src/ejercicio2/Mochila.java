package ejercicio2;

import java.util.LinkedList;
import java.util.List;

public class Mochila {
	private List<Objeto> objetos;
	private List<Float> fraccionesObjetos;
	private float pesoMax;
	private float pesoActual;
	
	public Mochila(float pesoMax) {
		super();
		this.objetos = new LinkedList<Objeto>();
		this.fraccionesObjetos = new LinkedList<Float>();
		this.pesoMax = pesoMax;
		this.pesoActual = 0;
	}
	
	public List<Float> maximizarValor(List<Objeto> objetos) {
		while (pesoActual < pesoMax) {
			Objeto i = seleccionar_Objeto(objetos);
			if(pesoActual + i.getPeso() < pesoMax) {
				addObjeto(i, 1);
				pesoActual += i.getPeso();
			}
			else {
				addObjeto(i, (pesoMax - pesoActual) / i.getPeso());
				pesoActual = pesoMax;
			}
		}
		
		System.out.println(sumaTotal());
		return fraccionesObjetos;
	}
	
	public Objeto seleccionar_Objeto(List<Objeto> objetos) {
		float max_vp = 0;
		Objeto seleccionado = objetos.get(0);
		
		for (Objeto o : objetos) {
			float valorPeso = o.getValor()/o.getPeso();
			if(valorPeso > max_vp) {
				max_vp = valorPeso;
				seleccionado = o;
			}
		}
		
		System.out.println("Mejor eleccion: " + seleccionado.getPeso());
		objetos.remove(seleccionado);
		return seleccionado;
	}
	
	public void addObjeto(Objeto o, float fraccion) {
		objetos.add(o);
		fraccionesObjetos.add(fraccion);
	}
	
	public Float sumaTotal() {
		float sum = 0;
		for (int i = 0; i < objetos.size(); i++) {
			sum += objetos.get(i).getValor() * fraccionesObjetos.get(i);
		}
		return sum;
	}
	
	


	
	
	
}
