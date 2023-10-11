import 'animal.dart';

class Cachorro extends Animal {
  String _raca;

  // Construtor da classe Cachorro que recebe nome, peso e raça.
  Cachorro(String nome, double peso, this._raca) : super(nome, peso);

  // Getter para a raça
  // ignore: unnecessary_getters_setters
  String get raca => _raca;

  // Setter para a raça
  set raca(String raca) => _raca = raca;

  @override
  String toString() {
    // Sobrescrevendo o método toString para exibir informações do Cachorro.
    return 'Nome: $nome, Peso: $peso, Raça: $_raca';
  }
}
