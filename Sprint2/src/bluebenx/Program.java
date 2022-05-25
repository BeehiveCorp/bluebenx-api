package bluebenx;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		int option = 1;

		while (option != 0) {
			option = Integer.parseInt(JOptionPane.showInputDialog(
					"| Digite o nÃºmero referente Ã  opÃ§Ã£o desejada:\n0 - Sair\n1 - Instanciar usuÃ¡rio\n2 - Instanciar perfil\n3 - Instanciar evento\n4 - Instanciar wallet (carteira digital)\n5 - Instanciar NFT"));

			if (option != 0) {
				if (option == 1) {
					// Instancia do Usuario
					String nome = JOptionPane.showInputDialog("Qual seu nome?");
					String cpf = JOptionPane.showInputDialog("Qual seu CPF?");
					String logradouro = JOptionPane.showInputDialog("Qual seu logradouro?");
					String email = JOptionPane.showInputDialog("Qual seu email?");
					String senha = JOptionPane.showInputDialog("Qual sua senha?");
					String telefone = JOptionPane.showInputDialog("Qual seu telefone?");

					Usuario ronqui = new Usuario(nome, cpf, logradouro, email, senha, telefone);
					ronqui.show();
				} else if (option == 2) {
					// Instancia do Perfil
					System.out.println("Instancia do Perfil");
				} else if (option == 3) {
					// Instancia do Evento
					System.out.println("Instancia do Evento");
				} else if (option == 4) {
					// Instancia da Wallet
					double saldo = Double.parseDouble(JOptionPane.showInputDialog("Qual o saldo da wallet?"));
					String descricao = JOptionPane.showInputDialog("Qual a descrição da wallet?");
					String endereco = JOptionPane.showInputDialog("Qual o endereço da wallet?");

					Wallet carteiraDigital = new Wallet(saldo, descricao, endereco);
					carteiraDigital.show();
				} else if (option == 5) {
					// Instancia da NFT
					System.out.println("Instancia da NFT");
				} else {
					System.out.println("Essa opção não existe");
				}
			}
		}

		System.out.println("\nObrigado por escolher a BlueBenx <3");
	}

}
