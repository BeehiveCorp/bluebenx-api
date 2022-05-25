package bluebenx;

// Essa � uma superclasse

public class Conta {
    // Attributes
    protected double saldo;
    protected String descricao;

    // Constructor
    Conta() {

    }

    Conta(double saldo, String descricao) {
        super();
        this.saldo = saldo;
        this.descricao = descricao;
    }

    // Methods
    public void transferir() {

    }

    public void depositar() {

    }

    // Getters and Setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
