//C�DIGO COM TRY-CATCH POR�M SEM A POSSIBILIDADE DE CADASTRAR NOVOS USU�RIO AO BANCO DE DADOS  

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
                        	System.out.println("Digite o n�mero do CPF: ");
                        	if (recebeLong.hasNextLong()) {
                                                  long cpf = 0;
                                                  try {
                                                	  cpf = recebeLong.nextLong();
                                                	  Cliente cliente = DadosVirtual.consultarCliente(cpf);
                                                	  System.out.println(cliente.getNome());
                                                	  } catch (Exception e) {
                                                		  System.out.println("Cliente n�o encontrado com o CPF: " + cpf);
                                                		  }
                                                  } else {
                                                	  System.out.println("Voc� precisa digitar um N�mero de CPF v�lido");
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
Digite o n�mero do CPF: 
12334444444
Cliente n�o encontrado com o CPF: 12334444444
Deseja consultar outro cliente ?
 * */
