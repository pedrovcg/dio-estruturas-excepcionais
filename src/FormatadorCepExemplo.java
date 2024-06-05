public class FormatadorCepExemplo {
    public static void main(String[] args) {

        try {

        String cep = formatarCep ("2548965");
        System.out.println(cep);    

        } catch (CepInvalidoException e) {
            System.out.println("O cep não tem 8 dígitos");;
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }

}
