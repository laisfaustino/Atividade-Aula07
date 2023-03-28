package Curso;

public class Especializacao extends Curso {

	private String especializacao;

	public Especializacao(String nome, int area, String curso, double duracao, int pagamento, String especializacao) {
		super(nome, area, curso, duracao, pagamento);
		this.especializacao = especializacao;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	
	public void vizualizar() {
		super.visualizar();
		System.out.println("Especializações: " + this.especializacao);
}
}