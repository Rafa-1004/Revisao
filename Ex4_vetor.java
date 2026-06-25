import java.util.Scanner;
public class Ex4_vetor {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		String[] al = new String[4];
		
		for(int i = 0; i < al.length; i++) {
			System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
			al[i] = ent.nextLine();
		}
		
		System.out.println("\nLista de alunos cadastrados: ");
		for (int i = 0; i < al.length; i++) {
			System.out.println("Posição " + i + ": " + al[i]);
			
		}
		ent.close();
			
	}

}
