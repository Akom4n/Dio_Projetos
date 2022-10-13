package Estruturas;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
	
	public static void main(String[] args) {
		try {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite seu nome");
		String nome = sc.next();
		
		System.out.println("Digite seu sobrenome");
		String sobrenome = sc.next();
		
		System.out.println("Digite sua idade");
		int idade = sc.nextInt();
		
		System.out.println("Digite sua altura");
		double altura = sc.nextDouble();
		
		//Imprimindo os dados obtidos pelo usuario
		
		System.out.println("Eu meu chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
		
		System.out.println("Tenho " + idade + " anos ");
		
		System.out.println("Minha altura é " + altura + "cm ");
		
		//Exceções que podem acontecer: Não informar nome e sobrenome / O valor da idade ter um carctere NÃO numérico / O valor da altura ter uma vírgula ao invês de ser um ponto(estilo americano)
		
		
		sc.close();
		}catch(InputMismatchException e){
			System.out.println("Os campos idade e altura precisam ser numéricos e em formatação US");
		}
	}

}
