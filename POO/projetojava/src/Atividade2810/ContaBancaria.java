package Atividade2810;

public class ContaBancaria {
    private String nomeCliente;
    private String numeroConta;
    private double saldo;
    private String agenciaConta;
    private String senhaConta;

    //Metodo contrutor
    ContaBancaria(String nomeCliente, String numeroConta, double saldo, String agenciaConta, String senhaConta ){
    this.nomeCliente = nomeCliente;
    this.numeroConta = numeroConta;
    this.saldo = saldo;
    this.agenciaConta = agenciaConta;
    this.senhaConta = senhaConta;
    }

    public String getAgenciaConta(){
        return this.agenciaConta;
    }
    public void setAgenciaConta(String agenciaConta){
        this.agenciaConta = agenciaConta;
    }
    public String getSenhaConta(){
        return this.senhaConta;
    }
    public void setSenhaConta(String senhaConta){
        this.senhaConta = senhaConta;
    }
    public String getNomeCliente(){
        return this.nomeCliente;
    }
    public void SetNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }
    public String getNumeroConta(){
        return this.numeroConta;
    }
    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }
    public Double getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void sacar (double valor){
        if (valor > this.getSaldo()){
            System.out.println("Saldo Insuficiente!");
        }
        else{
            double novoSaldo = this.getSaldo() - valor;
            this.setSaldo(novoSaldo);
        }
    }

    public void depositar (double valor){
        double novoSaldo = this.getSaldo() + valor;
        this.setSaldo(novoSaldo);
    }

    public Double saldo(){
        return saldo;
    }


}
