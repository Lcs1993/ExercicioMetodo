import java.time.LocalDate;

public class ExercicioFuncao {

	public static void main(String[] args) {
		System.out.println("toda função tem retorno");
		int soma =somar(2,3);
		System.out.println("o valor da soma entre 2 e 3 é: "+soma);
		System.out.println("o nome maiusculo é: "+transformarMaiusculo("lucas da costa"));
		System.out.println("a minha idade é: "+calcularIdade(1953));
		System.out.println("o valor da raiz quadrada é: "+calcularRaizQuadrada(9));
		int multiplicacao = multiplicar(2,3);
		System.out.println("o valor da multiplicação de 2 e 3 é: "+multiplicacao );
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
