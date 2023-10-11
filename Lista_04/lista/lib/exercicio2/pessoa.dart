class Pessoa {
  String _nome;
  int _idade;
  String _sexo;

  // Construtor da classe Pessoa com parâmetros para nome, idade e sexo
  Pessoa(this._nome, this._idade, this._sexo);

  // Getter para obter o nome
  String get nome => _nome;

  // Setter para definir o nome
  set nome(String nome) => _nome = nome;

  // Getter para obter a idade
  int get idade => _idade;

  // Setter para definir a idade
  set idade(int idade) => _idade = idade;

  // Getter para obter o sexo
  String get sexo => _sexo;

  // Setter para definir o sexo
  set sexo(String sexo) => _sexo = sexo;
}
