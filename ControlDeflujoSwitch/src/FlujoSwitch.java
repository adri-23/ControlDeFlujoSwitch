import java.util.Scanner;

public class FlujoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Switch (condicion) {
		 * case valor:
		 * codigo
		 * codigo
		 * codigo
		 * break;
		 * case 2:
		 * codigo
		 * codigo
		 * codigo
		 * break;
		 * default:
		 * codigo por defecto
		 */
		Scanner ingresar =new Scanner(System.in);
		int resultado = 0;
		System.out.println("ingrsar el primer numero");
		int numero1= ingresar.nextInt();
		System.out.println("ingresar el segundo numero");
		int numero2=ingresar.nextInt();
		System.out.println("1 : suma");
		System.out.println("2 : resta");
		System.out.println("3 : division");
		System.out.println("4 : muliplicacion");
		int operacion= ingresar.nextInt ();
		
	
			switch (operacion) {
				case 1: 
					resultado=numero1 + numero2;
					System.out.println("la suma es igual: " + resultado);
					break;
				case 2: 
					resultado=numero1 - numero2;
					System.out.println("la resta es igual: " + resultado);
					break;
				case 3: 
					resultado= numero1 * numero2;
					System.out.println("la multiplacacion es igual: " + resultado);
					break;
				case 4:
					resultado=numero1/numero2;
					System.out.println("la division es igual: " + resultado);
					break;
				default:
					System.out.println("error");
					break;
					
				
		}
	}

}
