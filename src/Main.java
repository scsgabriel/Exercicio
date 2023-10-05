import java.util.Locale;
import java.util.Scanner;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Formatter alturaFormat = new Formatter();
        Scanner sc = new Scanner(System.in);

        //objeto instanciado
        Humano pessoa = new Humano();

        System.out.print("Qual é o nome do humano? ");
        pessoa.setName(sc.nextLine());

        System.out.print("Qual é a idade do humano? ");
        pessoa.setIdade(sc.nextInt());

        System.out.print("Qual é a altura do humano? ");
        pessoa.setAltura(sc.nextFloat());

        System.out.println();

        System.out.println("O nome do humano é: " + pessoa.getName());
        System.out.println("A idade do humano é: " + pessoa.getIdade());
        System.out.println("E a altura do humano é: " + pessoa.getAltura() + "\n");

        System.out.println("Essas são as características da classe Humano.");


    }
}