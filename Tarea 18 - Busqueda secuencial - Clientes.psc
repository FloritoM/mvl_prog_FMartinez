Algoritmo tarea18BusquedaClientes
	Definir listaClientes, c Como Caracter;
	
	Dimension listaClientes[5];
	listaClientes[0] = "Martin";
	listaClientes[1] = "Flora";
	listaClientes[2] = "Ana";
	listaClientes[3] = "Pedro";
	listaClientes[4] = "Sofia";
	
	Escribir "Ingrese el nombre del cliente a buscar: ";
	Escribir "- Recuerde que el programa diferencia entre mayusculas y minusculas -";
	Leer c;
	seEncontro = Falso;
	
	
	Para i=0 hasta 4
		Si listaClientes[i] == c Entonces
			seEncontro = Verdadero;
			Escribir "Se encontro el cliente ", c, " en la lista!";
			Escribir "Se encuentra en el indice ", i;
		FinSi
	FinPara
	
	
	
FinAlgoritmo
