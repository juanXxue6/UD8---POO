import java.util.Scanner;

public class Electrodomesticos {

	static public Scanner sc = new Scanner(System.in);

	private static final String[] CONSUMO_ENERGETICO = { "F", "E", "D", "C", "B", "A" };
	private static final String[] COLORES_DISPONIBLES = { "blanco", "negro", "rojo", "azul", "gris" };
	private static final int PESO_BASE = 5;
	private static final double PRECIO_BASE = 100;

	private double precioBase;
	private String color;
	private String consumoEnergetico;
	private double peso;

	//primer constructor por defecto
	
	public Electrodomesticos() {

		this.precioBase = PRECIO_BASE;
		this.color = COLORES_DISPONIBLES[0];
		this.consumoEnergetico = CONSUMO_ENERGETICO[0];
		this.peso = PESO_BASE;
	}

	//constructor con peso y precio
	
	public Electrodomesticos(double precioBase, double peso) {

		this.precioBase = ValidarNumero(precioBase);
		this.color = COLORES_DISPONIBLES[0];
		this.consumoEnergetico = CONSUMO_ENERGETICO[0];
		this.peso = ValidarNumero(peso);
	}

	//constructor con todos los valores
	
	public Electrodomesticos(double precioBase, String color, String consumoEnergetico, double peso) {
		
		this.precioBase = ValidarNumero(precioBase);
		this.color = ValidarValores(color, "colores");
		this.consumoEnergetico = ValidarValores(consumoEnergetico, "energia");
		this.peso = ValidarNumero(peso);
	}

	private double ValidarNumero(double numero) {
		double numeroNuevo = numero;

		do {
			try {

				if (numeroNuevo < 0) {
					System.err.println("valor invalido, introduzca uno valido");
					numeroNuevo = Double.parseDouble(sc.nextLine());
				}

			} catch (Exception e) {
				System.err.println("Introduce un dato valido");
			}

		} while (numeroNuevo < 0);

		return numeroNuevo;
	}

	
	private String ValidarValores(String valorEnviado, String tipo) {
		String valorFinal = valorEnviado;
		
		switch (tipo.toLowerCase()) {
		
		case "energia":
			
			while(true) {
			for (int i = 0; i < CONSUMO_ENERGETICO.length; i++) {
				
				try {
					if (valorFinal.toLowerCase().trim().equals(CONSUMO_ENERGETICO[i].toLowerCase().trim())) {
						return valorFinal;
					}
					
				}catch (Exception e) {
	
					System.err.println("Introduce un valor valido");
				}
			}
				System.out.println("Introduce un valor valido (F,E,D,C,B,A)");
				valorFinal = sc.nextLine();
			
			}
			
			
		case "colores":
			
			while(true) {
			for (int i = 0; i < COLORES_DISPONIBLES.length; i++) {
				
				try {
					if (valorFinal.toLowerCase().trim().equals(COLORES_DISPONIBLES[i].toLowerCase().trim())) {
						return valorFinal;
					}
					
				}catch (Exception e) {
	
					System.err.println("Introduce un valor valido");
				}
			}
				System.out.println("Introduce un color valido (blanco,rojo,azul,negro,gris)");
				valorFinal = sc.nextLine();
			
			}
			
		default:
			break;
		}
		
		return valorFinal;
		

	}
	
	public void EnseñarValores() {
		
	System.out.println("*-----------------------*");	
	System.out.println("Precio : " + precioBase);
	System.out.println("Color : " + color);
	System.out.println("Consumo : " + consumoEnergetico);
	System.out.println("peso : " +peso);
	System.out.println("*-----------------------*");
		
		
	}
}
