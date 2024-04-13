package composite1;

public class Hoja implements Componente {
	private String nombre;
	private double peso;
	private double nota;

// Constructor
	public Hoja(String nombre, double peso, double nota) {
		this.nombre = nombre;
		this.peso = peso;
		this.nota = nota;
	}

	// Los métodos addComponente y removeComponente no tienen sentido en una hoja
	// pero se deben implementar
	@Override
	public void addComponente(Componente componente) {
	}

	@Override
	public void removeComponente(Componente componente) {
	}

	// La operación en este caso calculará la nota de un elemento evaluable no compuesto
	@Override
	public Object operacion() {
		double notaFinal = nota * peso;
		return (double) notaFinal;
	}

	// Getters
	public double getNota() {
		return nota;
	}

	public double getPeso() {
		return peso;
	}

	public String getNombre() {
		return nombre;
	}

}
