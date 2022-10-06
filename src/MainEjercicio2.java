import java.util.Scanner;

public class MainEjercicio2 {

	static public Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Password passwordLongitud8 = new Password();
		Password passwordLongitudX;
		
		System.out.println("Longitud para generar la contraseña");
		passwordLongitudX = new Password(sc.nextInt());
		
		
		passwordLongitud8.GetAll();
		System.out.println("----------------");
		passwordLongitudX.GetAll();
		
		
	}

}
