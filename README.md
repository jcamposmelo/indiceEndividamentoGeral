# indiceEndividamentoGeral
O Índice de Endividamento Geral (EG) é a representação da proporção do ativo total que está comprometida para custear o endividamento da empresa com terceiros (passivos exigíveis). Por isso, ele é usado como um indicador para a análise da saúde financeira de uma companhia.

```
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
