package exercio03;

import java.time.LocalDate;

public class Produto {
	
	private int id;
	private String nome;
	private int versao;
	private String prdutora;
	private LocalDate dataLancamento;
	private int preco;
	
	public Produto(int id, String nome, int versao, String prdutora, LocalDate dataLancamento, int preco) {
		this.id = id;
		this.nome = nome;
		this.versao = versao;
		this.prdutora = prdutora;
		this.dataLancamento = dataLancamento;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVersao() {
		return versao;
	}

	public void setVersao(int versao) {
		this.versao = versao;
	}

	public String getPrdutora() {
		return prdutora;
	}

	public void setPrdutora(String prdutora) {
		this.prdutora = prdutora;
	}

	public LocalDate getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(LocalDate dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	public void visualizar() {
		System.out.println("\n********************");
		System.out.println("Dados do Produtor");
		System.out.println("\n********************");
		System.out.println("\nID:" + this.id);
		System.out.println("\nNome:" + this.nome);
		System.out.println("\nVersão:" + this.versao);
		System.out.println("\nProdutora:" + this.prdutora);
		System.out.println("\nData de Lançamento:" + this.dataLancamento);
		System.out.println("\nProdutora:" + this.preco);
		
	}
}
