
public class Operacoes {

	public static void contador() {
		String s="";
		for(int c=1;c<=10;c++) {
			s+=c+" ";
		}
		System.out.println(s);
	}
	static String contador(int valorInicial,int valorFinal) {
		String s="";
		for(int c=valorInicial;c<=valorFinal;c++) {
			s+=c+" ";
		}
		return s;
	}	
}
