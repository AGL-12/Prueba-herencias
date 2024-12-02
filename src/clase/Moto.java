package clase;

import java.util.Scanner;

public class Moto extends Vehiculo {

	Scanner sc = new Scanner(System.in);
	private boolean tieneSidecar;

	// constructor
	public Moto(String matricula, int caballos, boolean tieneSidecar) {
		super(matricula, caballos);
		this.tieneSidecar = tieneSidecar;
	}

	// set get

	public boolean isTieneSidecar() {
		return tieneSidecar;
	}

	public void setTieneSidecar(boolean tieneSidecar) {
		this.tieneSidecar = tieneSidecar;
	}
	//setdatos
	
	//metodo

	// toString
	@Override
	public String toString() {
		return super.toString() + "Coche [numpuertas=" + tieneSidecar + "]";
	}
}
