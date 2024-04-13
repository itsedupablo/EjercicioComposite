package composite1;

import java.util.*;

//En este caso la clase compuesto (Composite) será cualquier objeto que pueda ser evaluable y esté conformado por otros objetos
public class Compuesto implements Componente {
	private String nombre;
	private double peso;
	private List<Componente> componentes;

// Constructores
	public Compuesto(String nombre, double peso) {
		this.nombre = nombre;
		this.peso = peso;
		componentes = new ArrayList<Componente>();
	}

	public Compuesto(String nombre) {
		this.nombre = nombre;
		this.peso = 1.0;
		componentes = new ArrayList<Componente>();
	}

	@Override
	public void addComponente(Componente componente) {
		componentes.add(componente);
	}

	@Override
	public void removeComponente(Componente componente) {
		componentes.remove(componente);

	}

	// La operación en este caso calculará la nota media de asignaturas y otras
	// actividades compuestas
	@Override
	public Object operacion() {
		double notaFinal = 0;
		for (Componente componente : componentes) {
			notaFinal += (double) componente.operacion();
		}
		return notaFinal;
	}

	// Getters
	public String getNombre() {
		return nombre;
	}

	public List<Componente> getComponentes() {
		return componentes;
	}

}
