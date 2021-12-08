import java.util.Scanner;

public class QuestaoOito {

	public static void main(String[] args) {
		
		double[] saltos = new double[5];
		
		double mediaSaltos = 0;
		String nomeAtleta = "";
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o nome do Atleta ou digite Não para parar o programa: ");
		nomeAtleta = teclado.nextLine();
		
		if(!nomeAtleta.equals("Não")) {
		
			for (int i = 0; i < saltos.length; i++) {
				System.out.print("Digite o salto: ");
				saltos[i] = teclado.nextDouble();
				mediaSaltos += saltos[i];
			}
			
			System.out.println("Resultado Final: ");
			System.out.println("Atleta: " + nomeAtleta);
			System.out.print("Saltos: ");
			
			for (int i = 0; i <saltos.length; i++) {
				
				if(i == 0) {
					System.out.print(saltos[i]);
				}
				else if(i != 4) {
					System.out.print(" - " + saltos[i]);
				}
				if(i == 4) {
					System.out.println(" - " + saltos[i]);
				}
				
			}
				
			mediaSaltos /= 5;
				
			System.out.println("Média dos saltos: " + mediaSaltos + " m");
			
		}
		
		teclado.close();

	}

}
