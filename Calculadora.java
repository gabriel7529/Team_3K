import java.util.*;
class Calculadora {
	/*Primera funcion add*/	
	public static int add(int a , int b){
		return a + b; 	       
	}
	/*Segunda funcion sub*/
	public static int sub(int a , int b){ 
		return a-b;  
	}
	/*Tercera función mul*/
	public static int mul(int a, int b){
		return a*b;
	}
	/*Cuarta función div*/
	public static int div(int a, int b){ 
		return a/b; 
	}
	/*Quinta función mod*/
	public static int mod(int a, int b){ 
		return a%b; 
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
    int resultado;
		int operacion;
		System.out.println("¡¡Bienvenido a la calculadora!!");
		System.out.println("--------------------");
		System.out.println("| Operaciones:     |");
		System.out.println("| 1.Suma           |");
		System.out.println("| 2.Resta          |");
		System.out.println("| 3.Multiplicación |");
		System.out.println("| 4.Division       |");
		System.out.println("| 5.Módulo         |");
		System.out.println("--------------------");
		System.out.println("Ingrese el número de la operación que desea realizar: ");
    operacion = sc.nextInt();
    System.out.println("Ingrese los números:");
    System.out.println("Número 1 : ");
    a = sc.nextInt();
    System.out.println("Número 2: ");
    b = sc.nextInt();
    if (operacion == 1)
      resultado = add(a, b);

	} 
}


