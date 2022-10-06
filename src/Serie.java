import java.util.Scanner;

public class Serie {

	static public Scanner sc = new Scanner(System.in);
	
	private String titulo;
	private int numeroTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	
	public Serie() {
		this.titulo = "";
		this.numeroTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}
	
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.numeroTemporadas = 3;
		this.entregado = false;
		this.genero = "";
	}


	public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = ValidarNumero(numeroTemporadas);
		this.entregado = false;
		this.genero = genero;
		this.creador = creador;
	}
	
	
	
	
	private int ValidarNumero(int numero) {
		int numeroNuevo = numero;

		do {
			try {

				if (numeroNuevo < 0) {
					System.err.println("valor invalido, introduzca uno valido");
					numeroNuevo = Integer.parseInt(sc.nextLine());
				}

			} catch (Exception e) {
				System.err.println("Introduce un dato valido");
			}

		} while (numeroNuevo < 0);

		return numeroNuevo;
	}

	public void EnseñarValores() {
		
	System.out.println("*-----------------------*");	
	System.out.println("Titulo : " + titulo);
	System.out.println("Numero Temporadas : " + numeroTemporadas);
	System.out.println("Entregado : " + entregado);
	System.out.println("Genero : " + genero);
	System.out.println("Creador : " + creador);
	System.out.println("*-----------------------*");
		
		
	}
	
	
}
