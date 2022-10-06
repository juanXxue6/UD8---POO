import java.security.SecureRandom;
import java.util.Random;

public class Password {

	
    static final String CHARS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ?¿+$%@";
    
    
	private int longitud;
	private String password;
	
	
	public Password() {
		
		this.longitud = 8;
		this.password = GeneratePassword(longitud) ;
	}
	
	
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.password = GeneratePassword(longitud);
	}

	
	private String GeneratePassword(int longitud) {

        Random random = new Random();
        String contraseña = "";
 
        for (int i = 0; i < longitud; i++)
        {
            int charsIndex = random.nextInt(CHARS.length());
            contraseña = contraseña + CHARS.charAt(charsIndex);
        }
 
        return contraseña;
	}


	public void GetAll() {
		System.out.println("Longitud: " + longitud);
		System.out.println("Contraseña " + password);
	}
	
}
