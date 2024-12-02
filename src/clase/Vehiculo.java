package clase;

import java.util.Scanner;

public class Vehiculo {

	// atributios
	private String matricula;
	private int caballos;
	Scanner sc = new Scanner(System.in);

	// constructor
	public Vehiculo(String matricula, int caballos) {
		super();
		this.matricula = matricula;
		this.caballos = caballos;
	}

	// setters y getters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getCaballos() {
		return caballos;
	}

	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}
	// setdatos

	// metodo

	// toString
	@Override
	public String toString() {
		return "El Vehiculo [matricula=" + matricula + ", caballos=" + caballos + "]";
	}

}
