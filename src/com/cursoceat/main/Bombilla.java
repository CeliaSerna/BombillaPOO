package com.cursoceat.main;

public class Bombilla {

	static public boolean interruptorGeneral=true;
	private boolean interruptor;
	//constructor vacio, para crear el objeto bombilla en apagado
	public Bombilla() {
		this.interruptor = false;
	}
	//metodo que enciende o apaga segun como este el interruptor
	public void encenderOapagar() {
		if(this.interruptor) {
			this.interruptor=false;
		}else {
			this.interruptor=true;
		}
	}
	
	//metodo para encerder la bombilla
	public void encender() {
		this.interruptor=true;
	}
	//metodo para apagar la bombilla
	public void apagar() {
		this.interruptor=false;
	}	
	//metodo para cambiar el estado

	public boolean estado() {
		
//no necesito el this en interruptorGeneral porque es static
		return interruptorGeneral && this.interruptor;
	}
	
	//metodod para mostrar el estado
	public String mostrarEstado() {
		
		
	return estado() ?" encendida" : " apagada";
	}
	
	
	
}
