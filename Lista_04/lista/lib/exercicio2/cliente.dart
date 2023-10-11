import 'package:lista/exercicio2/pessoa.dart';

// Classe Cliente que herda de Pessoa
class Cliente extends Pessoa {
  double _valorDivida;
  int _anoNascim;

  // Construtor da classe Cliente com parâmetros para nome, idade, sexo, valor da dívida e ano de nascimento
  Cliente(
      String nome, int idade, String sexo, this._valorDivida, this._anoNascim)
      : super(nome, idade, sexo);

  // Getter para obter o valor da dívida
  double get valorDivida => _valorDivida;

  // Setter para definir o valor da dívida
  set valorDivida(double valorDivida) => _valorDivida = valorDivida;

  // Getter para obter o ano de nascimento
  int get anoNascim => _anoNascim;

  // Setter para definir o ano de nascimento
  set anoNascim(int anoNascim) => _anoNascim = anoNascim;

  @override
  String toString() {
    return 'Nome: $nome, Idade: $idade, Sexo: $sexo, Valor da Dívida: $_valorDivida, Ano de Nascimento: $_anoNascim';
  }
}
