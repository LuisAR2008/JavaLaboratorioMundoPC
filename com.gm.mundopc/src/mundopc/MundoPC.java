package mundopc;


import com.gm.mundopc.*;

public class MundoPC {

	public static void main(String[] args) {

		Monitor monitorHP = new Monitor("HP", 13);
		Teclado tecladoHP = new Teclado("USB", "HP");
		Mouse mouseHp = new Mouse("USB", "HP");
		Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, mouseHp);
		
		Monitor monitorACER = new Monitor("ACER", 32);
		Teclado tecladoACER = new Teclado("USB", "HP");
		Mouse mouseACER = new Mouse("USB", "ACER");
		Computadora computadoraACER = new Computadora("Computadora HP", monitorACER, tecladoACER, mouseACER);
		
		Orden orden1 =  new Orden();
		orden1.agregarComputadora(computadoraHP);
		orden1.agregarComputadora(computadoraACER);
		
		orden1.mostrarOrden();
	}

}
