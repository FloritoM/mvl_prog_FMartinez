Algoritmo tablaMientras
	Definir num_tabla Como Entero;
	Definir num_limite Como Entero;
	Definir resultado Como Entero;
	Definir contador Como Entero;
	
	contador = 0;
	
	Escribir "Ingrese el n�mero de tabla que quiere visualizar: ";
	Leer num_tabla;
	Escribir "Ingrese hasta que n�mero se visualiza la multiplicaci�n en la tabla: ";
	Leer num_limite;
	
	Mientras num_limite>contador
		contador = contador + 1;
		resultado = (num_tabla * contador);
		Escribir num_tabla, " x ", contador, " = ", resultado;
	FinMientras
FinAlgoritmo
