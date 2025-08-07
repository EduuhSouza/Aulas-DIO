package exercicios1;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Nome {
    public static void main(String[] args) {
        int anoAtual = OffsetDateTime.now().getYear();

        Scanner leitura = new Scanner(System.in);
        System.out.println("Escreva seu nome");
        String nome = leitura.next();

        System.out.println("Informe sua data de nascimento");
        int anoNascimento = leitura.nextInt();
        int ano = anoAtual - anoNascimento;

        System.out.printf("Seu nome é %s, você tem %s anos\n", nome, ano);


    }

}
