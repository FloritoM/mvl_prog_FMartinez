Algoritmo tarea17PNG
	Definir colorAula Como Caracter;
	Definir cantBancos Como Entero;
	Definir cantAlumnos Como Entero;
	Definir  i, j Como Entero;
	
	
	Dimension  colorAula[3];
	colorAula[0] = "Azul";
	colorAula[1] = "Verde";
	colorAula[2] = "Amarillo";
	
	Dimension cantBancos[3];
	cantBancos[0] = 40;
	cantBancos[1] = 35;
	cantBancos[2] = 30;
	
	para i=0 hasta 4
		Escribir "Ingrese la cantidad de alumnos a asignar aula: ";
		Leer cantAlumnos;
		Si cantAlumnos <= 40 y cantAlumnos > 35 Entonces
			Escribir "El aula asignada es: ", colorAula[0];
		FinSi
		Si cantAlumnos <= 35 y cantAlumnos > 30 Entonces
			Escribir "El aula asignada es: ", colorAula[1];
		FinSi
		Si cantAlumnos <= 30 Entonces
			Escribir "El aula asignada es: ", colorAula[2];
		FinSi
	FinPara
	
	
	
FinAlgoritmo
