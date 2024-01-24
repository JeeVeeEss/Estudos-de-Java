public class Hello{
    public static void main(String [] args){
        String BR = "Brasil"; // Variável com todas as letras maiúsculas, por convenção, são contantes
        final String BR_ = "Brasil";
        // As variáveis podem ser declaradas das seguintes formas:
        int numero_um = 10;
        int numero$um = 10; 
        int numeroum = 10;
        int numero1 = 10;

        // Tipos de Variáveis:
        int anoFabricacao = 2020;
        boolean afirmacao = false;

        // Estrutura de um método:
        // TipoRetorno NomeObjetivoInfinitivo Parametro(s)

        String primeiro_nome = "Guilherme";
        String segundo_nome = "Vicente";
        
        String nomeCompleto = nomeCompleto(primeiro_nome, segundo_nome);
        System.out.println(nomeCompleto);

        System.out.println("oba!");
        System.out.print(BR_);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Funcionou: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
