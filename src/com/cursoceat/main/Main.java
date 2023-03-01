package com.cursoceat.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//objetos
	Bombilla salon=new Bombilla();
	Bombilla hab1=new Bombilla();
	Bombilla cocina=new Bombilla();
	Bombilla banio=new Bombilla();
	Bombilla hab2 =new Bombilla();
	Bombilla terraza =new Bombilla();
	
	int opcion;
	Scanner entrada = new Scanner(System.in);
		do {
	System.out.println(" ¿Qué bombilla quieres utilizar?");
	System.out.println("-----------------------------------");
	System.out.println(" 1- Salón:" + salon.mostrarEstado());
	System.out.println(" 2- Cocina:" + cocina.mostrarEstado());
	System.out.println(" 3- Baño:"+ banio.mostrarEstado());
	System.out.println(" 4- Habitación principal:"+ hab1.mostrarEstado());
	System.out.println(" 5- Habitación auxiliar:"+ hab2.mostrarEstado());
	System.out.println(" 6- Terraza:"+ terraza.mostrarEstado());
	//en este caso llamamos a la clase y no al objeto
	System.out.println(" 7- Interruptor general: " + Bombilla.interruptorGeneral);
	System.out.println("-----------------------------------");
	System.out.println(" 8- Salir ");
	System.out.println("-----------------------------------");
	opcion = entrada.nextInt();
	String mensaje="La bombilla está";
	
	switch (opcion) {
	case 1-> salon.encenderOapagar();
	case 2-> cocina.encenderOapagar();
	case 3-> banio.encenderOapagar();
	case 4-> hab1.encenderOapagar();
	case 5-> hab2.encenderOapagar();
	case 6-> terraza.encenderOapagar();
	case 7->{
		if(Bombilla.interruptorGeneral) {
			Bombilla.interruptorGeneral=false ;
		}else {
			Bombilla.interruptorGeneral=true;
		}
		}
	case 8->{
		System.out.println("  Hasta luego");
	}
	default -> {
		System.err.println("  Opción no válida");
	}
	}
	
	
		}while(opcion!=8);
		
		
	}

}
