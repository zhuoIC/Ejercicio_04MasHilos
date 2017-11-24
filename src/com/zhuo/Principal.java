package com.zhuo;

public class Principal {
	public static void main(String[] args){
	Carrera carrera = new Carrera();
	Liebre liebre = new Liebre(carrera);
	Tortuga tortuga = new Tortuga(carrera);
	System.out.println("Empieza la carrera");
	liebre.start();
	tortuga.start();
	try {
		liebre.join();
		tortuga.join();

	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
