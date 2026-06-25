import java.util.Scanner;
public class Ex2_conectores {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite a nota do aluno: ");
		double nota = ent.nextDouble();
		
		System.out.print("Digite a frequência do aluno: ");
		int freq = ent.nextInt();
		
		if (nota >= 7.0 && freq >= 75) {
			System.out.print("Aprovado com sucesso!!");
		}else {
			System.out.print("Reprovado por nota ou falta!");
		}
		ent.close();

	}

}
