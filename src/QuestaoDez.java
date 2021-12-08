import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuestaoDez {

	public static String caracteresEmbaralhados(String palavra) {

		ArrayList<Character> arrayListCharacters = new ArrayList<Character>();

		for (char carac : palavra.toCharArray()) {
			arrayListCharacters.add(carac);
		}

		Collections.shuffle(arrayListCharacters);

		String retorno = "";

		for (char caracter : arrayListCharacters) {
			retorno += caracter;
		}
		
		retorno = retorno.toLowerCase();
		
		return retorno;
	}
	
	public static void main(String[] args) {
		String palavraUsuario = "";
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um nome: ");
		palavraUsuario = teclado.nextLine(); 
		
		System.out.println(caracteresEmbaralhados(palavraUsuario));
		
		teclado.close();
	
	}

}
