SubProceso denominador <- DenominadorCalculoResistenciaTotal (numeroResistencias)
	
	Definir denominador, resistencia Como Real;
	Definir i Como Entero;
	
	denominador <- 0;
	
	Para i <- 1 Hasta numeroResistencias Con Paso 1 Hacer
		
		Escribir "Ingresa un valor positivo >0, de la resistencia ", i, ": ";
		Leer resistencia;
		
		Si resistencia > 0 Entonces
			denominador <- denominador + (1/resistencia);
		SiNo
			Mientras resistencia <= 0 Hacer
				Escribir "Ingresa un valor positivo >0, de la resistencia ", i, ": ";
				Leer resistencia;
			FinMientras
			denominador <- denominador + (1/resistencia);
		FinSi
		
	FinPara
	
FinSubProceso

Proceso calculoResistencia
	
	Definir numeroResistencias Como Entero;
	Definir ResistenciaTotal Como Real;
	
	Escribir "Para cuantas resistencias calcularemos la Resistencia Total: ";
	Leer numeroResistencias;
	Si numeroResistencias >= 1  Entonces
		ResistenciaTotal <- 1/DenominadorCalculoResistenciaTotal(numeroResistencias);
		Escribir "La Resistencia Total de los ", numeroResistencias, " elementos es: ", ResistenciaTotal;
	SiNo
		Escribir "Ingresar numeros enteros > a 0";
		Leer numeroResistencias;
		Mientras numeroResistencias < 1 Hacer
			Escribir "Ingresar numeros enteros > a 0";
			Leer numeroResistencias;
		FinMientras
		ResistenciaTotal <- 1/DenominadorCalculoResistenciaTotal(numeroResistencias);
		Escribir "La Resistencia Total de los ", numeroResistencias, " elementos es: ", ResistenciaTotal;
	FinSi
	
FinProceso