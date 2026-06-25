import java.util.Scanner;
public class Ex3_laços {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int cont = 1;
		
		while (cont == 1) {
			double soma = 0;
			
			for(int i = 1; i <= 3; i++) {
				System.out.println("Digite a nota " + i + ": ");
				soma += ent.nextDouble();
			}
			double med = soma/3;
			System.out.println("A média das notas é: " + med);
			
			System.out.print("Deseja calcular outra média? (1 - sim / 2 - não): ");
			cont = ent.nextInt();
			
		}
		System.out.println("Programa encerrado");
	}

}
