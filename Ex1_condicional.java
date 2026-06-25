import java.util.Scanner;
public class Ex1_condicional {

	public static void main(String[] args) {
		Scanner en = new Scanner (System.in);
		
		System.out.print("Digite a nota do aluno (0 a 10): ");
		double nota = en.nextDouble();
		
		if (nota >= 7.0) {
			System.out.print("Aluno aprovado!!");
		}else {
			System.out.print("Aluno reprovado");
		}
		en.close();
	}

}