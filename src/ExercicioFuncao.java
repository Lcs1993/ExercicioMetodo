import java.time.LocalDate;

public class ExercicioFuncao {

	public static void main(String[] args) {
		System.out.println("toda fun��o tem retorno");
		int soma =somar(2,3);
		System.out.println("o valor da soma entre 2 e 3 �: "+soma);
		System.out.println("o nome maiusculo �: "+transformarMaiusculo("lucas da costa"));
		System.out.println("a minha idade �: "+calcularIdade(1953));
		System.out.println("o valor da raiz quadrada �: "+calcularRaizQuadrada(9));
		int multiplicacao = multiplicar(2,3);
		System.out.println("o valor da multiplica��o de 2 e 3 �: "+multiplicacao );
		String contador= Operacoes.contador(150, 170);
		System.out.println(contador);
	}
	static int somar(int valor1,int valor2){
	int soma=valor1+valor2;
	return soma;
	}
	static String transformarMaiusculo(String nome) {
		return nome.toUpperCase();
	}
	static int calcularIdade(int anoNascimento) {
		int idade =LocalDate.now().getYear()-anoNascimento;
		return idade;
	}
	static int calcularRaizQuadrada(int valor) {
		int raizQuadrada=(int) Math.sqrt(valor);
		return raizQuadrada;
		
	}
	static int multiplicar(int valor2,int valor3){
		int multiplicacao=valor2*valor3;
		return multiplicacao;
	}
}
