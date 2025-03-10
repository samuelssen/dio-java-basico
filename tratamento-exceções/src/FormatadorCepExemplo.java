public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try{
            String cepFormatado = formartarCep("2376506");
            System.out.println(cepFormatado);
        }
        catch (CepInvalidoExcecao e){
            System.out.println("O cep não corresponde com as regras de negócio");
        }
    }
    static String formartarCep (String cep) throws CepInvalidoExcecao{
        if (cep.length() != 8)
            throw new CepInvalidoExcecao();

        return "23.765-064";
    }
}
