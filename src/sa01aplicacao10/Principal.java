package sa01aplicacao10;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			int senha;
			int cont=0;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Seja bem vindo ao Banco SS:");
			
			System.out.println("Informe seu nome: ");
			String nome = leia.nextLine();
			
		
				System.out.println("Desafio para bloquear o cartão!");
				
				while (cont<3) {
				System.out.println("Informe a senha: ");
				 senha = leia.nextInt();
				
				
				if(senha == 123) {
				System.out.println("Pode sacar.");
				break;
					
				}else {
					 System.out.println("Senha incorreta.");
					 cont++;
				}
		if (cont >= 3) {
		 System.out.println("Cartão bloqueado.");
		 break;
		}	
	 }	
  }
}
