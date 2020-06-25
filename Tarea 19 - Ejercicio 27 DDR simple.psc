Algoritmo ejercicio27DDR
	//Calcular la nota de N alumnos, introduciendo su nota teórica (60%) y su nota practica (40%). 
	//Mostrarlo por pantalla.	
	Definir respuesta Como Caracter;
	Definir notaTeorica, notaPractica Como Real;
	Definir notaFinal Como Real;
	Definir notaTeoricaPorcentaje, notaPracticaPorcentaje Como Real;
	
	
	Escribir "La siguiente aplicacion debe utilizarse solo aplicando valores desde el 0 hasta el 10";
	Escribir "Al momento de ingresar las respuestas se debe responder tipeando si o no";
	
	
	Hacer
		Escribir "Ingrese la nota teorica del alumno: "; //poner si anidado para sacar las notas fuera de rango
		Leer notaTeorica;
		Escribir "Ingrese la nota practica del alumno: ";
		Leer notaPractica;
		notaTeoricaPorcentaje = notaTeorica * 0.60;
		notaPracticaPorcentaje = notaPractica * 0.40;
		notaFinal = notaPracticaPorcentaje + notaTeoricaPorcentaje;
		Escribir "La nota final del alumno es: ", notaFinal;
	
	
		Escribir "Continuar con el programa?";
		Leer respuesta;
	Hasta Que respuesta == "no";
	
FinAlgoritmo
