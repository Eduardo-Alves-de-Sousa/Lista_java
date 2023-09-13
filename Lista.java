import java.text.DecimalFormat;
import java.util.Scanner;

class Lista{

    static Scanner aScanner = new Scanner(System.in);
    public static void main(String[] args) {
       //l1_01();
       //l1_02();
       //l1_03();
       //l1_04();
       //l1_05();
       //l1_06();
       //l1_07();
       //l1_08();
       //l1_09();
       //l1_40();
       //l2_01();
    }
    /* Escreva um algoritmo que leia dois números 
    e ao final mostre a soma,2
    subtração, multiplicação e a divisão dos números lidos.*/
    static void l1_01(){
        try (Scanner scanner = new Scanner(System.in)) {
            imprimirMensagem("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();
            imprimirMensagem("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();

            double soma = numero1 + numero2;
            double subtração = numero1 - numero2;
            double multiplicacao = numero1 * numero2;

            double divisao = 0.0;
            if(numero2 != 0){
                divisao = numero1 / numero2;
            }else{
                imprimirMensagem("Não é possivel fazer divisão por zero!");
            }

            imprimirMensagem("A soma é: " + soma);
            imprimirMensagem("A subtração é: " + subtração);
            imprimirMensagem("A multiplicação é: " + multiplicacao);
            imprimirMensagem("A divisão é: " + divisao);
        }
        
    }
    /* Escreva um algoritmo para determinar o consumo médio de um automóvel
    sendo fornecida a distância total percorrida pelo automóvel e o total de
    combustível gasto.*/
    static void l1_02(){
        try (Scanner scanner = new Scanner(System.in)) {
            imprimirMensagem("Digite a distancia percorrida em quilometros: Km");
            double distanciaPercorrida = scanner.nextDouble();
            imprimirMensagem("Digite o total de combustivel em litros: L");
            double combustivelGasto = scanner.nextDouble();

            double consumoMedio = distanciaPercorrida / combustivelGasto;

            imprimirMensagem("O comsumo médio gasto é: " + consumoMedio + " km/L");
        }
    }
    /*Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e 
    o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este
    vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, 
    o salário fixo e salário no final do mês. */
    static void l1_03(){
        try (Scanner scanner = new Scanner(System.in)) {
            imprimirMensagem("Digite seu nome (vendedor): ");
            String nomeVendedor = scanner.nextLine();
            imprimirMensagem("Digite o salário fixo do vendedor: ");
            double salarioFixo = scanner.nextDouble();
            imprimirMensagem("Digite o total de vendas efetuados pelo vendedor (em dinheiro): ");
            double TotalVendas = scanner.nextDouble();

            double comissao = TotalVendas * 0.15;
            double salarioTotal = salarioFixo + comissao;

            imprimirMensagem("O nome do vendedor é: " + nomeVendedor);
            imprimirMensagem("Seu salário fixo é: R$" + salarioFixo);
            imprimirMensagem("Seu salário do mês é: R$" + salarioTotal);
        }
    }
    /* Escreva um algoritmo que leia uma temperatura em graus Celsius e 
    apresentá-la convertida em graus Fahrenheit. A fórmula de conversão 
    é: F = (9*C+160)/5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.*/
    static void l1_04(){
        try (Scanner scanner = new Scanner(System.in)) {
            imprimirMensagem("Digite a temperatura em Celsius: ");
            double temperaturaCelsius = scanner.nextDouble();

            double temperaturaFahrenheit = (9 * temperaturaCelsius + 160) / 5;

            imprimirMensagem("A temperatura de Celsius para Fahrenheit é: " + temperaturaFahrenheit);
        }
    }
    /*Escreva um algoritmo que efetue a apresentação do valor da conversão em 
    real (R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor
    da cotação do dólar e também a quantidade de dólares disponíveis com o usuário. */
    static void l1_05(){
         try (Scanner scanner = new Scanner(System.in)) {
            imprimirMensagem("Digite a cotação do dólar: ");
            double cotacaoDolar = scanner.nextDouble();
            imprimirMensagem("Digite a quantidade de dólar disponivel: ");
            double quantidadeDolar = scanner.nextDouble();

            double valorConversao = cotacaoDolar + quantidadeDolar;

            imprimirMensagem("O valor da conversão em real é: R$" + valorConversao);
         }
    }
    /*Escreva um algoritmo que receba um valor que foi depositado em uma conta
    poupança e exiba o valor com rendimento após um mês. Considere fixo o
    juro da conta poupança em 0,70% a.m. */
    static void l1_06(){
        try (Scanner scanner = new Scanner(System.in)) {
            imprimirMensagem("Digite o valor do deposito na conta poupança: R$");
            double valorDepositado = scanner.nextDouble();

            double taxaJuros = 0.007;

            double valorRendimento = valorDepositado * (1 + taxaJuros);

            imprimirMensagem("O valor com rendimento após um mês é: " + valorRendimento);
        }
    }
    /*A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco)
    prestações sem juros. Faça um algoritmo que receba um valor de uma
    compra e mostre o valor das prestações. */
    static void l1_07(){
        imprimirMensagem("Sistema da loja Mamão com Açucar!");
       //metodo retorna um doble
       double valorDaPrestacao = lerValorPrestacao()/5;
       DecimalFormat df = new DecimalFormat("#,###.00");
       String prestacao = df.format(valorDaPrestacao);
       imprimirMensagem("O valor de cada prestação sera: " + prestacao + "\n");
       imprimirMensagem("tchuss");
    }
    /*Faça um algoritmo que receba o preço de custo de um produto e mostre o
    valor de venda. Sabe-se que o preço de custo receberá um acréscimo de 
    acordo com um percentual informado pelo usuário. */
    static void l1_08(){
         try (Scanner scanner = new Scanner(System.in)) {
            imprimirMensagem("Digite o preço de custo do produto: ");
            double precoCusto = scanner.nextDouble();
            imprimirMensagem("Digite o percentual de acréscimo: ");
            double precentualAcrescimo = scanner.nextDouble();

            double acrecimo = 1 + (precentualAcrescimo / 100);
            double valorVenda = precoCusto * acrecimo;

            imprimirMensagem("O valor de venda do produto com acrescimo sera de : " + valorVenda);
         }    
    }
    /*O custo ao consumidor de um carro novo é a soma do custo de fábrica com
    a percentagem do distribuidor e dos impostos (aplicados, primeiro os impostos 
    sobre o custo de fábrica, e depois a percentagem do distribuidor sobre o resultado). 
    Supondo que a percentagem do distribuidor seja de 28% e os impostos 45%. Escrever um 
    algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo. */
    static void l1_09(){
        try (Scanner scanner = new Scanner(System.in)) {
            imprimirMensagem("Digite o custo de fábrica: ");
            double custoFabrica = scanner.nextDouble();
            //Define o percentual que o distribuidor adiciona ao custo do carro (28%).
            double percentualDistribuidor = 0.28;
            //Define o percentual de imposto (45%).
            double imposto = 0.45;

            // Calcula o valor do imposto baseado no custo de fábrica.
            double valorImposto = custoFabrica * imposto;
            //Calcula o custo ao consumidor somando o custo de fábrica e o valor do imposto.
            double custoConsumidor = custoFabrica + valorImposto;
            //Adiciona ao custo ao consumidor o valor correspondente ao percentual do distribuidor.
            custoConsumidor += custoConsumidor * percentualDistribuidor;

            imprimirMensagem("O custo ao consumidor é: " + custoConsumidor);
        }
    }

    static void l1_40(){
        double um =  lerDouble();
        double dois = lerDouble();
        if(um < dois){
            imprimirMensagem("Segundo é maior.");
        }else if(um > dois){
            imprimirMensagem("Primeiro é maior.");
        }else{
            imprimirMensagem("Números iguais!");
        }
        
    }

    static void l2_01(){
        Lampada nova = new Lampada();
        imprimirMensagem(nova.observa());
        nova.liga();
        imprimirMensagem(nova.observa());
        nova.desliga();
        imprimirMensagem(nova.observa());
    }

    static double lerValorPrestacao(){
        //essa variavel valor só tem valor dentro deste escopo/ deste metodo234,56
        double valor = 0.0;
        System.out.println("Digite o valor da compra: ");
        valor = lerDouble();
        return valor;
    }

    static double lerDouble(){
        return aScanner.nextDouble();
    }

    static void imprimirMensagem(String mensagem){
        System.out.println(mensagem);

    }
}

