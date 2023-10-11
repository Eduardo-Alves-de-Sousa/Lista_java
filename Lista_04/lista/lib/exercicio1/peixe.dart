import 'animal.dart';

// Definindo os tipos de habitat para um peixe.
enum TipoHabitat { aguaDoce, aguaSalgada, ornamental, outro }

class Peixe extends Animal {
  TipoHabitat _tipoHabitat;

  // Construtor da classe Peixe que recebe nome, peso e tipo de habitat.
  Peixe(String nome, double peso, this._tipoHabitat) : super(nome, peso);

  // Getter para o tipo de habitat do peixe.
  // ignore: unnecessary_getters_setters
  TipoHabitat get tipoHabitat => _tipoHabitat;

  // Setter para o tipo de habitat do peixe.
  set tipoHabitat(TipoHabitat habitat) => _tipoHabitat = habitat;

  @override
  String toString() {
    // Sobrescrevendo o método toString para exibir informações do Peixe.
    String habitatString;
    switch (_tipoHabitat) {
      case TipoHabitat.aguaDoce:
        habitatString = 'Água Doce';
        break;
      case TipoHabitat.aguaSalgada:
        habitatString = 'Água Salgada';
        break;
      case TipoHabitat.ornamental:
        habitatString = 'Ornamental';
        break;
      case TipoHabitat.outro:
        habitatString = 'Outro';
        break;
    }
    return 'Nome: $nome, Peso: $peso, Tipo de Habitat: $habitatString';
  }
}
