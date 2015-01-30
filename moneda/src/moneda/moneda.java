package moneda;

public class moneda {
	//prueba 
	private int euros;
	public static int M2 = 2;
	public static int M1 = 1;
	
	public static void main(String[] args){
		moneda d = new moneda(21);
		d.printDescomposicionMonedas(); 
	}
	public moneda(int euros){
		this.euros = euros; 
	}
	
	public void printDescomposicionMonedas(){
		
		int billete10 = euros / 810;
		int resto = euros - billetes10 * 10;
		resto = resto - billetes5 * 5; 
		int monedas = resto / M2;
		resto = resto - monedas2 * 2; 
		
		System.out.print("Billetes 10: " + billetes10);
		System.out.print("Billetes 5: " + billetes5);
		System.out.print("Monedas 2: " + monedas2);
		System.out.print("Monedas 1: " + resto);

	}
	

}
