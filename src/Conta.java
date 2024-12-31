public class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;


    protected int numero;
    protected int agencia;
    protected double  saldo;
    protected String tipoConta;


    public Conta(String tipoConta) {
        this.numero = SEQUENCIAL++;
        this.agencia = AGENCIA_PADRAO;
        this.tipoConta = tipoConta;
        this.saldo = 0.0;

    }


    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor){
            saldo -= valor ;
            System.out.println("Saque realizado com sucesso");
        }else{
            System.out.println("Saldo insuficiente");
        }
     }

     public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito realizado com sucesso");
        } else {
            System.out.println("Saldo Insuficiente ");
        }
        
    }

    public void transferir(double valor, Conta contaDestino) {
        if (valor > 0 && saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência realizada com sucesso!");
        }else{
            System.out.println("Erro ao realizar a transferencia!");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public int getNumero() {
        return numero;
    }


    public int getAgencia() {
        return agencia;
    }

}
