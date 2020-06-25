Algoritmo promedioAlumnos
	Definir alumnos Como Real;
	Definir altura Como Real;
	Definir promedio Como Real;
	Definir valoresAlturas Como Real;
	valoresAlturas = 0;
	Definir i Como Entero;
	
	Dimension alumnos[15];
	
	Para i=0 hasta 14 Hacer
		Escribir "Ingrese la altura del alumno numero ", i+1;
		Leer alumnos[i];
		valoresAlturas = valoresAlturas + alumnos[i];
	FinPara
	
	promedio = valoresAlturas/15;
	Escribir "El promedio de las alturas de los alumnos es de: ",promedio;
FinAlgoritmo
