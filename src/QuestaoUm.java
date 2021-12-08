import java.util.Scanner;

public class QuestaoUm {
	
	public static void main(String[] args) {
		
		float ganhaHora, salarioBruto, inss, salarioLiquido, impostoRenda, sindicato;
		int horaTrabalhadaMes;
		float porcentagemImpostoRenda = 0.11f, porcentagemInss = 0.08f, porcentagemSindicato = 0.05f ;
		float descontos;
		
		Scanner teclado = new Scanner(System.in);	
		
		System.out.print("Quanto você ganha por hora? R$ ");
		ganhaHora = teclado.nextFloat();
		System.out.print("Quantas horas você trabalha ao mês? ");
		horaTrabalhadaMes = teclado.nextInt();
	
		salarioBruto = ganhaHora * horaTrabalhadaMes;
		inss = salarioBruto * porcentagemInss;
		sindicato = salarioBruto * porcentagemSindicato;
		impostoRenda = salarioBruto * porcentagemImpostoRenda; 
		descontos = inss + sindicato + impostoRenda;
		salarioLiquido = salarioBruto - descontos;
				
		System.out.println("Seu salário Bruto é: R$ " + salarioBruto);
		System.out.println("Seu desconto do IR é: R$ " + impostoRenda);
		System.out.println("Seu desconto do INSS é: R$ " + inss);
		System.out.println("Seu desconto do Sindicato é: R$ " + sindicato);
		System.out.println("Seu salário Liquido é: R$ " + salarioLiquido);
		
		teclado.close();
		
	}

}
