package Lista_03;

public class TestePessoa {
    public static void main(String[] args) {
        // Criar um objeto Pessoa
        Pessoa pessoa = new Pessoa("João", 30, 1.75, 70.5);

        // Alterar os valores dos atributos usando os métodos setters
        pessoa.setNome("Maria");
        pessoa.setIdade(25);
        pessoa.setAltura(1.65);
        pessoa.setPeso(55.0);

        // Imprimir os valores dos atributos usando os métodos getters
        System.out.println("Valores dos atributos da Pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade() + " anos");
        System.out.println("Altura: " + pessoa.getAltura() + " metros");
        System.out.println("Peso: " + pessoa.getPeso() + " kg");

        // Chamar o método que calcula o IMC e imprimir o valor retornado
        double imc = pessoa.calcularIMC();
        System.out.println("IMC: " + imc);

        // Chamar o método que imprime todos os dados da Pessoa
        System.out.println("\nDados da Pessoa:");
        pessoa.imprimeDados();
    }
}
