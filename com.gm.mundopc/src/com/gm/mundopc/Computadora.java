package com.gm.mundopc;

public class Computadora {
	
	private final int idComputadora;
	private String nombre;
	private Monitor monitor;
	private Teclado teclado;
	private Mouse mouse;
	private static int contadorComputadora;

	private Computadora() {
		this.idComputadora = ++Computadora.contadorComputadora;
		
	}
	
	public Computadora (String nombre, Monitor monitor, Teclado teclado, Mouse mouse) {
		
		this();
		this.nombre = nombre;
		this.monitor = monitor;
		this.teclado = teclado;
		this.mouse = mouse;
		
				
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Teclado getTeclado() {
		return teclado;
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	public Mouse getMouse() {
		return mouse;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	public int getIdComputadora() {
		return idComputadora;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Computadora [id=");
		builder.append(idComputadora);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", monitor=");
		builder.append(monitor);
		builder.append(", teclado=");
		builder.append(teclado);
		builder.append(", mouse=");
		builder.append(mouse);
		builder.append("]");
		return builder.toString();
	}



}
