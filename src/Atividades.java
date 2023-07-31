import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.Double.parseDouble;

public class Atividades {

    private static final Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

    public static void Atividade2(Scanner scanner) {
    /*
     Atividade 2
     Faça um programa que receba 2 valores e retorne o maior entre eles.
     */
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("\nEscreva o Primeiro Valor");
        String variavelA = scanner.next();
        if (!isNumeric(variavelA))
            System.out.println("Escreva um valor Valido! Encerrando o programa");
        else {
            System.out.println("Escreva o Segundo Valor");
            String variavelB = scanner.next();
            if (!isNumeric(variavelB))
                System.out.println("Escreva um valor Valido! Encerrando o programa");
            else {
                if (parseDouble(variavelA) > parseDouble(variavelB))
                    System.out.println(variavelA + "é maior que " + variavelB);
                else
                    System.out.println(variavelB + "é maior que " + variavelA);
            }
        }
    }

    public static void Atividade3(Scanner scanner) {
        /* Atividade 3
           Crie uma classe e na função main() implemente um programa que lê um número inteiro do teclado e imprime todos os números
           primos menores que ele (divisíveis por 1 ou por ele mesmo).
        */
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("\nEscreva o Primeiro Valor");
        String variavelA = scanner.next();
        if (!isNumeric(variavelA))
            System.out.println("Escreva um valor Valido! Encerrando o programa");
        else {
            if (Integer.parseInt(variavelA) == 2) {
                System.out.println("2 é um numero primo");
            } else {
                for (int i = Integer.parseInt(variavelA); i >= 2; i--) {
                    boolean isPrimo = true;
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0)
                            isPrimo = false;
                    }
                    if (isPrimo) {
                        System.out.println(i);
                    }
                }
            }
        }
    }

    public static void Atividade4(Scanner scanner) {
        /* Atividade 4
           Pretende-se escrever um programa que leia do teclado uma distância expressa em milhas, converte-a para quilômetros
           e apresenta o resultado no console. (fórmula de conversão: 1 milha = 1.609 km).
        */

        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("\nEscreva o Valor de Milhas");
        String variavelA = scanner.next();
        if (!isNumeric(variavelA))
            System.out.println("Escreva um valor Valido! Encerrando o programa");
        else {
            double milhas = parseDouble(variavelA);
            double kilometers = milhas * 1.609;
            System.out.println(milhas + " milhas equivalem a " + kilometers + "Km");
        }


    }

    public static void Atividade5(Scanner scanner) {
        /*
        Atividade 5
        Faça um programa que solicite ao usuário um número de 1 a 7, e imprima na tela o dia da semana correspondente.
        Suponha que Segunda corresponde a 1 , Terça corresponde a 2, e assim por diante. Utilizando Array.
        */
        System.out.println(new Object() {}.getClass().getEnclosingMethod().getName());
        String[] DiasSemanas = {"Segunda","Terca","Quarta","Quinta","Sexta","Sabado","Domingo"};
        System.out.println("Escolha De 1 a 7: ");
        String atividade = scanner.next();
        if (isNumeric(atividade)) {
            int escolha = Integer.parseInt(atividade);
            if (escolha < 1 || escolha > 7) {
                System.out.println("Escolha uma Opção valida");
            } else {
                System.out.println("O dia escolhido foi : "+ DiasSemanas[escolha-1]);
            }
        }
    }

    public static void Atividade6(){
         /*
        Atividade 6
         Imprima produto dos números de ímpares de 15 a 30, usando os tipos de dados int e float.
        */
        System.out.println(new Object() {}.getClass().getEnclosingMethod().getName());
        System.out.println("Imprindo produto dos numeros");
        float produto = 15f;
        for (int i = 15; i< 30; i++) {
            if (i % 2 != 0){
                System.out.println(i+"x"+ produto + "= "+ (produto*i));
                produto = produto*i;
            }
        }
    }

    public static void Atividade7() {
        /*
        Atividade 7

        Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e 100,
        usando os tipos de dados int e double .

        */
        System.out.println(new Object() {}.getClass().getEnclosingMethod().getName());

        for (double i = 1; i< 100; i++){
            if(i % 3 == 0){
                double divisao = i/2;
                System.out.println(i + " divido por 2 é igual a " + divisao);
            }
        }

    }

    public static void Atividade8(Scanner scanner){
        /*
        Atividade 8

        Criar uma classe Java que receba uma palavra (String) retorne uma mensagem caso a
        palavra fornecida seja uma palavra que pode ser lida da esquerda pra direita ou da direita pra
        esquerda obtendo-se a mesma palavra. Ex.: Ana, arara, osso, etc.

        */
        System.out.println(new Object() {}.getClass().getEnclosingMethod().getName());

        System.out.println("\nEscreva a palavra");
        boolean palindro = true;
        String texto = scanner.next();
        String clean = texto.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                palindro = false;

        }
        if (palindro){
            System.out.println(texto + " é uma palavra Palindroma");
        }else {
            System.out.println("\nNão é Palindromo");
        }

    }

    public static void Atividade9(Scanner scanner) {
        /*
        Atividade 9

         Escreva uma classe para calcular a área de um círculo, sabendo que a área é A = PI * r2, onde o raio (r) deve
         ser informado pelo usuário e o resultado terá que ser arredondado.


        */
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());

        System.out.println("\nEscreva o Valor do raio");
        String variavelA = scanner.next();
        if (!isNumeric(variavelA))
            System.out.println("Escreva um valor Valido! Encerrando o programa");
        else {
            double raio = Double.parseDouble(variavelA);
            double area = Math.PI* Math.pow(raio, 2);
            System.out.println("O raio da area é de: " + area);
        }
    }

    public static void Atividade10(Scanner scanner) {
        /*
        Atividade 10
         Escreva uma classe que conte a quantidade de vogais, espaços em brancos e consoantes de uma cadeia de caracteres.
        */
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        int contadorVogal = 0, contadorConsoante = 0, branco =0;
        String str = scanner.nextLine().toLowerCase();
        String vogais = "aeiou";

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'a' & str.charAt(i) <= 'z') || str.charAt(i) == 0) {
                if (vogais.indexOf(str.charAt(i)) != -1)
                    contadorVogal++;
                else
                    contadorConsoante++;

                if(str.charAt(i) == ' '){
                    branco++;
                }
            }
        }
        System.out.println("Vogais = " + contadorVogal
                + "\nConsoantes  = "
                + contadorConsoante + "\nEm Branco= "+branco);

    }

    public static void Atividade11(Scanner scanner) {
        /*
        Atividade 11
         Escreva um programa que tenha duas palavras como entrada, e a saída imprima as palavras em ordem alfabética
         (utilize o método compareTo da classe String),. Informe também, qual das palavras tem o maior número de caracteres.
         */
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Escreva a Primeira Palavra: ");
        String primeira = scanner.next();
        System.out.println("Escreva a Segunda Palavra: ");
        String segunda = scanner.next();
        String maior;
        if(primeira.length()> segunda.length()){
            maior = primeira +" Tem mais caracteres que a segunda, exatos " + primeira.length() +
                    "\n Enquanto a segunda : "+segunda+ " tem "+ segunda.length() ;
        }else {
            maior = segunda +" Tem mais caracteres que a primeira, exatos " + segunda.length() +
                    "\n Enquanto a primeira : "+primeira+ " tem "+ primeira.length() ;
        }

        if(primeira.charAt(0) <segunda.charAt(0)){
            System.out.println("Em Ordem Alfabetica\n"+primeira+ "\n"+ segunda+ "\n"+ maior);

        }else{
            System.out.println("Em Ordem Alfabetica\n"+segunda+ "\n"+ primeira+ "\n"+ maior);
        }


    }

    public static void Atividade12(Scanner scanner) {
        /*
        Atividade 12
         Os motoristas se preocupam com a quilometragem obtida por seus automóveis. Um motorista monitorou vários
         tanques cheios de gasolina registrando a quilometragem dirigida e a quantidade de combustível em litros
         utilizados para cada tanque cheio. Desenvolva um aplicativo Java que receba como entrada os quilômetros
         dirigidos e os litros de gasolina consumidos (ambos com inteiros) para cada tanque cheio. O programa deve
         calcular e exibir o consumo em quilômetros/litro para cada tanque cheio e imprimir a quilometragem combinada
         e a soma total de litros de combustível consumidos até esse ponto. Todos os cálculos de média devem produzir
         resultados de ponto flutuante.

          */
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        System.out.println("Digite a Quantidade de Tanques");
        String tanques = scanner.next();
        int Km = 0, litros = 0;
        if (!isNumeric(tanques))
            System.out.println("Escreva um valor Valido! Encerrando o programa");
        else {
            for(int i = 1;i<=Integer.parseInt(tanques); i++ ){
                System.out.println("Digite a Quantidade de KM rodados no tanque numero " + i);
                int amostragem = scanner.nextInt();
                Km += amostragem;
                System.out.println("Digite a Quantidade de Litros Gastos no tanque numero " + i);
                int litragem = scanner.nextInt();
                litros += litragem;
                double mediaAmostra = amostragem/litragem;
                System.out.println("O tanque numero " + i + " Utilizou se de " +litragem+ " litros de gasolina, para rodar "
                        + amostragem + " KM "+ "conusmindo em media "+ mediaAmostra + "Km Por Litro");
            }
            double media = Km/litros;
            System.out.println("Ao final, todos os tanques consumiram " + litros + " Litros, rodando " + Km+" Km, dando em media " + media+ "Km Por Litro");
        }



    }
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }
}
