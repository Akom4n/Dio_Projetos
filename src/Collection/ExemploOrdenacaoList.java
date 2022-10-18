package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
	
	public static void main(String[] args) {
		
		List<Gato> meusGatos = new ArrayList<>() {{
			add(new Gato("Kuro", 13,"Preto"));
			add(new Gato("pretinha", 10,"Rajada"));
			add(new Gato("majuh", 5,"Branca"));
		}};
		System.out.println("---\tOrdem de Inserção\t---");
		System.out.println(meusGatos);
		
		System.out.println("---\tOrdem aleatória\t---");
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("---\tOrdem Natural (Nome)\t---");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("---\tOrdem idade\t---");
		Collections.sort(meusGatos, new ComparatorIdade());
		meusGatos.sort(new ComparatorIdade());
		System.out.println(meusGatos);
		
		System.out.println("---\tOrdem cor\t---");
		meusGatos.sort(new ComparatorCor());
		System.out.println(meusGatos);
		
		System.out.println("---\tOrdem Nome/Cor/Idade\t---");
		meusGatos.sort(new ComparatorNomeCorIdade());
		System.out.println(meusGatos);
		
	}
	
}

class Gato implements Comparable<Gato> {
	private String nome;
	private Integer idade;
	private String cor;
	
	public Gato(String nome, Integer idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Integer getIdade() {
		return idade;
	}
	
	public String getCor() {
		return cor;
	}
	
	public String toString() {
		return "Gato{" +
				"nome='" + nome + '\'' +
				", idade=" + idade +
				", cor='" + cor + '\'' +
				'}';
	}

	public int compareTo(Gato gato) {
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}
}

class ComparatorIdade implements Comparator<Gato> {

	@Override
	public int compare(Gato g1, Gato g2) {
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}

}

class ComparatorCor implements Comparator<Gato> {
	
	
	public int compare(Gato gato1, Gato gato2) {
		return gato1.getCor().compareToIgnoreCase(gato2.getCor());
	}
}

class ComparatorNomeCorIdade implements Comparator<Gato> {
	
	public int compare(Gato gatinho1,Gato gatinho2) {
		int nome = gatinho1.getNome().compareToIgnoreCase(gatinho2.getNome());
		if (nome != 0) return nome;
		
		int cor = gatinho1.getCor().compareToIgnoreCase(gatinho2.getCor());
		if(cor != 0) return cor;
			
		return Integer.compare(gatinho1.getIdade(), gatinho2.getIdade());
	}
}
