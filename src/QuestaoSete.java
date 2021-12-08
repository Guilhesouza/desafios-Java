import java.util.Scanner;

public class QuestaoSete {

	public static void main(String[] args) {
		
		String[] pergunta = {"Telefonou para a vítima? ",
				"Esteve no local do crime? ",
				"Mora perto da vítima? ",
				"Devia oara a vítima? ",
				"Já trabalhou com a vítima? "};
		
		String resposta = "";
		int quantidadeSim = 0;
		
		System.out.println("Responda Sim ou Não para as perguntas abaixo: ");
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < pergunta.length; i++) {
			System.out.print(pergunta[i]);
			resposta = teclado.nextLine();
			if(resposta.equals("Sim")) {
				quantidadeSim += 1;
			}
		}
		
		if(quantidadeSim == 2) {
			System.out.println("A pessoa é Suspeita!!!");
		}else if(quantidadeSim ==3 || quantidadeSim ==4) {
			System.out.println("A pessoa é Cúmplice!!!");
		}else if(quantidadeSim ==5) {
			System.out.println("A pessoa é Assassina!!!");
		}else {
			System.out.println("A pessoa é Inocente!!!");
		}

		teclado.close();
	}
}
