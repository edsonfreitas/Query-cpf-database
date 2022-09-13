//CÓDIGO COM TRY-CATCH PORÉM SEM A POSSIBILIDADE DE CADASTRAR NOVOS USUÁRIO AO BANCO DE DADOS  

/*import java.util.Scanner;
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
                        	if (recebeLong.hasNextLong()) {
                                                  long cpf = 0;
                                                  try {
                                                	  cpf = recebeLong.nextLong();
                                                	  Cliente cliente = DadosVirtual.consultarCliente(cpf);
                                                	  System.out.println(cliente.getNome());
                                                	  } catch (Exception e) {
                                                		  System.out.println("Cliente não encontrado com o CPF: " + cpf);
                                                		  }
                                                  } else {
                                                	  System.out.println("Você precisa digitar um Número de CPF válido");
                                                	  }System.out.println("Deseja consultar outro cliente ?");
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
}*/
/*
 *  SAIDA DO PROGRAMA
 * Consulta de Clientes
Digite o número do CPF: 
12334444444
Cliente não encontrado com o CPF: 12334444444
Deseja consultar outro cliente ?
 * */
