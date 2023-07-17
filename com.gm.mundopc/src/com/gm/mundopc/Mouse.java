package com.gm.mundopc;

public class Mouse extends DispositivoEntrada{
	
	private final int idMouse;
	private static int contadorRatones;

	public Mouse(String tipoEntrada, String marca) {
		
		super(tipoEntrada, marca);
		this.idMouse =++Mouse.contadorRatones;
	
	}

	@Override
	public String toString() {
		return "Mouse [idMouse=" + idMouse +"," +super.toString()+"]";
	}
	
	
}
