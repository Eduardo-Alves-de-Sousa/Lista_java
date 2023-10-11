import 'package:lista/exercicio2/empregado.dart';

// Classe Vendedor que herda de Empregado
class Vendedor extends Empregado {
  double _valorVendas;
  int _qntVendas;

  // Construtor da classe Vendedor com parâmetros para valor das vendas, quantidade de vendas, nome, idade, sexo, salário e matrícula
  Vendedor(this._valorVendas, this._qntVendas, String nome, int idade,
      String sexo, double salario, String matricula)
      : super(salario, matricula, nome, idade, sexo);

  // Getter para obter o valor das vendas
  double get valorVendas => _valorVendas;

  // Setter para definir o valor das vendas
  set valorVendas(double valorVendas) => _valorVendas = valorVendas;

  // Getter para obter a quantidade de vendas
  int get qntVendas => _qntVendas;

  // Setter para definir a quantidade de vendas
  set qntVendas(int qntVendas) => _qntVendas = qntVendas;

  @override
  String toString() {
    return 'Nome: $nome, Idade: $idade, Matrícula: $matricula, Salário: $salario, Valor das Vendas: $_valorVendas, Quantidade de Vendas: $_qntVendas';
  }
}
