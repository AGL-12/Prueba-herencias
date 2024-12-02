package clase;

import java.util.Scanner;

public class Coche extends Vehiculo {
	Scanner sc = new Scanner(System.in);
	private Integer numpuertas;

	// constructor
	public Coche(String matricula, int caballos, Integer numpuertas) {
		super(matricula, caballos);
		this.numpuertas = numpuertas;
	}

	// set get
	public Integer getNumpuertas() {
		return numpuertas;
	}

	public void setNumpuertas(Integer numpuertas) {
		this.numpuertas = numpuertas;
	}
	//setdatos
	
	//metodo
	public boolean esFamiliar() {
		return numpuertas >= 4;
	}
	
	// toString
	@Override
	public String toString() {
		return super.toString() + "Coche [numpuertas=" + numpuertas + "]";
	}

}
