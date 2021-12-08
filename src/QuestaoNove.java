import java.util.Scanner;

public class QuestaoNove {
	
	public static String dataMesExtenso(String data)  {
				
		String[] textoSeparado = data.split("/");		
		if(textoSeparado.length != 3) {
			return null;
		}
		String acessarDia = textoSeparado[0];
		String acessarMes = textoSeparado[1];
		String acessarAno = textoSeparado[2];
		
		if(Integer.valueOf(acessarDia) >0 && Integer.valueOf(acessarDia) <= 31 && acessarDia.length() == 2) {
			if(Integer.valueOf(acessarMes) >0 && Integer.valueOf(acessarMes) <= 12 && acessarMes.length() == 2) {				
				if(Integer.valueOf(acessarAno) >0 && acessarAno.length() == 4) {
					switch(acessarMes){
					case "01":
						return acessarDia + " de Janeiro de " + acessarAno;
						
					case "02":
						return acessarDia + " de Fevereiro de " + acessarAno;
						
					case "03":
						return acessarDia + " de Março de " + acessarAno;
						
					case "04":
						return acessarDia + " de Abril de " + acessarAno;
						
					case "05":
						return acessarDia + " de Maio de " + acessarAno;
						
					case "06":
						return acessarDia + " de Junho de " + acessarAno;
						
					case "07":
						return acessarDia + " de Julho de " + acessarAno;
						
					case "08":
						return acessarDia + " de Agosto de " + acessarAno;
						
					case "09":
						return acessarDia + " de Setembro de " + acessarAno;
						
					case "10":
						return acessarDia + " de Outubro de " + acessarAno;
						
					case "11":
						return acessarDia + " de Novembro de " + acessarAno;
						
					case "12":
						return acessarDia + " de Dezembro de " + acessarAno;
						
					default:
						return null;
						
					}
				}
				else {
					return null;
				}
			}else {
				return null;
			}
			
		}else {
			return null;
		}

	}

	public static void main(String[] args) {
		
		String data = "";
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite uma data no formato DD/MM/AAAA: ");
		data = teclado.nextLine(); 
		
		System.out.println(dataMesExtenso(data));
		
		teclado.close();

	}

}
