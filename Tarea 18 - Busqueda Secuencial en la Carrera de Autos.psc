Algoritmo tarea18CarrerasyPilotos
	//NO PUDE HACER LA SEGUNDA PARTE DEL EJERCICIO. :(
	Definir tiemposCarrera Como Entero;
	Definir i, j Como Entero;
	Definir value Como Entero;
	Definir pilotos Como Caracter;
	
	Dimension tiemposCarrera[5];
	tiemposCarrera[0] = 40; tiemposCarrera[1] = 36; tiemposCarrera[2] = 34; tiemposCarrera[3] = 35; tiemposCarrera[4] = 39;
	
	Dimension pilotos[5];
	pilotos[0] = "Pepe"; pilotos[1] = "Juanin"; pilotos[2] = "Manolo"; pilotos[3] = "Palomo" ; pilotos[4] = "Jorgito"; 
	
	
	Para i=1 hasta 4 Hacer 
		value = tiemposCarrera[i];
		j = i - 1;
		Mientras (j>=0 y tiemposCarrera[j]>value) Hacer
			tiemposCarrera[j+1] = tiemposCarrera[j];
			j = j - 1;
		FinMientras
		tiemposCarrera[j+1] = value;
		
	FinPara
	
	
	Escribir "Al auto más veloz le demoró ",tiemposCarrera[0], " segundos en llegar a la meta."; 
	
	//Para i=0 hasta 4 hacer
		//Si i == tiemposCarrera[0] entonces
			//Escribir "El piloto del auto es ", pilotos[i]; 
		//FinSi
	//FinPara
	
	
	
	
	
	
FinAlgoritmo
