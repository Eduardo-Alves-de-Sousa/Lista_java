import 'package:lista/exercicio2/cliente.dart';
import 'package:lista/exercicio2/gerente.dart';
import 'package:lista/exercicio2/vendendor.dart';

void main() {
  // Criar uma instância de Cliente
  Cliente cliente = Cliente('João', 25, 'Masculino', 1500.0, 1998);
  print('\nInformações do Cliente:');
  print(cliente);
  // Criar uma instância de Gerente
  Gerente gerente =
      Gerente('Recursos Humanos', 'Alice', 35, 'Feminino', 6000.0, 'G1234');
  print('\nInformações do Gerente:');
  print(gerente);

  // Criar uma instância de Vendedor
  Vendedor vendedor =
      Vendedor(5000.0, 10, 'Maria', 30, 'Feminino', 2500.0, 'V1234');
  print('\nInformações do Vendedor:');
  print(vendedor);
}
