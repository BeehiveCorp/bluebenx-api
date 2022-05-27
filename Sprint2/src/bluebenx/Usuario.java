package bluebenx;

public class Usuario {
    // Attributes
    private String nome;
    private String cpf;
    private String logradouro;
    private String email;
    private String senha;
    private String telefone;
   

    // Constructors
    Usuario() {
    }

    Usuario(String nome, String cpf, String logradouro, String email, String senha, String telefone) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.logradouro = logradouro;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }

    // Methods
    public void show() {
        System.out.println("\n| USUARIO INSTANCIADO");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Logradouro: " + this.logradouro);
        System.out.println("Email: " + this.email);
        System.out.println("Senha: " + this.senha);
        System.out.println("Telefone: " + this.telefone);
    }

    public void criarNFT() {

    }

    public void comprarNFT() {

    }

    public void venderNFT() {

    }

    public void criarPerfil() {

    }

    public void criarNFTPack() {

    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
