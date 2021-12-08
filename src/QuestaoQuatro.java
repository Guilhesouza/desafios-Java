import java.util.Scanner;

public class QuestaoQuatro {

	public static void main(String[] args) {
		
		double n1, n2, soma, media;
		String conceito, situacaoAluno = "";
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		n1 = teclado.nextDouble();
		System.out.print("Digite a segunda nota: ");
		n2 = teclado.nextDouble();		
		
		soma = n1 + n2;
		media = soma / 2;
		
		if((media >=9.0) && (media <=10.0)) {
			conceito = "A";
		}else if((media >=7.5) && (media <9.0)) {
			conceito = "B";;
		}else if((media >=6.0) && (media <7.5)) {
			conceito = "C";
		}else if((media >=4.0) && (media <6.0)) {
			conceito = "D";
		}else {
			conceito = "E";
		}
		
		if((conceito =="A") || (conceito =="B") || (conceito =="C")) {
			situacaoAluno = "APROVADO!!!";
		}else if ((conceito =="D") || (conceito =="E")) {
			situacaoAluno = "REPROVADO!!!";
		}
		
		System.out.println("Suas notas foram: " + n1 + " e " + n2);
		System.out.println("Sua média foi: " + media);
		System.out.println("Seu conceito é: " + conceito);
		System.out.println("O aluno foi " + situacaoAluno);
		
		teclado.close();

	}

}
