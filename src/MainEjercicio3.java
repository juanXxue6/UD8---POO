import java.util.Scanner;

public class MainEjercicio3 {

	
	static public Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double peso;
		String color;
		String consumo;
		double precio;
		
		Electrodomesticos electrodomesticoUno = new Electrodomesticos();
		electrodomesticoUno.EnseñarValores();
		
		System.out.println("*-----------------------------------------*");
		
		System.out.println("Constructor solo peso y precio");
		System.out.println("Introduzca el peso");
		peso = Double.parseDouble(sc.nextLine());
		System.out.println("Introduzca el precio");
		precio = Double.parseDouble(sc.nextLine());
		
		Electrodomesticos electrodomesticoDos = new Electrodomesticos(precio, peso);
		electrodomesticoDos.EnseñarValores();
		
		System.out.println("*-----------------------------------------*");
		
		System.out.println("Constructor total");
		System.out.println("Introduzca el peso");
		peso = Double.parseDouble(sc.nextLine());
		System.out.println("Introduzca el precio");
		precio = Double.parseDouble(sc.nextLine());
		System.out.println("Introduzca el consumo");
		consumo = sc.nextLine();
		System.out.println("Introduzca el color");
		color = sc.nextLine();
		
		Electrodomesticos electrodomesticoTres = new Electrodomesticos(precio, color, consumo, peso);
		electrodomesticoTres.EnseñarValores();
		
		
	}

}
