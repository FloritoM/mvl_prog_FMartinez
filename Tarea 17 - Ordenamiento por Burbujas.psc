Algoritmo tarea
	Definir burbujas Como Entero;
	Definir i, j Como Entero;
	Definir aux Como Entero;
	Definir intercambiado Como Logico;
	//segun pdf
	Dimension burbujas[5];
	burbujas[0] = 100; burbujas[1] = 1; burbujas[2] = 3; burbujas[3] = 499; burbujas[4] = 8000; //si aca pongo por ejemplo 10 u 80, no me ordena bien el array ¿?
	
	Repetir
		intercambiado = falso;
		Para i=1 hasta 4
			Si (burbujas[i-1] > burbujas[i]) Entonces
				aux = burbujas[i-1];
				burbujas[i-1] = burbujas[i];
				burbujas[i] = aux;
				intercambiado = verdadero;
			FinSi			
		FinPara
	Hasta Que (intercambiado == Verdadero);
	
	Escribir "El orden según esta técnica es: ", burbujas[0],", ", burbujas[1],", " burbujas[2],", " burbujas[3],", " burbujas[4];
	
FinAlgoritmo
