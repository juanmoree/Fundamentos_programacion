package gastoluz;
import java.util.Scanner;

public class Gastoluz {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner datos = new Scanner(System.in);
	    System.out.println("Introduzca el precio de la luz (Con punto en el decimal), seguido de la tecla enter ");
	    float precioLuz = datos.nextFloat();
	    System.out.println("Introduzca 1 para 500w y 2 para 800w");
	    float w = datos.nextInt();
	    int vatios = 0;
	    if (w > 2) {
	    	System.out.println("Introdujo mal el numero de w, vuelva a empezar");
	    }
	    if (w == 1)
	    	vatios = 500;
	    if (w == 2)
	    	vatios = 800;
	    	float res = precioLuz / 1000 * vatios;
	    System.out.println("Su consumo por hora es:" +res+ "€");
	}
}
