import java.util.Scanner;
public class decision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner mi_escaner= new Scanner(System.in);
System.out.println("Ingrese un numero:");
int num= mi_escaner.nextInt();
switch (num)
{ case 1:
	System.out.println("Es un uno");
break;
case 2:
	System.out.println("Es un Dos");
break;
case 3:
	System.out.println("Es un tres");
break;
default:
	System.out.println("Es otro Numero");
	break;
	
	System.out.println("Ingrese un animal");
	String animal= mi_escaner.next();
	switch (animal)
	{
	case "perro":
		System.out.println("Guau");
		break;
	case "Gato":
		System.out.println("Miaauu");
		break;
	case "Pato":
		System.out.print("Cuack");
		break;
	default:
		System.out.println("Es otro Numero");
		break;
	}
	
}
	}

}
