Algoritmo promedioPara
	Definir num1, num2, num3, num4 Como Real;
	Definir total Como Real;
	Definir promedio Como Real;
	Definir i Como Entero;
	
	Para i=1 hasta 4 Hacer
		Escribir "Ingrese el n�mero: ", i;
		Segun i
			1: Leer num1;
			2: Leer num2;
			3: Leer num3;
			4: Leer num4;
		FinSegun
	FinPara
	
	total = num1 + num2 + num3 + num4;
	promedio = total/4;
	Escribir "El promedio de sus n�meros es: ", promedio;
	
	
FinAlgoritmo
