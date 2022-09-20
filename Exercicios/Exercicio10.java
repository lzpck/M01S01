import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio10 {

    // DESCOBRINDO A IDADE DO USUÁRIO
    public static void main(String[] args) {
        System.out.print("Digite o ano de nascimento: ");
        Scanner scanner = new Scanner(System.in);
        int anoNasc = scanner.nextInt();
        LocalDate hoje = LocalDate.now();
        int anoAtual = hoje.getYear();
        int idadeCalculada = anoAtual - anoNasc;

        System.out.println("A idade calculada é: " + idadeCalculada);
    }
}