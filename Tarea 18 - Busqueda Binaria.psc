Algoritmo tarea18BusquedaBinaria
    Definir inicio, final, num, mitad, listaNum Como Entero;
    Definir encontrado Como Logico;
    
	Dimension listaNum[5];
    listaNum[0] = 3; listaNum[1]  = 15; listaNum[2]  = 21; listaNum[3] = 33; listaNum[4] = 50; 
	//declaro los n�meros que est�n en mi array, no son por azar: y adem�s est�n ordenados de menor a mayor, como se requiere.
	inicio = 0; //sabiendo la dimensi�n de mi array, yo declaro los �ndices de inicio y final, n�meros que usa esta t�cnica de b�squeda.
    final = 4;
    
    encontrado=falso; //variable l�gica primero declarada: quiere decir que aun no tenemos el n�mero ubicado. Variable que puede cambiar de valor mas adelante.
    
	Escribir "Ingrese el n�mero a buscar en el array: ";
    leer num;
	// En la estructura Mientras: se usa el trunc para usar como entero el resultado de la operaci�n.
	
	Mientras (encontrado = falso y inicio <= final) hacer //inicio <= final --> quiere decir que est� dentro del rango de valores de mi array.        
		mitad = TRUNC((inicio+final)/2); //busco la 'mitad' del array, para ver luego si se sigue buscando para la izquierda o derecha.
        si num == listaNum[mitad] entonces //si el numero ingresado por el user es igual a la mitad calculada entonces...
            encontrado = Verdadero; //ya est� ubicado mi n�mero. ***
        SiNo //si el n�mero ingresado no es ese entonces se hace...
            Si num < listaNum[mitad] entonces //si el n�mero es menor al valor 'mitad', se usa ese segmento de array (de la mitad para la izquierda) 
                final = mitad -1; 
            SiNo
                inicio = mitad + 1; //si el n�mero es mayor al valor 'mitad', se usa ese segmento de array (de la mitad para la derecha) 
            FinSi
            
        FinSi
    FinMientras
    
	Si encontrado == Verdadero Entonces //***si ya esta encontrado el n�mero ingresado (condici�n cumplida en la estructura anterior)entonces...
        Escribir "Su n�mero se encuentra en el �ndice: ",mitad," de la lista"; //indica donde est�: el valor mitad cambi� por el �ndice del numero ingresado.
    SiNo
        Escribir "El n�mero ingresado no se encuentra en la lista"; //si no se cumple la condicion de encontrado = Verdadero, entonces es encontrado = Falso...
    FinSi //...Por lo que no hay resultado: solo la respuesta de que no est� en mi lista.
	
FinAlgoritmo
