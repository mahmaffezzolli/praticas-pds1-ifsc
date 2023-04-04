package questao03;

public class Professor extends Pessoa {

	public Long siape;

	public Long getSiape() {
		return siape;
	}

	public void setSiape(Long siape) {
		this.siape = siape;
	}
	
	
    public String toString() {
    	return "Nome: " + this.getNome() + " //CPF : " + this.getCpf() + " //Nascimento : " + this.getDataNasc() + " //Siape : " + this.siape ;
}

	public void setDataNasc(String text) {
		// TODO Auto-generated method stub
		
	}

	
    }
	

