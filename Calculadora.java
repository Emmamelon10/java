package milanguche;
import java.util.Scanner;
public class Ejercicio1 {
	private static void sanguinesa() {
		int num1=0, num2=0, resul = 0;
		char opr;
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserte el primer num: ");
		num1= scan.nextInt();
		System.out.println("Inserte el segundo num: ");
		num2 = scan.nextInt();
		System.out.println("Insterte la oprecaion deseada:\na.Suma\nb.Resta\nc.Multiplicacion\nd.Division");
		opr = (char) scan.nextByte();
		switch(opr)
		{
			case 'a':
				resul = num1 + num2;
				break;
			case 'b':
				resul = num1 - num2;
				break;
			case 'c':
				resul = num1 * num2;
				break;
			case 'd': 
				resul = num1 / num2;
				break;
			default: 
				System.out.println("ERROR: Operacion Desconocida...\n ");
				break;
		}
		System.out.print(resul);
		scan.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1=0, num2=0, resul = 0;
		char opr;
		System.out.println("Inserte el primer num: ");
		num1= scan.nextInt();
		System.out.println("Inserte el segundo num: ");
		num2 = scan.nextInt();
		System.out.println("Insterte la oprecaion deseada:\na.Suma\nb.Resta\nc.Multiplicacion\nd.Division");
		opr = (char) scan.nextByte();
		switch(opr)
		{
			case 'a':
				resul = num1 + num2;
				break;
			case 'b':
				resul = num1 - num2;
				break;
			case 'c':
				resul = num1 * num2;
				break;
			case 'd': 
				resul = num1 / num2;
				break;
				default: 
					System.out.println("ERROR: Operacion Desconocida...\n ");
					break;

		}
		System.out.println(resul);
			
			scan.close();
	}

}
