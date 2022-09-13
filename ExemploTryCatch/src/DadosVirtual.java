 import java.util.HashMap;
 import java.util.Map;

       public class DadosVirtual {

      private static Map<Long, Cliente> clientes = new HashMap<Long, Cliente>();

                              public static void criarClientesDeTeste() {

                                                  clientes.put(33644798714L, new 
Cliente("Maria Dos Santos", 33644798714L));
                                                  clientes.put(21472581575L, new 
Cliente("Frederico Nascimento", 21472581575L));
                                                  clientes.put(98765475821L, new 
Cliente("Douglas Ribeiro", 98765475821L));
                                                  clientes.put(74785687145L, new 
Cliente("Clara Pereira", 74785687145L));
                                                  clientes.put(14724896471L, new 
Cliente("Filipe Santiago", 14724896471L));
                                                  clientes.put(17478587748L, new
Cliente("Demetrios de Siqueira", 17478587748L));
                                                  clientes.put(25487578965L, new 
Cliente("Ananda do Nascimento", 25487578965L));
                                                  clientes.put(71454112522L, new 
Cliente("Tereza Fortunato", 71454112522L));
                                                  clientes.put(14748547852L, new 
Cliente("Merilany Portinari", 14748547852L));
                                                  clientes.put(75848547856L, new 
Cliente("Ronaldo Diniz", 75848547856L));

                    }

                    public static Cliente consultarCliente (Long cpf) {
                                                  return clientes.get(cpf);

                    }

          public static void novoCliente(long cpf, String nome) {
        	  clientes.put(cpf, new Cliente (nome, cpf));
                    }
          }