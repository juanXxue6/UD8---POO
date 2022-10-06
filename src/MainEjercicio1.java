import java.util.Scanner;

public class MainEjercicio1 {

	static public Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		Persona personaPrimerConstructor = new Persona("12340421M");
		

		Persona personaSegundorConstructor = new Persona("Luisa", 22, "78842221M", "M");
		

		Persona personaTercerConstructor = new Persona("Dionisio", 62, "1002933DJ", "H", 101.2, 185);
		
		
		personaPrimerConstructor.GetAll();
		
		System.out.println("-------------------");
		
		personaSegundorConstructor.GetAll();
		
		System.out.println("-------------------");
		
		personaTercerConstructor.GetAll();
	}

}
