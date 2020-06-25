Algoritmo tarea17Insercion
	Definir num Como Entero;
	Definir i, j Como Entero;
	Definir value Como Entero;
	//segun pdf
	Dimension num[5];
	num[0] = 52; num[1] = 80; num[2] = 1; num[3] = 40; num[4] = 4;
	
	Para i=1 hasta 4 Hacer 
		value = num[i];
		j = i - 1;
		Mientras (j>=0 y num[j]>value) Hacer
			num[j+1] = num[j];
			j = j - 1;
		FinMientras
		num[j+1] = value;
	FinPara
	
	Escribir "El orden es: ", num[0],", ", num[1],", " num[2],", " num[3],", " num[4];
	
FinAlgoritmo

