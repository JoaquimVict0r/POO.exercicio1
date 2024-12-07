import java.util.Scanner;
public class Cadastro {

    String nome;
    char genero;
    int idade;
    double altura;

    void cadastrar() {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite seu nome");
        nome = sc.nextLine();
        System.out.println("Digite seu genero, F ou M");
        genero = sc.next().charAt(0);
        System.out.println("Digite sua idade");
        idade = sc.nextInt();
        System.out.println("Digite sua altura");
        altura = sc.nextDouble();

    }
    void exibirCadastro(){
        System.out.println("Nome : " + nome);
        System.out.println("Genero : " + genero);
        System.out.println("Idade : " + idade);
        System.out.println("Altura : " + altura + "\n");

    }
}
