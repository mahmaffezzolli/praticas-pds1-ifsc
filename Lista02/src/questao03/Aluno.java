package questao03;

public class Aluno extends Pessoa {

	
	public Long matricula;

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public void setDataNasc(String niverAluno) {
		
	} 
	
	public String toString() {
		return "Nome: " + this.getNome() + " //CPF : " + this.getCpf() + " //Nascimento : " + this.getDataNasc() + " //Matricula : " + this.matricula ;}
}