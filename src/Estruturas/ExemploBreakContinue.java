package Estruturas;

public class ExemploBreakContinue {
	
	public static void main(String[] args) {
		
		for(int numero = 1; numero <= 5; numero++) {
			if(numero ==3)
				//break (ele para no 2)
				continue; //Ele pula o 3
			
			System.out.println(numero);
		}
	}

}
