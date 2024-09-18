package ar.edu.unlp.info.oo1.MethodLookUp;

public class Main {

	public static void main(String[] args) {
		Gerente alan = new Gerente("Alan Turing");
		double sueldoBasicoDeAlan = alan.sueldoBasico();
		
		System.out.print(sueldoBasicoDeAlan);
		
		/*Gerente alan = new Gerente("Alan Turing");
		double sueldoBasicoDeAlan = alan.sueldoBasico();*/
	}

}
