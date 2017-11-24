package com.zhuo;

public class Tortuga extends Thread{
	private int casilla;
	private Carrera carrera;
	
	public Tortuga(Carrera carrera) {
		this.casilla = 1;
		this.carrera = carrera;
	}

	@Override
	public void run() {
			carrera.empezarTortuga(this);		
	}
	public void avanceRapido(){
		setCasilla(getCasilla() + 3); 
	}
	public void resbalon(){
		setCasilla(getCasilla() -6);
	}
	public void avanceLento(){
		setCasilla(getCasilla() +1);
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
