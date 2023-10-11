class Animal {
  // Atributos encapsulados: nome e peso
  String _nome;
  double _peso;

  // Construtor da classe
  Animal(this._nome, this._peso);

  // Getter para o nome
  // ignore: unnecessary_getters_setters
  String get nome => _nome;

  // Setter para o nome
  set nome(String nome) => _nome = nome;

  // Getter para o peso
  // ignore: unnecessary_getters_setters
  double get peso => _peso;

  // Setter para o peso
  set peso(double peso) => _peso = peso;
}
