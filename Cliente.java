package aula_pacotes.clientes;

public class Cliente {

	private String nome;
	private int genero;
	private int pagamento;
	
	
	public Cliente(String nome, int genero, int pagamento) {
		this.nome = nome;
		this.genero = genero;
		this.pagamento = pagamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getGenero() {
		return genero;
	}

	public void setGenero(int genero) {
		this.genero = genero;
	}

	public int getPagamento() {
		return pagamento;
	}

	public void setPagamento(int pagamento) {
		this.pagamento = pagamento;
	}
	
public void visualizar() {
		
		String pagamento = "";
		
		switch(this.pagamento) {
		case 1 -> pagamento = "Cartão de Crédito";
		case 2 -> pagamento = "Cartão de Débito";
		case 3 -> pagamento = "Pix";
		case 4 -> pagamento = "Boleto";
		}
		
		String genero = "";
		
		switch(this.genero) {
		case 1 -> genero = "Masculino";
		case 2 -> genero = "Feminino";
		case 3 -> genero = "Não binario";
		case 4 -> genero = "Transgenero";
		case 5 -> genero = "Não dizer";
		
		}
			
		System.out.println("                                      ");
		System.out.println("**************************************");
		System.out.println("           DADOS DO CLIENTE           ");
		System.out.println("**************************************");
		System.out.println("Nome do Cliente: " + this.nome);
		System.out.println("Genêro: " + genero);
		System.out.println("Tipo de Pagamento: " + pagamento);
		System.out.println("**************************************");
		System.out.println("**************************************");
		
	}
	
	
}
