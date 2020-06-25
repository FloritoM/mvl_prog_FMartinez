Algoritmo ejercicio27DDRalumnos
	//Calcular la nota de N alumnos, introduciendo su nota teórica (60%) y su nota practica (40%). 
	//Mostrarlo por pantalla.
	Definir respuesta Como Caracter;
	Definir notaTeorica, notaPractica Como Real;
	Definir notaFinal Como Real;
	Definir notaTeoricaPorcentaje, notaPracticaPorcentaje Como Real;
	Definir notaP, notaT Como Logico;
	//En mi configuracion esta permitido usar variables sin inicializar... por si las pide:
	//notaTeoricaPorcentaje = 0;
	//notaPracticaPorcentaje = 0;
	
	Escribir "La siguiente aplicacion debe utilizarse solo aplicando valores desde el 0 hasta el 10.";
	Escribir "Al momento de ingresar las respuestas se debe responder tipeando si o no.";
	
	
	Hacer
		Escribir "Ingrese la nota teorica del alumno: "; 
		Leer notaTeorica;
		Escribir "Ingrese la nota practica del alumno: ";
		Leer notaPractica;
		
		Si notaTeorica <= 10 y notaTeorica >= 0 entonces
			notaT = Verdadero;
			notaTeoricaPorcentaje = notaTeorica * 0.60;
			
		SiNo
			Escribir "** Nota teorica ingresada invalida!";
		FinSi
		
		Si notaPractica <= 10 y notaPractica >= 0 entonces
			notaP = Verdadero;
			notaPracticaPorcentaje = notaPractica * 0.40;
			
		SiNo
			Escribir "** Nota practica ingresada invalida!";
		FinSi		
		
		Si (notaP == Verdadero) y (notaT == Verdadero) entonces
			notaFinal = notaPracticaPorcentaje + notaTeoricaPorcentaje;	
			Escribir "La nota final del alumno es: ", notaFinal;
		SiNo
			Escribir "ERROR: intente ingresando notas dentro del rango indicado.";
		FinSi
		
		Escribir "Continuar con el programa?";
		Leer respuesta;
	Hasta Que respuesta == "no";
	
FinAlgoritmo
