import static java.lang.System.in;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Criar uma instância de Conta para exemplo
        try (Scanner entrada = new Scanner(in)) {
            // Criar uma instância de Conta para exemplo
            Conta minhaConta = new Conta("Corrente");
            // Conta de exemplo para transferências
            Conta contaDestino = new Conta("Poupança"); // Conta de exemplo para transferências
            
            int opcao;
            
            do{
                //exibe o menu
                menu();
                opcao = entrada.nextInt();
                
                switch(opcao){
                    case 1 -> {
                        System.out.print("Digite o valor para depósito: ");
                        double valor = entrada.nextDouble();
                        minhaConta.depositar(valor);
                    }
                    
                    case 2 -> {
                        System.out.print("Digite o valor para saque: ");
                        double valor = entrada.nextDouble();
                        minhaConta.sacar(valor);
                    }
                    
                    case 3 -> {
                        System.out.print("Digite o valor para transferência: ");
                        double valor = entrada.nextDouble();
                        minhaConta.transferir(valor, contaDestino);
                    }
                    
                    case 4 -> {
                        System.out.println("\n=== Extrato da Conta ===");
                        System.out.println("Agência: " + minhaConta.getAgencia());
                        System.out.println("Número: " + minhaConta.getNumero());
                        System.out.println("Saldo: R$ " + minhaConta.getSaldo());
                    }
                    
                    case 0 -> System.out.println("Encerrando o programa...");
                    default -> System.out.println("Opção inválida. Tente novamento");
                }
            } while(opcao != 0);
        }

    }  
    
    private static void menu() {
    	
	       System.out.println("\tDigite uma opção");
	       System.out.println("1. Depositar");
	       System.out.println("2. Sacar");
	       System.out.println("3. Transferir");
	       System.out.println("4. Consultar Extrato");
	       System.out.println("0. Fim");
	       
	       System.out.println("Opcao:");
    }

}
        
        /*Banco meuBanco = new Banco();

        // Usando o setter para definir o nome do banco
        meuBanco.setNome("Bradesco"); 

       // Usando o getter para obter o nome do banco
        String nomeBanco = meuBanco.getNome();

        //Instanciando um cliente
        Cliente nomeCliente = new Cliente();

        //Setter
        nomeCliente.setNumeroCliente(1);
      

        //Exibir o nome do banco
        System.out.println("Nome do Banco: " + nomeBanco);

   }*/


