package entities;

import java.util.Scanner;

public class Cursos {

	private Integer quantidade;
	private Integer codAluno;
	
	Scanner sc = new Scanner (System.in);
	
	public Cursos() {
	}
	
	public Cursos(Integer quantidade, Integer codAluno) {
		this.quantidade = quantidade;
		this.codAluno = codAluno;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Integer getCodAluno() {
		return codAluno;
	}

	public void setCodAluno(Integer codAluno) {
		this.codAluno = codAluno;
	}
	
	public void numAlunos(Integer quantidade) {
		for (int i = 0; i < quantidade; i++) {
			System.out.printf("Digite o %d aluno: ", i + 1);
			codAluno = sc.nextInt();
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codAluno == null) ? 0 : codAluno.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cursos other = (Cursos) obj;
		if (codAluno == null) {
			if (other.codAluno != null)
				return false;
		} else if (!codAluno.equals(other.codAluno))
			return false;
		return true;
	}
	
}
