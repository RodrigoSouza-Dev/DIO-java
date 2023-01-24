import java.util.Scanner;

/*
 * Faça um programa que peça uma nota, entre zero e dez.
 * Mostre uma mensagem caso o valor seja inválido
 * e continue pedindo até que o usuário um valor válido.
 */

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();
        //Se o valor a cima for valido, o while não apresentará nada.
        while(nota < 0 | nota > 10){
            System.out.println("Nota invalida! Digite novamente:");
            nota = scan.nextInt();
        //O progama entra no WHILE e se considerar valido as condições então efetua a ação.
        
        }
    }
}
