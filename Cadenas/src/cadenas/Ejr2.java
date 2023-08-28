package cadenas;
import java.util.Scanner;

public class Ejr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = "";
		System.out.print("Ingrese la cadena: ");
		scan.next(str);
		int bubu = 0;
		for(int i=0;i < str.length();i++)
		{
			char ac = scan.next().charAt(i);
			
			if(ac == 'a' ||ac == 'e' || ac == 'i' ||ac == 'o' || ac == 'u')
				bubu++;
		scan.close();
		}
		System.out.println("En la cadena ingresada tiene " + bubu +"vocales");
}
}
