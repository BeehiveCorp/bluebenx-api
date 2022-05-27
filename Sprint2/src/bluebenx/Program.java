package bluebenx;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		int option = 1;

		while (option != 0) {
			option = Integer.parseInt(JOptionPane.showInputDialog(
					"| Digite o número referente à opção desejada:\n0 - Sair\n1 - Instanciar usuário\n2 - Instanciar perfil\n3 - Instanciar evento\n"
							+ "4 - Instanciar wallet (carteira digital)\n5 - Instanciar NFT\n6 - Instanciar Transacao\n7 - Instanciar Conquista\n8 - Instanciar NFT Pack"));

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
					String descricao = JOptionPane.showInputDialog("Descri��o do Perfil:");
					int seguidores = Integer.parseInt(JOptionPane.showInputDialog("N�mero de seguidores:"));
					int seguindo = Integer.parseInt(JOptionPane.showInputDialog("N�mero de seguindo:"));
					String nftsFavoritas = JOptionPane.showInputDialog("NFTs favoritas:");
					String galerias = JOptionPane.showInputDialog("Galerias:");
					int eventosParticipados = Integer
							.parseInt(JOptionPane.showInputDialog("Quantos eventos o usu�rio j� participou?"));
					String nivel = JOptionPane.showInputDialog("N�vel do Perfil:");
					String conquistas = JOptionPane.showInputDialog("Quais conquistas o perfil alcan�ou?");
					String foto = JOptionPane.showInputDialog("Foto de Perfil");

					Perfil isabella = new Perfil(descricao, seguidores, seguindo, nftsFavoritas, galerias,
							eventosParticipados, nivel, conquistas, foto);
					isabella.show();

				} else if (option == 3) {
					// Instancia do Evento
					String nome = JOptionPane.showInputDialog("Qual o nome do Evento?");
					String descricao = JOptionPane.showInputDialog("Descreva o evento");
					String host = JOptionPane.showInputDialog("Qual o anfitrião do evento? (Ex.: Anitta, Alok)");
					int limiteParticipantes = Integer
							.parseInt(JOptionPane.showInputDialog("Qual o limite de participantes?"));
					int participantes = Integer.parseInt(
							JOptionPane.showInputDialog("Quantos participantes v�o participar deste evento?"));
					double premiacao = Integer
							.parseInt(JOptionPane.showInputDialog("Qual a premia��o para o ganhador?"));
					String dataInicio = JOptionPane.showInputDialog("Qual a data de in�cio do evento?");
					String dataFim = JOptionPane.showInputDialog("Qual a data do fim do evento?");

					Evento lancamento = new Evento(nome, descricao, host, limiteParticipantes, participantes, premiacao,
							dataInicio, dataFim);
					lancamento.show();

				} else if (option == 4) {
					// Instancia da Wallet
					double saldo = Double.parseDouble(JOptionPane.showInputDialog("Qual o saldo da wallet?"));
					String descricao = JOptionPane.showInputDialog("Qual a descri��o da wallet?");
					String endereco = JOptionPane.showInputDialog("Qual o endere�o da wallet?");

					Wallet carteiraDigital = new Wallet(saldo, descricao, endereco);
					carteiraDigital.show();

				} else if (option == 5) {
					// Instancia da NFT
					String nome = JOptionPane.showInputDialog("Nome do NFT");
					String criador = JOptionPane.showInputDialog("Criador do NFT");
					String categoria = JOptionPane.showInputDialog("Categoria do NFT");
					double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do NFT:"));
					String dataCriacao = JOptionPane.showInputDialog("Data de Cria��o do NFT:");

					NFT novaNFT = new NFT(nome, criador, categoria, valor, dataCriacao);
					novaNFT.show();

				} else if (option == 6) {
					// Instancia da Transa��o
					String data = JOptionPane.showInputDialog("Data da transa��o:");
					double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor da transa��o:"));
					String descricao = JOptionPane.showInputDialog("Descri��o da transa��o:");
					String tipo = JOptionPane.showInputDialog("Tipo da transa��o:");

					Transacao transacao = new Transacao(data, valor, descricao, tipo);
					transacao.show();

				} else if (option == 7) {
					// Instancia da Conquista
					String nome = JOptionPane.showInputDialog("Nome da conquista:");
					String descricao = JOptionPane.showInputDialog("Descri��o da conquista:");
					String icone = JOptionPane.showInputDialog("�cone da conquista:");
					int vezesConquistada = Integer
							.parseInt(JOptionPane.showInputDialog("Quantas vezes foi conquistada?"));

					Conquista conquista = new Conquista(nome, descricao, icone, vezesConquistada);
					conquista.show();

				} else if (option == 8) {
					// Instancia do NFT Pack
					double preco = Double.parseDouble(JOptionPane.showInputDialog("Pre�o do NFT:"));
					String titulo = JOptionPane.showInputDialog("T�tulo do pack:");
					String descricao = JOptionPane.showInputDialog("Descri��o do pack:");
					String nfts = JOptionPane.showInputDialog("NFTs inclusas:");

					NFTPack pack = new NFTPack(descricao, titulo, nfts, preco);
					pack.show();

				} else {
					System.out.println("Essa op��o n�o existe");
				}
			}
		}

		System.out.println("\nObrigado por escolher a BlueBenx <3");
	}

}
