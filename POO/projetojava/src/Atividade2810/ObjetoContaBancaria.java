package Atividade2810;

public class ObjetoContaBancaria {
    public static void main(String[] args) {
       // ContaBancaria(String nomeCliente, String numeroConta, double saldo, String agenciaConta, String senhaConta ){

        ContaBancaria conta1 = new ContaBancaria("Thiago","123",10.0,"001","566");
        ContaBancaria conta2 = new ContaBancaria("Maria Eduarda", "321",2000.0,"001","0808");
        ContaBancaria conta3 = new ContaBancaria("Maysa Maria","159",0,"002","000");
        
        System.out.println("TITULAR CONTA 01: "+conta1.getNomeCliente());
        System.out.println("NUMERO DA CONTA 01: "+conta1.getNumeroConta());
        System.out.println("SALDO DA CONTA 01: "+conta1.getSaldo());
        System.out.println("AGENCIA DA CONTA 01: "+conta1.getAgenciaConta());
        System.out.println("SENHA DA CONTA 01: "+conta1.getSenhaConta());
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*");
        
        System.out.println("TITULAR CONTA 02: "+conta2.getNomeCliente());
        System.out.println("NUMERO DA CONTA 02: "+conta2.getNumeroConta());
        System.out.println("SALDO DA CONTA 02: "+conta2.getSaldo());
        System.out.println("AGENCIA DA CONTA 02: "+conta2.getAgenciaConta());
        System.out.println("SENHA DA CONTA 02: "+conta2.getSenhaConta());
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*");
        System.out.println("TITULAR CONTA 03: "+conta3.getNomeCliente());
        System.out.println("NUMERO DA CONTA 03: "+conta3.getNumeroConta());
        System.out.println("SALDO DA CONTA 03: "+conta3.getSaldo());
        System.out.println("AGENCIA DA CONTA 03: "+conta3.getAgenciaConta());
        System.out.println("SENHA DA CONTA 03: "+conta3.getSenhaConta());
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*");

        
    }
}
