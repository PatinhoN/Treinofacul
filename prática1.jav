# Treinofacul
treino da facul e atividades. 

public class Treino1 {

	public static void main(String[] args) {

		//// var
		Scanner entrada= new Scanner(System.in);
		String email, nome;
		int ano,resultado, atual=2022;
		////scanner e print
		System.out.println("Qual é seu nome: ");
		nome=entrada.nextLine();
		
		System.out.println("Qual é seu E-mail: ");
		email=entrada.nextLine();
		
		System.out.println("Qual é seu Ano de nascimento: ");
		ano=entrada.nextInt();
		
		resultado= calculo(ano, atual); 
		System.out.println("A idade do usuario: "+ resultado);
	}
	static int calculo(int ano, int atual){
	    return atual-ano;
	}

}
