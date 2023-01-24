import java.util.Scanner;

public class ParOuImpar {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();
        
        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0){
                System.out.println(numero + " é par!");
            }else {
                System.out.println(numero + " é impar!");
            }
            
            count = count + 1;

        } while(count < quantNumeros);

    }
}
