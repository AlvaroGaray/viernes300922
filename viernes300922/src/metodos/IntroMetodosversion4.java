package metodos;
import java.util.*;
public class IntroMetodosversion4 {

	public static void main(String[] args) {

		Scanner es=new Scanner(System.in);
		
		System.out.println("a= ");
		double a=es.nextDouble();
		System.out.println("b= ");
		double b=es.nextDouble();
		System.out.println("a= ");
		double c=es.nextDouble();
		
		CalcularRaicesCuadraticas(a,b,c);
		CalcularRaicesCuadraticas(2,3,1);
		
		es.close();

	}//Cierre del Main

	//MODIFICADOR DE ACCESO + TIPO DE DATO QUE VA A DEVOLVER EL METODO + NOMBRE DEL METODO + PARENTESIS() Y/O LISTA DE PARAMETROS DE ENTRADA

	//Definicion del metodo
	public static void CalcularRaicesCuadraticas(double a, double b, double c){
		//Cuerpo del metodo
		
		double discriminante=Math.pow(b, 2) - 4 * a * c;

		double x1= (-b + Math.sqrt(discriminante))/(2*a);
		double x2= (-b - Math.sqrt(discriminante))/(2*a);

		System.out.println(" X1 = "+x1);
		System.out.println(" X2 = "+x2);
		
		
	}

	
	
}//Cierre de la clase
