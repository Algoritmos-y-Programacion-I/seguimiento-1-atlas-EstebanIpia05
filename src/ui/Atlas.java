/*
* Analisis
* Descripcion del programa:
* Entradas:
* Salidas: 
* Ejemplo:
*/

package ui;

import java.util.Scanner;

public class Atlas {

	private Scanner escaner;

    // Declaracion de constantes (completar)
    final double COSTO_TRAYECTO_AVION = 250000;


	private Atlas() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run()
	{   
        // Declaracion de info a pedir del usuario (completar)
        String nombre;
        String ciudad;
        int transp;
        // Saludo
        System.out.println("Bienvenido al programa de viajes EVENTOS ATLAS realizado por los estudiantes de Algoritmos y programacion I de la Universidad ICESI.");
        // Pedir info al usuario (completar)
        System.out.println("Cual es tu nombre?");
        nombre = escaner.nextLine();
        System.out.println("Cual es tu numero de documento");
        int doc = escaner.nextInt();
        System.out.println("Cual es tu edad");
        int edad = escaner.nextInt();
        System.out.println("Desde que ciudad nos contactas");
        ciudad = escaner.nextLine();
        System.out.println("Cuantas noches desea hospedarse (minimo 1 - maximo 4)");
        int noches = escaner.nextInt();
        System.out.println("BUS (1) o AVION (2)");
        int trans = escaner.nextInt();
        
        // ...
        



        // ...


        // Declaracion de salidas calculadas (completar)
        double totalTransporte;
        double totalHospedaje;

        // Calculo de salidas mediante metodos (completar)
        totalTransporte = calculartotalTransporte(500000);
        totalHospedaje = calculartotalHospedaje(noches*150000); // aqui podrian faltar parametros

        System.out.println("Bienvenido " + nombre + "!");
        System.out.println("Tu numero de documento es: " + doc);
        System.out.println("Tu edad es: " + edad);
        System.out.println("El total del hospedaje es: " + totalHospedaje);
        System.out.println("El total del transporte es: " + totalTransporte);
	}

	public static void main(String[] args) {
		Atlas mainApp = new Atlas();
		mainApp.run();
	}

    // Completar metodos para calcular salidas

    /**
	 * Descripción: El método ... permite calcular ...
	 * @param 
	 * @return 
	 */
    public double calcularTotalTransporte() {
        return 0;
   
    }

	

	
}