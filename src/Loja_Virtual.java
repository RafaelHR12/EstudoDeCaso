import java.util.Scanner;

public class Loja_Virtual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner ( System.in );
		
		String senha = "1";
		String Adress;
		String senhaCon = "0";
		
		String prod1 = "TV", prod2 = "Luminária", prod3 = "Chapeuzinho Vermelho", prod4 = "IPhone 13", prod5 = "S24 Ultra", prod6 = "RICH DAD, POOR DAD", prod7 = "A Senhora", prod8 = "PS5 Slin", prod9 = "A arte da guerra", prod10 = "Geladeira";
		double preco1 = 20.5, preco2 = 99.99, preco3 = 15.0, preco4 = 12.9, preco5 = 9.99, preco6 = 1.5, preco7 = 33.7, preco8 = 8.99, preco9 = 10.0, preco10 = 68.9; 
		String categoria1 = "Eletrodomesticos: " +
		"\n1- TV" +
		"\n2- Luminária" +
		"\n4- IPhone 13" +
		"\n5- S24 Ultra" +
		"\n8- PS5 Slin" +
		"\n10- Geladeira",
		categoria2 = "Livros: " +
		"\n3- Chapeuzinho Vermelho" +
		"\n6- RICH DAD, POOR DAD" +
		"\n7- A Senhora" +
		"\n9- A arte da guerra" ;
		int estoqProd1 = 9, estoqProd2 = 8, estoqProd3 = 19, estoqProd4 = 6, estoqProd5 = 15, estoqProd6 = 17, estoqProd7 = 11, estoqProd8 = 3, estoqProd9 = 4, estoqProd10 = 7;
		
			System.out.println( "1- Login " + "\n2- Cadastro" );
			int entrada = sc.nextInt();
			
			if ( entrada == 1 ) {
				System.out.println( " Digite seu nome ou E-mail: " );
				Adress = sc.next();
				System.out.println( " Digite sua Senha: " );
				senha = sc.next();
			} if ( entrada == 2 ) {
				System.out.println( " Digite seu E-mail: " );
				Adress = sc.next();
				System.out.println( " Digite seu nome: " );
				String name = sc.next();
				
				while ( !senha.contains(senhaCon )) {
				System.out.println( " Digite uma Senha: " );
				senha = sc.next();
				System.out.println( " Digite sua Senha novamente: " );
				senhaCon = sc.next();
					if ( senha.equals(senhaCon) ) {
						System.out.println( " Bem-Vindo a Loja e, Boas Compras!" );
					} else {
						System.out.println( " Digite uma Senha novamente: " );
						senha = sc.next();
						System.out.println( " Digite sua Senha novamente: " );
						senhaCon = sc.next();
					}
			}
		}
			
				System.out.println( " Digite (1) se deseja pesquisar por categoria ou (2) para obsrvar todos os produtos disponíveis: " );
				int escolha = sc.nextInt();
				
				if ( escolha == 1 ) {
					System.out.println( " Categoria: 1 - Eletrodomesticos ou 2 - Livros" );
					int categoriaEscolha = sc.nextInt();
					if ( categoriaEscolha == 1 ) {
						System.out.println( categoria1 );
					} else if ( categoriaEscolha == 2 ) {
						System.out.println( categoria2 );
					}
				} else if ( escolha == 2 ) {
					System.out.println( categoria1 + "\n\n" + categoria2 );
				}
		
				int produtosCarrinho = 0;
		while ( produtosCarrinho != 1 ) {
			System.out.println( "\nDigite o número do produto que deseja comprar ou selecione 1 para finalizar a compra e descobrir o valor total da compra: " );
			produtosCarrinho = sc.nextInt();
		}
	}

}
