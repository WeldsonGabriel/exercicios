package interfaces;

public abstract class IPessoaOPP {
// quero exporta nome , data de nacimento, altura , peso .
    public abstract String getNome();
    public abstract String getDataNascimento();
    public abstract double getAltura();
    public abstract double getPeso();

    // Método para exibir informações da pessoa
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Altura: " + getAltura() + " m");
        System.out.println("Peso: " + getPeso() + " kg");
    }
}

