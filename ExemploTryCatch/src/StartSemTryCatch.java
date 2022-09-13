//SEM TRATAMENTO DAS EXCEÇÃO COM TRY-CATCH
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
                                        long cpf = recebeLong.nextLong();
                                        Cliente cliente = DadosVirtual.consultarCliente(cpf);

                                        System.out.println(cliente.getNome());

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
          }*/