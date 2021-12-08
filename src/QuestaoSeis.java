import java.util.Scanner;

public class QuestaoSeis {

	public static void main(String[] args) {
		
		String[] cardapio = {
				"Especificação   - Código - Preço",
				"Cachorro Quente - 100    - R$1,20",
				"Bauru Simpes    - 101    - R$1,30",
				"Bauru com ovo   - 102    - R$1,50",
				"Hambúrguer      - 103    - R$1,20",
				"Cheeseburguer   - 104    - R$1,30",
				"Refrigerante    - 105    - R$1,00"
		};
		
		String pedido = "";
		double valorPagoItem = 0, valorTotalPedido = 0;
		int quantidade;
		String codigo = "";
		double valorCachorroQuente = 1.20, valorBauruSimples = 1.30,
				valorBauruComOvo = 1.50, valorHamburguer = 1.20,
				valorCheeseburguer = 1.30, valorRefrigerante = 1.00;
		String valorSimOuNao;
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < cardapio.length; i++) {
			System.out.println(cardapio[i]);
		}	
		
		do {
			System.out.println("Digite o código e a quantidade do item que você deseja, separando-os por virgula: ");
			pedido = teclado.nextLine();
			String[] textoSeparado = pedido.split(",");
			quantidade = Integer.valueOf(textoSeparado[1]);
			codigo = textoSeparado[0];
			
			if(codigo.equals("100")) {
				valorPagoItem = valorCachorroQuente * quantidade;
			}else if(codigo.equals("101")) {
				valorPagoItem = valorBauruSimples * quantidade;
			}else if(codigo.equals("102")) {
				valorPagoItem = valorBauruComOvo * quantidade;
			}else if(codigo.equals("103")) {
				valorPagoItem = valorHamburguer * quantidade;
			}else if(codigo.equals("104")) {
				valorPagoItem = valorCheeseburguer * quantidade;
			}else if(codigo.equals("105")) {
				valorPagoItem = valorRefrigerante * quantidade;
			}
			System.out.println("O valor a ser pago é: R$ " + valorPagoItem);
			System.out.println("Quer fazer outro pedido?");
			
			valorSimOuNao = teclado.nextLine();
			
			valorTotalPedido += valorPagoItem;
			
		}while (valorSimOuNao.equals("Sim"));
		
		System.out.println("O valor total do seu pedido é: R$ " + valorTotalPedido);
		
		teclado.close();
	
		}
	}
