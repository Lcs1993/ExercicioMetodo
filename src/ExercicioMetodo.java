
public class ExercicioMetodo {

	public static void main(String[] args) {
		somar(2, 3);
		 
		escreverOla("Lucas",30);
		apresentarLinguagem();
		calcularRaizQuadrada(9);
		Operacoes.contador();
	}
//		Qual é o retorno do método,o nome do método(os parametros do método)
//		Ele vai ser static ou estatico quando for chamado por um metodo estatico
//      O metodo somar nao retorna dado por isso é que ele é void	
//		Ele recebe dois parametros do tipo inteiro
	static void somar(int val1, int val2) {
		System.out.println("esse é o método somar");
		System.out.println("o valor da variavel val1 é: " + val1 + "e o valor da val2 é: " + val2);
		int soma = val1 + val2;
		System.out.println("o valor da soma é: " + soma);
	}

	static void escreverOla(String nome,int idade){
		System.out.println("ola: "+nome);
		System.out.println("voce tem "+idade);
	}
	static void apresentarLinguagem(){
		System.out.println("feito em java");
	}
	static void calcularRaizQuadrada(int valor) {
		int raizQuadrada=(int) Math.sqrt(valor);
		System.out.println("o valor da raiz quadrada é: "+raizQuadrada);
	}
}