package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
	
	public static void main(String[] args) {
		
		//Set notas = new HashSet(); //antes do java 5
		//HashSet<Double> notas = new HashSet<>();
		//Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
		//Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
		//notas.add(1d);
		//notas.remove(5d);
		//System.out.println(notas)
		
		
		System.out.println("Crie um conjunto e adicione as notas: ");
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		System.out.println(notas.toString());
		
		//System.out.println("Exiba a posição da nota 5.0: ");
		
		//System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
		
		//System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
		
		//System.out.println("Confira se a nota 5.0 está no conjunto: ");
		
		//System.out.println("Exiba a terceira nota adicionada: ");
		
		//System.out.println("Exiba a menor nota: ");
		
		
	}

}
