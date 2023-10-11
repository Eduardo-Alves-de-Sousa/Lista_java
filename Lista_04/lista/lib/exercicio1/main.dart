import 'peixe.dart';
import 'cachorro.dart';

void main() {
  // Instância de Peixe
  Peixe peixe = Peixe('Peixinho', 0.5, TipoHabitat.aguaDoce);
  print('Informações do Peixe:');
  print(peixe);

  // Instância de Cachorro
  Cachorro cachorro = Cachorro('Lecy', 12.0, 'Rottweiler');
  print('\nInformações do Cachorro:');
  print(cachorro);

  // Uso dos métodos getters e setters
  print('\nUso dos métodos getters e setters:');
  print('Nome do Peixe: ${peixe.nome}');
  print('Peso do Peixe: ${peixe.peso}');
  print('Tipo de Habitat do Peixe: ${peixe.tipoHabitat}');

  peixe.nome = 'Nemo'; // Alterando o nome do peixe usando o setter
  peixe.peso = 0.3; // Alterando o peso do peixe usando o setter
  peixe.tipoHabitat = TipoHabitat
      .ornamental; // Alterando o tipo de habitat do peixe usando o setter

  print('\nNovas informações do Peixe:');
  print('Nome do Peixe: ${peixe.nome}');
  print('Peso do Peixe: ${peixe.peso}');
  print('Tipo de Habitat do Peixe: ${peixe.tipoHabitat}');
}
