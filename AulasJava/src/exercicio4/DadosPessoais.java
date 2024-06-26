package exercicio4;

public class DadosPessoais {
	private String nome;
	private String endereco;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private String telefone;
	
	public DadosPessoais (String nome, String endereco, String bairro, String cidade, String estado, String cep, String telefone) {
		setNome(nome);
		setEndereco(endereco);
		setBairro(bairro);
		setCidade(cidade);
		setEstado(estado);
		setCep(cep);
		setTelefone(telefone);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}

