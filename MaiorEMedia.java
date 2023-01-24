import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        
        int count = 0;

        do { 
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;
            System.out.println("A Soma dos números é: " + soma);

            if (numero > maior) maior = numero;

            count = count + 1;
            
        } while(count < 5);
        int media = soma / count;
        System.out.println("A média dos números é: " + media);
        System.out.println("Maior: " + maior);
    }
    
}
