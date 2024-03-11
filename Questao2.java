import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número para verificar se pertence a sequência Fibonacci:");
        int numero = teclado.nextInt();
        teclado.close();
        if (verificaNumero(numero)){
            System.out.println("O número " + numero + " pertence a sequência de Fibonacci.");
        }else{
            System.out.println("O número " + numero + " NÃO pertence a sequência de Fibonacci.");
        }


    }

    public static boolean verificaNumero(int numero){
        int a = 0, b = 1;

        //Percorre todo o array somando os 2 ultimos numeros, enquanto o b for menor que o numero digitado pelo usuário
        while( b < numero){
            int temp = b;
            b = a + b;
            a = temp; 
        }

        if(b == numero){
            return true;
        }
        else{
            return false;
        }
    }
}
