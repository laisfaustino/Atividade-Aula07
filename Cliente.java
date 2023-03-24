package exercio1aula07;



public class Cliente {

	
	private String nome;
	private String cpf;
	private String email;
	private String endereco;
	private String telefone;
	
	public Cliente(String nome, String cpf, String email, String endereco, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void visualizar() {
		System.out.println("\n********************");
		System.out.println("   Dados do Cliente"   );
		System.out.println("\n********************");
		System.out.println("\nNome:" + this.nome);
		System.out.println("\nCPF:" + this.cpf);
		System.out.println("\nE-mail:" + this.email);
		System.out.println("\nEndereço:" + this.endereco);
		System.out.println("\nTelefone:" + this.telefone);
		
}
}
