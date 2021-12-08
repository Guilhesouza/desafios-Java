import java.util.Scanner;

public class QuestaoCinco {

	public static void main(String[] args) {
		
		int valorInicial, valorFinal;
		int tabuada = 5;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o valor inicial: ");
		valorInicial = teclado.nextInt();
		System.out.print("Digite o valor final: ");
		valorFinal = teclado.nextInt(); 
		
		if(valorInicial <= valorFinal) {
			for (int i = valorInicial; i <=valorFinal; i++) {
				System.out.println(tabuada * (i));
			}
		}else {
			System.out.println("Você digitou o valor incial maior que o valor final!!");
		}
		
		teclado.close();
		
	}

}
