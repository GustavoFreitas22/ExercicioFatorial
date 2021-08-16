package controller;

public class FatorialController {

	public FatorialController() {
		super();
	}
	
	public int fatorial(int numero, int indice) {
		if(indice == 0) {
			return 1;
		}else {
			numero = indice;
			indice = numero - 1;
			return numero * fatorial(numero, indice);
		}
	}
		
}
