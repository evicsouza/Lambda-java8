
public class Main {

	/*
	 * Você deve refatorar o código abaixo para, 
	 * ao invés de trabalhar com a implementação de métodos estáticos, 
	 * adotar Lambdas.
	 */
	public static void main(String[] args) {

		FuncaoDeSoma funcaoDeSoma = (numero1, numero2) -> (numero1 + numero2);

		System.out.println(funcaoDeSoma.somar(10, 15));
		System.out.println(funcaoDeSoma.somar(187, 18));
		System.out.println("-------------");

		FuncaoDeFatorial funcaoDeFatorial = (numero) -> {
			if (numero < 0)
				throw new IllegalArgumentException("numero < 0");
			int resultado = 1;
			for (int i = 1; i <= numero; i++) {
				resultado *= i;
			}
			return resultado;
		};

		System.out.println(funcaoDeFatorial.fatorial(5));
		System.out.println(funcaoDeFatorial.fatorial(7));
		System.out.println("-------------");

		FuncaoIsPrimo funcaoIsPrimo = (numero)->{
			int divisiveis = 0;
			for (int i = 1; i <= numero; i++) {
				if (numero % i == 0) {
					divisiveis++;
				}
			}
			return divisiveis == 2;
		};

		System.out.println(funcaoIsPrimo.isPrimo(13));
		System.out.println(funcaoIsPrimo.isPrimo(14));
		System.out.println("-------------");

		FuncaoIsInteiroValido funcaoIsInteiroValido = (texto) -> 
		(texto.matches("-?\\d+"));

		System.out.println(funcaoIsInteiroValido.isInteiroValido("157"));
		System.out.println(funcaoIsInteiroValido.isInteiroValido("15a7"));
		System.out.println("-------------");

		FuncaoCalcularMedia funcaoCalcularMedia = a1 -> {
			if (a1.length == 0)
				throw new IllegalArgumentException("vetor.length == 0");
			double soma = 0;
			for (double valor : a1) {
				soma += valor;
			}
			return soma / a1.length;
		};

		double[] array1 = { 1, 10, 6.5, 189.5 };
		System.out.println(funcaoCalcularMedia.calcularMedia(array1));
		double[] array2 = { 10, 58.9, 6.5, 18 };
		System.out.println(funcaoCalcularMedia.calcularMedia(array2));
		System.out.println("-------------");


		FuncaoImprimirMaiorNumero funcaoImprimirMaiorNumero = a1 -> {
			if(a1.length == 0)
				throw new IllegalArgumentException("vetor.length == 0");
			double maiorNumero = a1[0];
			for (int i = 1; i < a1.length; i++) {
				if (a1[i] > maiorNumero) {
					maiorNumero = a1[i];
				}
			}

			System.out.println("Maior numero = " + maiorNumero);
		};

		funcaoImprimirMaiorNumero.imprimirMaiorNumero(array1);
		funcaoImprimirMaiorNumero.imprimirMaiorNumero(array2);
	}
}
