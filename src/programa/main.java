package programa;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do professor: ");
		String nome_professor = sc.next();
		System.out.println("Digite a sigla da turma: ");
		String sigla = sc.next();
		System.out.println("Digite a matéria: ");
		String materia = sc.next();
		System.out.println("Quantos alunos essa turma tem? ");
		int qtd_alunos = sc.nextInt();
		System.out.println("Quantas avaliações essa turma teve? ");
		int qtd_provas = sc.nextInt();
		for (int aluno = 0; aluno < qtd_alunos; aluno++) {
			System.out.println("Qual o nome do aluno? ");
			String aluno_nome = sc.next();
			double media = 0;
			String status = "";
			for(int index_nota = 0; index_nota < qtd_provas; index_nota++) {
				System.out.println("Digite a nota " + index_nota + " do aluno: ");
				double nota = sc.nextDouble();
				if(media==0) {
					media = nota;
					continue;
				}else {
					media = (media + nota)/2;
				}
				
				if(media>=7) {
					status = "APROVADO";
				}else if(media >= 5){
					status = "EM EXAME";
				}else {
					status = "REPROVADO";
				}
				
				
				
			}
		}

	}

}
