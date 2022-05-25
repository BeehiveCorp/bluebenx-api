package bluebenx;

public class Wallet extends Conta {
    // Attributes
    private String endereco;

    // Constructors
    Wallet() {

    }

    Wallet(double saldo, String descricao, String endereco) {
        super();
        this.endereco = endereco;
    }

    // Methods
    public void show() {
        System.out.println("\n| WALLET INSTANCIADA");
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Endereço: " + this.endereco);
    }

    // Getters and Setters
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
