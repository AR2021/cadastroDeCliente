import java.util.Locale;
import java.util.Scanner;

public class CadaastroCliente {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

	
 String nome;
 String cpf;
 String sexo;
 int idade;
 double altura;
 
 
 System.out.println("Informe seu nome:");
 nome = sc.nextLine();
 System.out.println("Infome a inicial do seu sexo (M) (F) : ");
 sexo = sc.nextLine();
 System.out.println("Informe seu CPF: ");
 cpf = sc.nextLine();
 System.out.println("Informe sua Idade:");
 idade = sc.nextInt();
 System.out.println("Qual sua altura ");
 altura = sc.nextDouble();
System.out.println();
System.out.println();
System.out.println ("Nome: " + nome);
System.out.println ("sexo : " + sexo);
System.out.println( "cpf: " + cpf);
System.out.println("idade:" + idade);
System.out.println("altura" + altura); 
System.out.println("Seja ben-vindo!" + nome);

sc.close();


 
	

	}

}
