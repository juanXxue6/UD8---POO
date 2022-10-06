public class Persona {

	static final String GENERO_DEFECTO = "H";
	
	private String nombre;
	private int edad;
	private String dni;
	private String sexo;
	private double peso;
	private double altura;
	
//constructor valores por defecto, el dni es el unico que tiene que ir tipado
	public Persona(String dni) {
		this.nombre = "";
		this.edad = 0;
		this.dni = dni;
		this.sexo = GENERO_DEFECTO;
		this.peso = 0;
		this.altura = 0;
	}

//Constructor con algunos valores 
	public Persona(String nombre, int edad, String dni, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;
	
	}

//contructor con todo los valores
	public Persona(String nombre, int edad, String dni, String sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	
	public void GetAll() {
		System.out.println("*-------------------------*");
		System.out.println("Nombre: " + nombre);
		System.out.println("edad: " + edad);
		System.out.println("dni: " + dni);
		System.out.println("sexo: " + sexo);
		System.out.println("peso: " + peso);
		System.out.println("altura: " + altura);
		System.out.println("*-------------------------*");
	}
	
	
}
