import 'package:lista/exercicio2/pessoa.dart';

// Classe Empregado que herda de Pessoa
class Empregado extends Pessoa {
  double _salario;
  String _matricula;

  // Construtor da classe Empregado com parâmetros para salário, matrícula, nome, idade e sexo
  Empregado(this._salario, this._matricula, String nome, int idade, String sexo)
      : super(nome, idade, sexo);

  // Getter para obter o salário
  double get salario => _salario;

  // Setter para definir o salário
  set salario(double salario) => _salario = salario;

  // Getter para obter a matrícula
  String get matricula => _matricula;

  // Setter para definir a matrícula
  set matricula(String matricula) => _matricula = matricula;

  // Método para calcular o valor do INSS
  double valorInss() {
    return _salario * 0.11;
  }
}
