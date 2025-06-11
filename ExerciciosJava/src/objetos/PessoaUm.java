package objetos;

import interfaces.IPessoaOPP;

public class PessoaUm {
    public static void main(String[] args) {
        IPessoaOPP pessoa = new IPessoaOPP() {
            @Override
            public String getNome() {
                return "Weldson";
            }

            @Override
            public String getDataNascimento() {
                return "01/01/1990";
            }

            @Override
            public double getAltura() {
                return 1.75;
            }

            @Override
            public double getPeso() {
                return 70.0;
            }
        };
        // Exibindo as informações da pessoa
        pessoa.exibirInformacoes();// Chama o método para exibir as informações
    }
}