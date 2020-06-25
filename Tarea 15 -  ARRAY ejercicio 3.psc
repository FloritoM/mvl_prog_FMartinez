Algoritmo estadisticaHyM
	Definir personas Como Caracter;
	Definir cantMujeres Como Entero;
	Definir cantHombres Como Entero;
	Definir porcMujeres Como Real;
	Definir opcionElegida Como Entero;
	Definir i Como Entero;
	cantHombres = 0;
	cantMujeres = 0;
	Dimension personas[30];
	
	personas[0] = "H"; personas[1] = "H"; personas[2] = "M"; personas[3] = "M"; personas[4] = "H"; 
	personas[5] = "M"; personas[6] = "M"; personas[7] = "M"; personas[8] = "M"; personas[9] = "M";
	personas[10] = "M"; personas[11] = "H"; personas[12] = "M"; personas[13] = "H"; personas[14] = "H";
	personas[15] = "M"; personas[16] = "H"; personas[17] = "M"; personas[18] = "M"; personas[19] = "M";
	personas[20] = "H"; personas[21] = "H"; personas[22] = "M"; personas[23] = "H"; personas[24] = "H";
	personas[25] = "H"; personas[26] = "M"; personas[27] = "M"; personas[28] = "H"; personas[29] = "M";

	Para i=0 hasta 29 Hacer
		Si (personas[i] == "M") Entonces
			cantMujeres = cantMujeres + 1;
		SiNo
			cantHombres = cantHombres + 1;
		FinSi
	FinPara
	
	Escribir "El total de mujeres es de ", cantMujeres;
	Escribir "El total de hombres es de ", cantHombres;
	
	porcMujeres = (cantMujeres * 100)/30;
	
	Escribir "El porcentaje de mujeres en el grupo es de ", porcMujeres, "%";
	
	
	
FinAlgoritmo
