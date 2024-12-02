package principal;

import java.util.Scanner;

import clase.Coche;
import clase.Moto;
import clase.Vehiculo;

public class Principal {

	public static void main(String[] args) {
		// voy a crear un vehiculo
		Vehiculo vehiculo;
		String matricula;
		int caballos;
		Integer numpuertas;
		boolean tieneSidecar;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("matri");
		matricula = sc.next();
		System.out.println("caba");
		caballos = sc.nextInt();
		vehiculo= new Vehiculo(matricula, caballos);
		System.out.println(vehiculo);
		vehiculo.getMatricula();
		
		// voy a crear un coche
		
		// Coche coche = new Coche();
		System.out.println("matri");
		matricula = sc.next();
		System.out.println("caba");
		caballos = sc.nextInt();
		System.out.println("puertas");
		numpuertas = sc.nextInt();
		vehiculo = new Coche(matricula, caballos, numpuertas);
		System.out.println(vehiculo+ "Es familiar? "+ ((Coche) vehiculo).esFamiliar());
		
		//moto
		System.out.println("moto");
		System.out.println("matri");
		matricula = sc.next();
		System.out.println("caba");
		caballos = sc.nextInt();
		System.out.println("side");
		tieneSidecar = sc.next().equalsIgnoreCase("si");
		vehiculo = new Moto(matricula, numpuertas, tieneSidecar);
		System.out.println(vehiculo);
		
		sc.close();
	}

}
