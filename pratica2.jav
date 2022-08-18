public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		////////////
		String nomecliente, nomeproduto;
		double num1, num2;

		////////////

		System.out.println("Nome do Cliente: ");
		nomecliente = entrada.nextLine();

		System.out.println("Nome do(s) produto(s): ");
		nomeproduto = entrada.nextLine();

		System.out.println("quantidade de produtos: ");
		num1 = entrada.nextDouble();
		if(erro(num1)<=0 ) {
		
			System.out.println("erro do < 0 ");
			
		}
		else {
		System.out.println("preço do(s) produto(s): ");
		num2 = entrada.nextDouble();

		
		System.out.println("valor total da compra: " + calculo(num1, num2));
		}
	}

	static double calculo(double num1, double num2) {
		return num1 * num2;
	}

	static int erro(double num1) {

		if (num1 <= 0) {
			return 0;
		}else
			return 1;
	}
}
