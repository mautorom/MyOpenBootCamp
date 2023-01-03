package Clase9;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		cliente.setEdad(25);
		cliente.setTelefono(11223344);
		cliente.setNombre("Mauricio");
		cliente.setCredito(150000);
		
		System.out.println("Datos del Cliente");
		System.out.println("Edad: " + cliente.getEdad());
		System.out.println("Nombre:" + cliente.getNombre());
		System.out.println("Telefono: " + cliente.getTelefono());
		System.out.println("Credito: " + cliente.getCredito());

		System.out.println("======================================");
			
		Trabajador trabajador = new Trabajador();
		
		trabajador.setEdad(40);
		trabajador.setTelefono(99887766);
		trabajador.setNombre("Alfredo");
		trabajador.setSalario(450000);
		
		System.out.println("Datos del trabajador");
		System.out.println("Edad: " + trabajador.getEdad());
		System.out.println("Nombre:" + trabajador.getNombre());
		System.out.println("Telefono: " + trabajador.getTelefono());
		System.out.println("Salario: " + trabajador.getSalario());
		
	}
}

class Persona{
	private int edad;
	private String nombre;
	private int telefono;
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
}

class Cliente extends Persona{
	private int credito;

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}
}

class Trabajador extends Persona{
	int salario;

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
}