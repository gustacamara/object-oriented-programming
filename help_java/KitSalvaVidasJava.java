package help_java;
import java.util.ArrayList;
import java.util.Scanner;

public class KitSalvaVidasJava {
    // ----- Funções -----
    // Função sem retorno que recebe parâmetros
    public void somaValor(int a, int b) {
        int soma = a + b;
        System.out.println("A soma é " + soma);
    }

    // Função que retorna um inteiro e recebe parâmetros
    public int subtraiValor(int a, int b) {
        return a - b;
    }

    // Função que não retorna e nem recebe nada
    public void imprimeNome() {
        System.out.println("Marina");
    }


    public static void main(String[] args) {
        // VARIÁVEIS:
        int inteiro = 1;
        float decimal = 1.5f;
        boolean verdadeiro = true;
        char caractere = 'm';
        String texto = "marina";
        var generico = "Posso ser int, float, boolean, char ou String, sou Genérico";

        // IMPRIMINDO INFORMAÇÕES (print):
        System.out.println("Como eu amo Java!");

        // ----- LENDO INFORMAÇÕES DO TECLADO (input) -----
        Scanner scanner = new Scanner(System.in);
        // Texto (String):
        System.out.println("Digite um nome:");
        String nome = scanner.nextLine();
        System.out.println("O nome digitado foi: " + nome);
        // Número inteiro (int):
        System.out.println("Digite um número inteiro:");
        int numeroInteiro = scanner.nextInt();
        System.out.println("O número inteiro digitado foi: " + numeroInteiro);
        // Número decimal (float):
        System.out.println("Digite um número decimal:");
        float numeroDecimal = scanner.nextFloat();
        System.out.println("O número decimal digitado foi: " + numeroDecimal);
        // Caracteres (char):
        System.out.println("Digite um caracter: ");
        char letra = scanner.next().charAt(0);
        System.out.println("A letra digitada foi: " + letra);

        // COMANDOS CONDICIONAIS
        if(numeroInteiro == 2) {
            System.out.println("O número é 2!");
        }
        else if(numeroInteiro % 2 =! 0 || numeroInteiro > 10) {
            System.out.println("O número é ímpar OU é maior que 10");
        }
        else if(numeroInteiro % 2 == 0 && numeroInteiro <= 0) {
            System.out.println("O número é par E é igual ou menor que 0");
        }
        else {
            System.out.println("Nem sei que número sobrou, mas se não for algum dos 3 primeiros vai imprimir isso aqui");
        }

        // ----- ARRAY (vetor) -----
        // Array de tamanho 5 vazio:
        int[] vetorVazio = new int[5];
        // Array de tamanho 5 preenchido valores inteiros:
        int[] vetorPreenchido = {1, 2, 3, 4, 5};

        // ----- LISTA (list) -----
        ArrayList lista = new ArrayList<>();
        // Adicionando valores na lista
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        // Adicionando valor na lista em um índice específico:
        lista.set(2, 12);
        // Excluindo número da lista pelo índice
        lista.remove(1);
        // Pegando o valor pelo índice:
        System.out.println(lista.get(0));
        // Pegando o índice de um determinado valor:
        lista.indexOf(5);
        // Verificando se a lista está vazia
        lista.isEmpty();

        // ----- Laços de Repetição (Loops) -----
        // While
        int contador = 0;
        System.out.println("----- Imprimindo com While -----");
        while (contador <= 5) {
            System.out.println("Número = " + contador);
            contador++;
            //contador = contador + 1
        }

        // For i
        System.out.println("\n----- Imprimindo com For i -----");
        //(declaração do contador; condição; incremento)
        //for i in range(6):
        for (int i = 0; i <= 5; i++) {
            System.out.println("Número = " + i);
        }

        // For each (para cada)
        System.out.println("\n----- Imprimindo com For Each -----");
        //for numero in lista:
        for (var valor : lista) {
            System.out.println("Número = " + valor);
        }
    }
}