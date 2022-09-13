import java.util.Scanner;
   public class Start {
     public static void main(String[] args) {
    	 Scanner recebeLong;
    	 Scanner recebeString;
    	 DadosVirtual.criarClientesDeTeste();
    	 boolean sair = false;
    	 System.out.println("Consulta de Clientes");
    	 do {
    		 recebeLong = new Scanner(System.in);
    		 recebeString = new Scanner(System.in);
    		 System.out.println("Digite o número do CPF: ");
    		 
    		 if(recebeLong.hasNext()){
    			 long cpf = 0;
    			 try {
    				 cpf = recebeLong.nextLong();
    				 Cliente cliente = DadosVirtual.consultarCliente(cpf);
    				 System.out.println(cliente.getNome());
    				 } catch (Exception e) {
    					 System.out.println("Cliente não encntrado com o CPF: " + cpf);
    					 System.out.println("Deseja cadastrar o cliente com o CPF"+ cpf +"?");
    					 String novoCadastro = recebeString.nextLine();
    					 if(novoCadastro.equalsIgnoreCase("S")) {
    						 System.out.println("Informe o nome do cliente: ");
    						 String nome = recebeString.nextLine();
    						 cadastrarCliente(cpf, nome);
    						 }
    					 }
    			 } else {
    				 System.out.println("Você precisa digitar um Número de CPF válido. O texto digitado foi: "+ recebeString.nextLine());
    				 }
    		 System.out.println("Deseja consultar outro cliente ?");
    		 String resposta = recebeString.nextLine();
    		 if (resposta.equalsIgnoreCase("S")) {
                  sair = false;
                  } else {
                	  sair = true;
                	  }
    		 } while (!sair);
    	 System.out.println("Consulta finalizada");
    	 recebeString.close();
    	 recebeLong.close();
    	 }
     private static void cadastrarCliente(long cpf, String nome) {
    	 DadosVirtual.novoCliente(cpf, nome);
    	 System.out.println("Cliente cadastrado com sucesso");
    	 }
}