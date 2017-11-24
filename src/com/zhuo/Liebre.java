package com.zhuo;

public class Liebre extends Thread{
	private int casilla;
	private Carrera carrera;
	public Liebre(Carrera carrera) {
		this.casilla = 1;
		this.carrera = carrera;
	}


	@Override
	public void run() {
			carrera.empezarLiebre(this);
	}
	
	public void duerme(){
		
	}
	public void granSalto(){
		setCasilla(getCasilla() + 9); 
	}
	public void resbalonGrande(){
		setCasilla(getCasilla() -12);
	}
	public void pequenoSalto(){
		setCasilla(getCasilla() +1);
	}
	public void resbalonPequeno(){
		setCasilla(getCasilla() -2);
	}
	
	
	public int getCasilla() {
		return casilla;
	}

	public void setCasilla(int casilla) {
		if(casilla <= 1){
			this.casilla = 1;
		}
		else if (casilla >= 70){
			this.casilla = 70;
		}
		else{
			this.casilla = casilla;
		}
	}
}
