package funciones;

public class Main {
	
	public static void main(String[] args) {
		//Ejercicio Curso 3 Funciones
		
		System.out.println("Primera Parte: Funcion sumar");
		
		//Llamado a funcion para sumar 3 parametros y pasarlos a una variable int
		int resultado = funcionSuma(2,4,1);
		System.out.println("Resultado Funcion suma : " + resultado);
		
		
		System.out.println("Segunda Parte: Clase coche y funcion que incremente el numero de puertas");

		Coche miCoche = new Coche();

		//Funcion para agregar puertas al coche
		agregarPuertas(miCoche);
		System.out.println("Se agrega puerta: " + miCoche.getPuertas());
		
		
		//Funcion para obtener la  cantidad de puertas
		miCoche.CantidadPuertas();
		System.out.println("Cantidad de puertas: " + miCoche.getPuertas());

		
	}
	
	public static int funcionSuma(int valor1, int valor2, int valor3) {
		return valor1+valor2+valor3;
	}
	
	public static void agregarPuertas(Coche puertas) {
		puertas.AgregarPuerta();
	}
	
	public static int cantidadPuertas(Coche coche) {
		return coche.getPuertas();
	}
	
}


class Coche{
	
	public int puertas;
	
	public int getPuertas() {
		return puertas;
	}
	
	public void AgregarPuerta() {
		this.puertas++;
	}
	
	public int CantidadPuertas() {
		return this.getPuertas();
	}
}