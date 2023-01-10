import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //Instanciando um objeto Scanner
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = leia.nextLine();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = leia.nextLine();

        System.out.println("Digite sua idade:");
        int idade = leia.nextInt();

        System.out.println("Digite sua altura:");
        double altura = leia.nextDouble();

        System.out.println("Olá, meu nome é "+ nome + " " + sobrenome);
        System.out.println("Minha idade é " + idade);
        System.out.println("Minha altura é: " + altura);
        
    }
    
}
