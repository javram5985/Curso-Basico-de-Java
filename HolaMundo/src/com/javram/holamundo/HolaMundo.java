package com.javram.holamundo;
//Uper Camel Case nombre de clases 
public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo");
		
		//Enteros
		byte edad = 127;
		short year = 32767;
		int id_User = 1001;
		long id_Twitter = 2134564231315L;//L para identificar que es un long, sino lo toma como un int
		
		//Decimales
		float diametro = 34.25F;//F para identificar que es un float, sino lo toma como double
		double precio = 12345.12345641315;
		
		//Texto
		char genero = 'F';//una comilla no dos comillas
		
		//Logico
		boolean isVisible = true; 
		boolean funciona = false; 
		
		//Variables
		int varibale = 2;
		int _variable = 1;
		int $variable = 3;
		int variable1 = 4;
		
		//Constantes
		int VALOR = 0;
		int VALOR_MAXIMO = 1;
		
		//Lower Camel Case
		int minValor = 4;
		
		//Upper Camel Case
		int MinValor = 6;
		
		//Casting implicito (automatico, ver foto)
		byte b = 6;
		short s = b;
		
		//Casting explicito (ver foto, casteo)
		b = (byte) s;
		
		//Mas ejemplos de Casting
		int i = 1;
		double d = 2.5;
		i = (int) d;
		
		int codigo = 97;
		char codigoASCII = (char) codigo;
		
		//Arrays, declaracion de arrays:
		int[] arregloInt = new int[3];//new es para iniciar el arreglo, siempre lo tiene que tener
		double arregloDouble[];
		int[][] array2D = new int[2][3];//array de dos dimensiones, 3 columnas y 2 filas, caben 2*3 = 6 elementos
		int[][][] array3D = new int[3][3][2];//array de tres dimensiones, 3 filas, 3 columnas, 2 altura, caben 3*3*2 = 18 elementos
		char[][] days = {{'M', 'T', 'W'}, {'M', 'T', 'W'}};//otra forma de declarar arreglos
		
		//Asignar valores a los arrays y encontrarlos
		char[] names = new char[4];
		names[0] = 'h';
		names[1] = 'o';
		names[2] = 'l';
		names[3] = 'a';
		System.out.println(names[0]);		
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		
		char[][][][] monkey = new char[2][3][2][2];//ver video 18
		monkey[1][0][0][1] = 'M';
		System.out.println(monkey[1][0][0][1]);
		
		//Operaciones Aritmeticas
		int a = 1;
		int aa = a + a;
		System.out.println("El valor de aa: " + aa);
		
		double x = 2.56;
		int y = 9;
		
		float w = (float) x + y;
		System.out.println(w);
		System.out.println(w * 2);
		
		double k = 4 / 0.00002;
		System.out.println(k);
		System.out.println(7 % 2);
		
		//Operadores de asignacion
		int f  = 2;
		int g = 3;
		f += g;// f = f + g, pero es mejor usar el += para no repetir la variable f y asi salvar mas memoria
		System.out.println(f);
		
		//Operadores incremento, decremento
		int l = 1;
		System.out.println(l++); // esto imprime  el valor "1" por que solo imprime la variable 
		System.out.println(l); // esto imprime 2, por que es el resultado después del incremento

		int o = 1;
		System.out.println(++o); // esto imprime  el valor "2" por que primero incrementa la variable
		System.out.println(o); // esto imprime 2 por que es el resultado de haber incrementado la variable.

		int p= 2;
		boolean verificacion = p++ > 2;
		System.out.println(verificacion); // Imprime FALSE
		System.out.println(p); // el valor de la variable es 3.
						// Esto se debe por que primero utiliza la variable y luego la incrementa
		
		//Operadores de equidad
		int q = 5;
		int v = 4;
		System.out.println(q != p);
						// == operador de equidad, != operador de desigualdad
		
		//Operadores Relacionales
		System.out.println("q > p ->" + (q > p));
		System.out.println("q < p ->" + (q < p));
		System.out.println("q >= p ->" + (q >= p));
		System.out.println("q <= p ->" + (q <= p));
		
		//Operadores Logicos
		boolean n = false;
		boolean m = true;
		System.out.println("n && m ->" + (n && m));
		System.out.println("n || m ->" + (n || m));
		System.out.println("!n ->" + (!n));
		System.out.println("!m ->" + (!m));
		
		//Control de Flujo
		//If/else
		if(q > v)
		{
			//true
			System.out.println("Si es mayor");
		}
		else
		{
			//false
			System.out.println("No es mayor");
		}
		//Switch
		int mes = 4;
		switch(mes)
		{
			case 1:
				System.out.println("Enero");
				break;
			case 2:
				System.out.println("Febrero");
				break;
			case 3:
				System.out.println("Marzo");
				break;
			case 4:
				System.out.println("Abril");
				break;
			case 5:
				System.out.println("Mayo");
				break;
			case 6:
				System.out.println("Junio");
				break;
			case 7:
				System.out.println("Julio");
				break;
			case 8:
				System.out.println("Agosto");
				break;
			case 9:
				System.out.println("Septiembre");
				break;
			case 10:
				System.out.println("Octubre");
				break;
			case 11:
				System.out.println("Noviembre");
				break;
			case 12:
				System.out.println("Diciembre");
				break;
			default:
				System.out.println("Este no es un mes");
		}
		//Bucle while
		int e = 1;
		while(e <= 5)
		{
			System.out.println("e es menor o igual que 5");
			e++;
		}
		
		//Bucle for
		int[] numeros = new int[5];
		for(int c = 0; c < 5; c++)
		{
			numeros[c] = c;
			System.out.println("numeros["+c+"]:" + numeros[c]);
		}
		
		//Bucle for each
		for(int j : numeros)
		{
			System.out.println(j);
		}
		System.out.println();
		
		//ciclos for anidados
		//Definimos un array de 3 filas x 5 columnas
        int array[][]={{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};
 
        for (int z = 0; z <  array.length; z++){
            for(int t = 0; t < array[0].length; t++){
                System.out.println(array[z][t]);
            }
        }
		
		
	}

}

//control space para ayuda de codigo
//ver marcador en platzi, acordate del package y la class
//para el package normalmente se escribe el dominio de la empresa
//class es para crear una clase y no escribir mucho codigo, como el ejemplo de HolaMundo