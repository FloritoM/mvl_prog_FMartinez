Algoritmo tarea18BusquedaBinaria
    Definir inicio, final, num, mitad, listaNum Como Entero;
    Definir encontrado Como Logico;
    
	Dimension listaNum[5];
    listaNum[0] = 3; listaNum[1]  = 15; listaNum[2]  = 21; listaNum[3] = 33; listaNum[4] = 50; 
	//declaro los números que están en mi array, no son por azar: y además están ordenados de menor a mayor, como se requiere.
	inicio = 0; //sabiendo la dimensión de mi array, yo declaro los índices de inicio y final, números que usa esta técnica de búsqueda.
    final = 4;
    
    encontrado=falso; //variable lógica primero declarada: quiere decir que aun no tenemos el número ubicado. Variable que puede cambiar de valor mas adelante.
    
	Escribir "Ingrese el número a buscar en el array: ";
    leer num;
	// En la estructura Mientras: se usa el trunc para usar como entero el resultado de la operación.
	
	Mientras (encontrado = falso y inicio <= final) hacer //inicio <= final --> quiere decir que esté dentro del rango de valores de mi array.        
		mitad = TRUNC((inicio+final)/2); //busco la 'mitad' del array, para ver luego si se sigue buscando para la izquierda o derecha.
        si num == listaNum[mitad] entonces //si el numero ingresado por el user es igual a la mitad calculada entonces...
            encontrado = Verdadero; //ya está ubicado mi número. ***
        SiNo //si el número ingresado no es ese entonces se hace...
            Si num < listaNum[mitad] entonces //si el número es menor al valor 'mitad', se usa ese segmento de array (de la mitad para la izquierda) 
                final = mitad -1; 
            SiNo
                inicio = mitad + 1; //si el número es mayor al valor 'mitad', se usa ese segmento de array (de la mitad para la derecha) 
            FinSi
            
        FinSi
    FinMientras
    
	Si encontrado == Verdadero Entonces //***si ya esta encontrado el número ingresado (condición cumplida en la estructura anterior)entonces...
        Escribir "Su número se encuentra en el índice: ",mitad," de la lista"; //indica donde está: el valor mitad cambió por el índice del numero ingresado.
    SiNo
        Escribir "El número ingresado no se encuentra en la lista"; //si no se cumple la condicion de encontrado = Verdadero, entonces es encontrado = Falso...
    FinSi //...Por lo que no hay resultado: solo la respuesta de que no está en mi lista.
	
FinAlgoritmo
