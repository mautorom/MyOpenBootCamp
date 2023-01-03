package ejercicioTema8;

public class Main {

	public static void main(String[] args) {
		Persona persona = new Persona();
		
		persona.setNombre("Mauricio");
		persona.setEdad(40);
		persona.setTelefono(12345678);
		
		System.out.println("Los datos de persona son");
		System.out.println("Nombre: " + persona.getNombre());
		System.out.println("Edad: " + persona.getEdad());
		System.out.println("Telefono: " + persona.getTelefono());
		
	}

}

class Persona{
	
	private String nombre;
	private int edad;
	private int telefono;
	
	public Persona() {
	}
	
	public Persona(String nombre, int edad, int telefono) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	

}

