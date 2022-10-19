package Collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ExemploOrdenacaoSet {

	public static void main(String[] args) {
		
		System.out.println("--\tOrdem aleatória\t---");
		Set<Serie> minhasSeries = new HashSet<>(){{
			
		}};
		for(Serie serie: minhasSeries) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
	}

	class Serie {
		private String nome;
		private String genero;
		private Integer tempoEpisodio;

		public Serie(String nome, String genero, Integer tempoEpisodio) {
			this.nome = nome;
			this.genero = genero;
			this.tempoEpisodio = tempoEpisodio;
		}

		public String getNome() {
			return nome;
		}

		public String getGenero() {
			return genero;
		}

		public Integer getTempoEpisodio() {
			return tempoEpisodio;
		}

		public String toString() {
			return "{" + "nome=" + nome + '\'' + ", genero=" + genero + '\'' + ", tempoEpisodio" + tempoEpisodio + '}';
		}

		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (o == null || getClass() != o.getClass())
				return false;
			Serie serie = (Serie) o;
			return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
		}

		public int hashCode() {
			return Objects.hash(nome, genero, tempoEpisodio);
		}

	}

}
