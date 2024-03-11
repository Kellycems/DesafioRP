import java.util.Scanner;

public class Questão5 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Lê a palavra do terminal
        System.out.println("Digite uma palavra: ");
        String palavra = teclado.nextLine();
        teclado.close();

        //Chama funcionalidade de reverter a palavra
        String palavraRevertida = revertePalavra(palavra);
        System.out.println(palavraRevertida);

        
    }

    public static String revertePalavra(String palavra){
        char[] caracteres = palavra.toCharArray();
        int inicio = 0;
        int fim = caracteres.length -1;
        String palavraInvertida;


        //Enquanto o inicio for menor do que o fim, troca a letra da posicao inicial com a letra da posicao final
        while(inicio < fim){
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            inicio ++;
            fim --;
        }

        //Cria a palavra invertida e retorna ela 
        palavraInvertida = new String(caracteres); 
        return palavraInvertida;
    }
}
