Algoritmo tarea17Seleccion
	Definir seleccion Como Entero;
	Definir i, j Como Entero;
	Definir aux Como Entero;
	Definir minimo Como Entero;
	
	Dimension seleccion[5];
	seleccion[0] = 80; 
	seleccion[1] = 30; 
	seleccion[2] = 40; 
	seleccion[3] = 20; 
	seleccion[4] = 100;
	
	Para i=0 hasta 3
		minimo = i;
		Para j=i+1 Hasta 4
			si (seleccion[j] < seleccion[minimo]) Entonces
				minimo = j;
			FinSi
		FinPara
		aux = seleccion[minimo];
		seleccion[minimo] = seleccion[i];
		seleccion[i] = aux;
	FinPara
	
	Escribir "El orden es: ", seleccion[0],", ", seleccion[1],", " seleccion[2],", " seleccion[3],", " seleccion[4];
	
FinAlgoritmo
