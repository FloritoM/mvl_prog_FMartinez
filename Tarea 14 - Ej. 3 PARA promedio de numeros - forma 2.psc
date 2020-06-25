Algoritmo promedioNumerosConPara
	Definir num_user Como Real;
	Definir total Como Real;
	Definir promedio Como Real;
	Definir i Como Entero;
	
	total = 0;
	
	Para i=1 hasta 4 Hacer
		Escribir "Ingrese un número: ";
		Leer num_user;
		total = total + num_user;
	FinPara
	
	promedio = (total/4);
	Escribir "El promedio es: ", promedio;
	
FinAlgoritmo
