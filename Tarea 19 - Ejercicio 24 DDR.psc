Algoritmo ejercicio24DurodeRoer
	//El siguiente es el menú de un restaurante de bocadillos. 
	//Diseñar un algoritmo capaz de leer el número de unidades consumidas de cada alimento ordenado y calcular la cuenta total. 
	//Vamos a suponer que estos precios son fijos, es decir, que son constantes 
	//(recuerda que en PSeInt no se usa comas para separar la parte decimal de la parte entera).
	//Bocadillo de jamón	1,5 €
	//Refresco	1,05 €
	//Cerveza	0,75 €
	
	Definir plato Como Caracter;
	Definir precio Como Real;
	Definir unidades Como Entero;
	Definir total, subtotal Como Real;
	total = 0;
	
	Dimension plato[3];
	plato[0] = "Bocadillo de Jamon"; plato[1] = "Refresco"; plato[2] = "Cerveza";
	
	Dimension precio[3];
	precio[0] = 1.5; precio[1] = 1.05; precio[2] = 0.75;
	
	Para i=0 hasta 2 hacer
		Escribir "Ingrese cuantas unidades consumió de esta opción de menu: ", plato[i];
		Leer unidades;
		Si unidades>= 1 entonces
			subtotal = unidades * precio[i];
			total = total + subtotal;
			Escribir "Por ahora vamos... ", total;
		SiNo
			subtotal = 0;
		FinSi
		
	FinPara
	
	Escribir "El total a abonar es de ", total, " pesos.";
	
FinAlgoritmo
