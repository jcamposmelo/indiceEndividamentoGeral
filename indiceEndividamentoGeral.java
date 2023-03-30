public class grauDeIndividamentoTotal {
	public static void main(String[] args) {
		double passivoCirculante = 1500000;
		double exigivelLongoPrazo = 130000;
		double passivoTotal = 3500000;

		double grauDeIndividamentoTotal;

		grauDeIndividamentoTotal = (passivoCirculante + exigivelLongoPrazo) / passivoTotal;

		System.out.println("O índice calculado em Grau de Individamento total é?  " + 
				grauDeIndividamentoTotal);
	}
}