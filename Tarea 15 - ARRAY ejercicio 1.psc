Algoritmo butacasCine
	Definir butacas Como Logico;
	Definir butacasLibres Como Entero;
	Definir butacasOcupadas Como Entero;
	Definir i Como Entero;
	Dimension butacas[7];
	butacasLibres = 0;
	butacasOcupadas = 0;
	
	butacas[0] = Verdadero; //ocupada
	butacas[1] = Falso; //libre
	butacas[2] = Falso;
	butacas[3] = Verdadero;
	butacas[4] = Falso;
	butacas[5] = Verdadero;
	butacas[6] = Verdadero;
	
	Para i=0 hasta 6 Hacer
		Si (butacas[i] == Verdadero) Entonces
			butacasOcupadas = butacasOcupadas + 1;
		SiNo
			butacasLibres = butacasLibres + 1;
		FinSi
	FinPara
	
	Escribir "El total de butacas libres es de ", butacasLibres, " y el total de ocupadas es de ", butacasOcupadas;
	
FinAlgoritmo
