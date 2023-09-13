package Lista_03;
/**Crie uma classe Pessoa em Java que:
a) contenha os atributos nome, idade e altura, peso.
b) encapsule os atributos.
c) Crie os métodos gets e sets para todos os atributos.
d) Crie um método que calcule e retorne o IMC.
e) Crie um método que imprime todos os dados de uma pessoa, inclusive o seu IMC.
f) Crie uma classe de teste que contenha o método main e em seguida utilize a classe Pessoa
criando um objeto e altere os valores dos atributos nome, idade, altura e peso através do
método set e ao final:
i) Imprima os valores dos atributos da classe pessoa através do método get.
ii) Chamar o método que calcula o IMC e imprimir o valor retornado.
iii) Chamar o método imprime, que imprime todas os dados de uma pessoa.  */
public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    // Construtor
    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    // Métodos getters e setters para todos os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Método para calcular o IMC
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    // Método para imprimir todos os dados de uma pessoa, incluindo o IMC
    public void imprimeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("IMC: " + calcularIMC());
    }
}
