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
		
		String template_alunos_notas = "";
		
		for (int aluno = 0; aluno < qtd_alunos; aluno++) {
			System.out.println("Qual o nome do aluno " + aluno + "?");
			String aluno_nome = sc.next();
			
			template_alunos_notas += "ALUNO: " + aluno_nome + ": \n\n";
			
			double media = -1;
			String status = "";
			
			for(int index_nota = 1; index_nota <= qtd_provas; index_nota++) {
				System.out.println("Digite a nota " + index_nota + " do(a) " + aluno_nome + ":");	
				double nota = sc.nextDouble();
				template_alunos_notas += "	PROVA: " + index_nota + " NOTA: " + nota + "; \n";
				
				if(media==-1) {
					media = nota;
					continue;
				}else {
					media = (media + nota)/2;
				}
			}
			
			if(media>=7) {
				status = "APROVADO(a)";
			}else if(media >= 5){
				status = "EM EXAME";
			}else {
				status = "REPROVADO(a)";
			}
			
			template_alunos_notas += "\n	STATUS FINAL: " + status + ". MÉDIA: " + media + "\n\n";
		}
		
		String header = "Pf. " + nome_professor + " | turma " + sigla + " | " + materia + " | " + qtd_alunos + " alunos | " + qtd_provas + " provas";
		System.out.println("--- Relatório ---");
		System.out.println(header);
		System.out.println(template_alunos_notas);
	}

}
