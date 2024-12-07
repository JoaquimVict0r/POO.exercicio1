import java.util.Scanner;
public class Main {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        Cadastro pessoa = new Cadastro();
        pessoa.cadastrar();
        pessoa.exibirCadastro();

        Cadastro pessoa2 = new Cadastro();
        pessoa2.cadastrar();
        pessoa2.exibirCadastro();

        Cadastro pessoa3 = new Cadastro();
        pessoa3.cadastrar();
        pessoa3.exibirCadastro();

        sc.close();
    }
}