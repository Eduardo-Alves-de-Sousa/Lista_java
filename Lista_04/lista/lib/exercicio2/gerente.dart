import 'package:lista/exercicio2/empregado.dart';

// Classe Gerente que herda de Empregado
class Gerente extends Empregado {
  String _nomeGerencia;

  // Construtor da classe Gerente com parâmetros para nome da gerência, nome, idade, sexo, salário e matrícula
  Gerente(this._nomeGerencia, String nome, int idade, String sexo,
      double salario, String matricula)
      : super(salario, matricula, nome, idade, sexo);

  // Getter para obter o nome da gerência
  String get nomeGerencia => _nomeGerencia;

  // Setter para definir o nome da gerência
  set nomeGerencia(String nomeGerencia) => _nomeGerencia = nomeGerencia;

  // Método para calcular o valor do INSS do gerente
  double valorInssGerente() {
    return salario * 0.11;
  }

  @override
  String toString() {
    return 'Nome: $nome, Idade: $idade, Matrícula: $matricula, Nome da Gerência: $_nomeGerencia, Valor do INSS: ${valorInssGerente()}';
  }
}
