package com.zhuo;

import java.util.Random;

public class Carrera {
	private boolean end = false;
	private Random random;
	
	public Carrera(){
		random = new Random();
		
	}
	
	public void empezarLiebre(Liebre liebre){
		while (!end){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			float probabilidad = random.nextFloat() * 99;
			if(probabilidad >= 80){
				liebre.resbalonPequeno();
			}
			else if(probabilidad >= 50){
				liebre.pequenoSalto();
			}
			else if(probabilidad >= 40){
				liebre.resbalonGrande();
			}
			else if (probabilidad >=20) {
				liebre.granSalto();
			}
			else{
				liebre.duerme();
			}
			for (int i = 0; i < liebre.getCasilla(); i++) {
				if (i != liebre.getCasilla() -1) {
					System.out.print(" ");
				} else {
					System.out.println("L");
				}
			}
			if(liebre.getCasilla() == 70){
				System.out.println("Gana la liebre");
				end  = true;
			}
		}
	}

	public void empezarTortuga(Tortuga tortuga){
		while (!end){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			float probabilidad = random.nextFloat() * 99;
			
			if(probabilidad >= 70){
				tortuga.avanceLento();
			}
			else if(probabilidad >= 50){
				tortuga.resbalon();
			}
			else{
				tortuga.avanceRapido();
			}
			for (int i = 0; i < tortuga.getCasilla(); i++) {
				if (i != tortuga.getCasilla() -1) {
					System.out.print(" ");
 
				} else {
					System.out.println("T");
				}
			}
			if(tortuga.getCasilla() == 70){
				System.out.println("Gana la tortuga");
				end = true;
			}
		}
	}
}
